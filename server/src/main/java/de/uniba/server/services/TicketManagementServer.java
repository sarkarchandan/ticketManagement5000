package de.uniba.server.services;

import de.uniba.rz.app.AbstractConnector;
import de.uniba.rz.app.GlobalAppController;
import de.uniba.rz.app.TicketException;
import de.uniba.rz.app.TicketManagement;
import de.uniba.rz.entities.Priority;
import de.uniba.rz.entities.Status;
import de.uniba.rz.entities.Ticket;
import de.uniba.rz.entities.Type;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by chandan
 * On 6/29/16.
 */

/**
 * Service Endpoint
 */

@WebService
public class TicketManagementServer extends AbstractConnector implements Runnable {

	/**
	 * Declaring Logger object to enable logging.
	 */
	private static Logger newLogger = Logger.getLogger(TicketManagementServer.class.getName());

	/**
	 * primaryTicketList has been declared as static as we want this List of
	 * Ticket to be a shared resource among all class methods. This List will be
	 * used for all Ticket related operations.
	 */
	private static List<Ticket> primaryTicketList = new ArrayList<Ticket>();

	/**
	 * Constructor
	 */
	public TicketManagementServer() {
	}

	/**
	 * Method createTicket connects Ticket Management Systems using an instance
	 * of GlobalAppController and creates a new Ticket. Newly created Ticket
	 * will be added to the shared Ticket List.
	 * 
	 * @param ticketContent
	 *            String
	 */
	@WebMethod
	public synchronized String createTicket(@WebParam(name = "ticketContent") String ticketContent) {

		newLogger.setLevel(Level.ALL);
		newLogger.info("Class TicketManagementServer/ Method createTicket: Start Logging");
		Ticket ticket = null;

		if (ticketContent != null) {

			try {
				newLogger.info(
						"Class TicketManagementServer/ Method createTicket: Establishing Connection with the Ticket Management Server");

				GlobalAppController gac = GlobalAppController.getInstance();
				gac.addConnector(this);
				TicketManagement ticketManagementObject = this.getTicketManagement();
				newLogger.info("Class TicketManagementServer/ Method createTicket: Server Connection established");

				newLogger
						.info("Class TicketManagementServer/ Method createTicket: Converting String Content to Ticket object");
				String[] eachTicketPart = ticketContent.split("\\|");
				eachTicketPart[5] = "NEW";
				Ticket newTicket = new Ticket(1, eachTicketPart[0], eachTicketPart[1], eachTicketPart[2],
						Type.valueOf(eachTicketPart[3]), Priority.valueOf(eachTicketPart[4]),
						Status.valueOf(eachTicketPart[5]));

				newLogger.info("Class TicketManagementServer/ Method createTicket: Logging a new ticket");

				ticket = ticketManagementObject.createNewTicket(newTicket);
				primaryTicketList.add(ticket);

			} catch (NullPointerException np) {
				np.getMessage();
			}

		} else {

			newLogger.log(Level.SEVERE,
					"Class TicketManagementServer/ Method createTicket: Parameter newtTicket can not be null");
		}
		newLogger.info("Class TicketManagementServer/ Method createTicket: One Ticket logged");
		newLogger.info("Class TicketManagementServer/ Method createTicket: Done Logging");

		return ("New Ticket with ID: " + ticket.getId() + " has been successfully logged with Ticket Management");
	}

	/**
	 * Method getAllRegisteredTicket returns all registered Tickets as a list of
	 * Tickets.
	 * 
	 * @return List<Ticket>
	 *
	 */
	@WebMethod
	public synchronized List<Ticket> getAllRegisteredTicket() {

		newLogger.setLevel(Level.ALL);
		newLogger.info("Class TicketManagementServer/ Method getAllRegisteredTicket: Start Logging");

		if (primaryTicketList.isEmpty()) {
			newLogger.log(Level.INFO, "No Ticket has been registered with Ticket Management");

		} else

			newLogger.info(
					"Class TicketManagementServer/ Method getAllRegisteredTicket: A list of Registered Ticket objects have been obtained");
		newLogger.info("Class TicketManagementServer/ Method getAllRegisteredTicket: Done Logging");
		return primaryTicketList;
	}

	/**
	 * Method acceptNewTicket validates the ticket id against registered tickets
	 * and upon checking the validity accepts the ticket.
	 * Only a NEW ticket can be ACCEPTED.
	 * 
	 * @param ticketID
	 * @throws TicketNotFoundException
	 */
	@WebMethod
	public synchronized String acceptNewTicket(@WebParam(name = "ticketID") int ticketID){

		newLogger.setLevel(Level.ALL);
		newLogger.info("Class TicketManagementServer/Method acceptNewTicket: Start Logging");

		
		String warningMessage = null;
		if (primaryTicketList.isEmpty()) {

			newLogger.log(Level.SEVERE, "Class TicketManagementServer/Method acceptNewTicket: No registered ticket found");

		} else {

			for (Ticket newTicket : primaryTicketList) {

				if (ticketID == newTicket.getId()) {

					if (newTicket.getStatus() == Status.NEW) {

						
						newTicket.setStatus(Status.ACCEPTED);
						warningMessage = "Your Ticket with ID: " + ticketID + " has been accepted";
						break;

					} else {

						newLogger.log(Level.WARNING,
								"Class TicketManagementServer/Method acceptNewTicket: Inappropriate Ticket Status");
						warningMessage = "Invalid Operation !!! This Ticket can not be accepted as the current ticket status is "+newTicket.getStatus();
						break;
					}

				} else {
					warningMessage = "Invalid ticket ID provided";
					
				}
			}

		}
		newLogger.info("Class TicketManagementServer/Method acceptNewTicket: Done Logging");
		return warningMessage;
	}

	/**
	 * Method closedAcceptedTicket checks the validity of ticketID and then
	 * changes the status of the accepted Ticket to closed.
	 * Only an ACCEPTED ticket can be closed.
	 * 
	 * @param ticketID
	 * @throws TicketNotFoundException
	 */
	@WebMethod
	public synchronized String closeAcceptedTicket(@WebParam(name = "ticketID") int ticketID){

		newLogger.setLevel(Level.ALL);
		newLogger.info("Class TicketManagementServer/Method closeAcceptedTicket: Start Logging");

		
		String warningMessage = null;
		if (primaryTicketList.isEmpty()) {

			newLogger.log(Level.SEVERE, "Class TicketManagementServer/Method closeAcceptedTicket: No registered ticket found");

		} else {

			for (Ticket newTicket : primaryTicketList) {

				if (ticketID == newTicket.getId()) {

					if (newTicket.getStatus() == Status.ACCEPTED) {

						
						newTicket.setStatus(Status.CLOSED);
						warningMessage = "Your Ticket with ID: " + ticketID + " has been closed";
						break;

					} else {

						newLogger.log(Level.WARNING,
								"Class TicketManagementServer/Method closeAcceptedTicket: Inappropriate Ticket Status");
						warningMessage = "Invalid Operation !!! This Ticket can not be closed as the current ticket status is "+newTicket.getStatus();
						break;
					}

				} else {
					warningMessage = "Invalid ticket ID provided";
					
				}
			}

		}
		newLogger.info("Class TicketManagementServer/Method closeAcceptedTicket: Done Logging");
		return warningMessage;
	}

	/**
	 * Method rejectNewTicket checks the validity of a ticket and changes the
	 * status of the NEW ticket to rejected.
	 * Only a NEW ticket can be REJECTED.
	 * 
	 * @param ticketID
	 * @throws TicketNotFoundException
	 */
	@WebMethod
	public synchronized String rejectNewTicket(@WebParam(name = "ticketID") int ticketID){

		newLogger.setLevel(Level.ALL);
		newLogger.info("Class TicketManagementServer/Method rejectNewTicket: Start Logging");

		
		String warningMessage = null;
		if (primaryTicketList.isEmpty()) {

			newLogger.log(Level.SEVERE, "Class TicketManagementServer/Method rejectNewTicket: No registered ticket found");

		} else {

			for (Ticket newTicket : primaryTicketList) {

				if (ticketID == newTicket.getId()) {

					if (newTicket.getStatus() == Status.NEW) {

						
						newTicket.setStatus(Status.REJECTED);
						warningMessage = "Your Ticket with ID: " + ticketID + " has been rejected";
						break;

					} else {

						newLogger.log(Level.WARNING,
								"Class TicketManagementServer/Method rejectNewTicket: Inappropriate Ticket Status");
						warningMessage = "Invalid Operation !!! This Ticket can not be rejected as the current ticket status is "+newTicket.getStatus();
						break;
					}

				} else {
					warningMessage = "Invalid ticket ID provided";
					
				}
			}

		}
		newLogger.info("Class TicketManagementServer/Method rejectNewTicket: Done Logging");
		return warningMessage;
	}

	/**
	 * TODO: Explore why the normal thread implementation is not working. Since
	 * Ticket Management functionality should be thread safe.
	 */
	@Override
	// @WebMethod(exclude=true)
	public void run() {

	}

	@Override
	// @WebMethod(exclude=true)
	public void shutdownConnector() {

	}

}