package de.uniba.search.services;

import de.uniba.server.services.Ticket;
import de.uniba.server.services.TicketManagementServer;
import de.uniba.server.services.TicketNotFoundException_Exception;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Provides customized search functionality for all Tickets
 * Created by chandan On 7/4/16.
 */

/*
 * Service Endpoint
 */

@WebService
public class TicketManagementSearch implements TicketManagementServer{


    /*
     * Enable logging at the class level
     */
    private static Logger newLogger = Logger.getLogger(TicketManagementSearch.class.getName());


    /*
     * Setting up the WSDL Location for server service.
     */
    private String wsdlLocation = "http://ubuntu:8080/m/TicketManagementServerService?wsdl";


    /**
     * Implemented method getAllRegistered Ticket returns the list of al registered tickets.
     * @return List<Ticket>
     */
    @Override
    public List<Ticket> getAllRegisteredTicket() {


        newLogger.setLevel(Level.ALL);
        newLogger.info("Class TicketManagementSearch / Implemented Method getAllRegisteredTicket: Start Logging");

        QName portName;
        List<Ticket> primaryTicketList = null;


        newLogger.info("Class TicketManagementSearch / Implemented Method getAllRegisteredTicket: Establishing connection with server service");
        /**
         * Establishing connection with TicketManagementServer service using the WSDL Location.
         */
        try {
            URL location = new URL(wsdlLocation);
            String namespace = "http://services.server.uniba.de/";
            QName serviceName = new QName(namespace, "TicketManagementServerService");
            // Service service = Service.create(location, serviceName);
            Service service = Service.create(location, serviceName);
            portName = new QName(namespace, "TicketManagementServerPort");
            TicketManagementServer ticketManagerObject = service.getPort(portName, TicketManagementServer.class);

            newLogger.info("Class TicketManagementSearch / Implemented Method getAllRegisteredTicket: server connection established");
            newLogger.info("Trying to fetch the list of tickets");
            primaryTicketList = ticketManagerObject.getAllRegisteredTicket();
        } catch (MalformedURLException m){
            newLogger.log(Level.SEVERE,"Class TicketManagementSearch / Implemented Method getAllRegisteredTicket: Error establishing connection");
            m.getMessage();
        }
        newLogger.info("Class TicketManagementSearch / Implemented Method getAllRegisteredTicket: List of registered tickets obtained");
        newLogger.info("Class TicketManagementSearch / Implemented Method getAllRegisteredTicket: Done logging");
        return primaryTicketList;
    }


    /**
     * Method  getAllRegisteredTicketsByName returns a list of tickets which contain the parameter string in either their Reporter, Topic or Description fields.
     * Method calls PriorityComparator class using java.util.Comparator to implement the sort operation by ticket priority.
     * @param keyName String
     * @return List<Ticket>
     * @throws EmptyListException
     */
    @WebMethod
    public List<Ticket> getAllRegisteredTicketsByName(@WebParam(name = "keyName") String keyName) throws EmptyListException{

        newLogger.setLevel(Level.ALL);
        newLogger.info("Class TicketManagementSearch / Method getAllRegisteredTicketsByName: Start Logging");

        List<Ticket> ticketsFoundByName = new ArrayList<>();

        /**
         * Finding out tickets as per the search criteria and adding them to a list of tickets.
         */
        try {
            for (Ticket eachTicket : getAllRegisteredTicket()) {
                if (eachTicket.getReporter().equals(keyName) || eachTicket.getTopic().equals(keyName) || eachTicket.getDescription().equals(keyName)) {
                    ticketsFoundByName.add(eachTicket);
                }
            }
            if (ticketsFoundByName.isEmpty()) {
                newLogger.log(Level.SEVERE, "Class TicketManagementSearch / Method getAllRegisteredTicketsByName: No Tickets found which satisfies the parameter");
            } else {
                /**
                 * Sorting the newly derived list of tickets as per their priority.
                 */
                Collections.sort(ticketsFoundByName, new PriorityComparator());
            }
        }catch (Exception e){
            throw new EmptyListException();
        }
        newLogger.info("Class TicketManagementSearch / Method getAllRegisteredTicketsByName: Done Logging");

        return ticketsFoundByName;
    }


    /**
     * Method getAllRegisteredTicketsByNameAndType returns a list of tickets using the already filtered list returned by the method  getAllRegisteredTicketsByName and applying further filtering by Type.
     * @param keyName
     * @param keyType
     * @return List<Ticket>
     * @throws EmptyListException
     */
    @WebMethod
    public List<Ticket> getAllRegisteredTicketsByNameAndType(
            @WebParam(name = "keyName") String keyName,
            @WebParam(name = "keyType") String keyType) throws EmptyListException{

        newLogger.setLevel(Level.ALL);
        newLogger.info("Class TicketManagementSearch / Method getAllRegisteredTicketsByNameAndType: Start Logging");

        List<Ticket> ticketsFoundByNameAndType = new ArrayList<>();

        /**
         * Finding out tickets as per the search criteria and adding them to a list of tickets.
         */
        try {
            for (Ticket eachTicket : getAllRegisteredTicketsByName(keyName)) {
            
                if (eachTicket.getType().toString().equals(keyType)) {
                
                    ticketsFoundByNameAndType.add(eachTicket);
                }
            }

            if (ticketsFoundByNameAndType.isEmpty()){
                newLogger.log(Level.SEVERE,"Class TicketManagementSearch / Method getAllRegisteredTicketsByNameAndType: No Tickets found which satisfies the parameters");
            }

        }catch (Exception e){
            throw new EmptyListException();
        }

        newLogger.info("Class TicketManagementSearch / Method getAllRegisteredTicketsByNameAndType: Done Logging");
     return ticketsFoundByNameAndType;
    }





    @Override
    @WebMethod(exclude=true)
    public String acceptNewTicket(int ticketID) throws TicketNotFoundException_Exception {
        return null;
    }

    @Override
    @WebMethod(exclude=true)
    public String closeAcceptedTicket(int ticketID) throws TicketNotFoundException_Exception {
        return null;
    }

    @Override
    @WebMethod(exclude=true)
    public String rejectNewTicket(int ticketID) throws TicketNotFoundException_Exception {
        return null;
    }

    @Override
    @WebMethod(exclude=true)
    public void shutdownConnector() {

    }

    @Override
    @WebMethod(exclude=true)
    public String createTicket(String ticketContent) {
        return null;
    }

    @Override
    @WebMethod(exclude=true)
    public void run() {

    }
}
