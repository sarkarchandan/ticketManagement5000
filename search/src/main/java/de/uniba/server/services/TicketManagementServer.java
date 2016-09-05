
package de.uniba.server.services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TicketManagementServer", targetNamespace = "http://services.server.uniba.de/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TicketManagementServer {


    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "run", targetNamespace = "http://services.server.uniba.de/", className = "de.uniba.server.services.Run")
    @ResponseWrapper(localName = "runResponse", targetNamespace = "http://services.server.uniba.de/", className = "de.uniba.server.services.RunResponse")
    @Action(input = "http://services.server.uniba.de/TicketManagementServer/runRequest", output = "http://services.server.uniba.de/TicketManagementServer/runResponse")
    public void run();

    /**
     * 
     * @param ticketID
     * @return
     *     returns java.lang.String
     * @throws TicketNotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "acceptNewTicket", targetNamespace = "http://services.server.uniba.de/", className = "de.uniba.server.services.AcceptNewTicket")
    @ResponseWrapper(localName = "acceptNewTicketResponse", targetNamespace = "http://services.server.uniba.de/", className = "de.uniba.server.services.AcceptNewTicketResponse")
    @Action(input = "http://services.server.uniba.de/TicketManagementServer/acceptNewTicketRequest", output = "http://services.server.uniba.de/TicketManagementServer/acceptNewTicketResponse", fault = {
        @FaultAction(className = TicketNotFoundException_Exception.class, value = "http://services.server.uniba.de/TicketManagementServer/acceptNewTicket/Fault/TicketNotFoundException")
    })
    public String acceptNewTicket(
        @WebParam(name = "ticketID", targetNamespace = "")
        int ticketID)
        throws TicketNotFoundException_Exception
    ;

    /**
     * 
     * @param ticketContent
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createTicket", targetNamespace = "http://services.server.uniba.de/", className = "de.uniba.server.services.CreateTicket")
    @ResponseWrapper(localName = "createTicketResponse", targetNamespace = "http://services.server.uniba.de/", className = "de.uniba.server.services.CreateTicketResponse")
    @Action(input = "http://services.server.uniba.de/TicketManagementServer/createTicketRequest", output = "http://services.server.uniba.de/TicketManagementServer/createTicketResponse")
    public String createTicket(
        @WebParam(name = "ticketContent", targetNamespace = "")
        String ticketContent);

    /**
     * 
     * @param ticketID
     * @return
     *     returns java.lang.String
     * @throws TicketNotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "rejectNewTicket", targetNamespace = "http://services.server.uniba.de/", className = "de.uniba.server.services.RejectNewTicket")
    @ResponseWrapper(localName = "rejectNewTicketResponse", targetNamespace = "http://services.server.uniba.de/", className = "de.uniba.server.services.RejectNewTicketResponse")
    @Action(input = "http://services.server.uniba.de/TicketManagementServer/rejectNewTicketRequest", output = "http://services.server.uniba.de/TicketManagementServer/rejectNewTicketResponse", fault = {
        @FaultAction(className = TicketNotFoundException_Exception.class, value = "http://services.server.uniba.de/TicketManagementServer/rejectNewTicket/Fault/TicketNotFoundException")
    })
    public String rejectNewTicket(
        @WebParam(name = "ticketID", targetNamespace = "")
        int ticketID)
        throws TicketNotFoundException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<de.uniba.server.services.Ticket>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllRegisteredTicket", targetNamespace = "http://services.server.uniba.de/", className = "de.uniba.server.services.GetAllRegisteredTicket")
    @ResponseWrapper(localName = "getAllRegisteredTicketResponse", targetNamespace = "http://services.server.uniba.de/", className = "de.uniba.server.services.GetAllRegisteredTicketResponse")
    @Action(input = "http://services.server.uniba.de/TicketManagementServer/getAllRegisteredTicketRequest", output = "http://services.server.uniba.de/TicketManagementServer/getAllRegisteredTicketResponse")
    public List<Ticket> getAllRegisteredTicket();

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "shutdownConnector", targetNamespace = "http://services.server.uniba.de/", className = "de.uniba.server.services.ShutdownConnector")
    @ResponseWrapper(localName = "shutdownConnectorResponse", targetNamespace = "http://services.server.uniba.de/", className = "de.uniba.server.services.ShutdownConnectorResponse")
    @Action(input = "http://services.server.uniba.de/TicketManagementServer/shutdownConnectorRequest", output = "http://services.server.uniba.de/TicketManagementServer/shutdownConnectorResponse")
    public void shutdownConnector();

    /**
     * 
     * @param ticketID
     * @return
     *     returns java.lang.String
     * @throws TicketNotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "closeAcceptedTicket", targetNamespace = "http://services.server.uniba.de/", className = "de.uniba.server.services.CloseAcceptedTicket")
    @ResponseWrapper(localName = "closeAcceptedTicketResponse", targetNamespace = "http://services.server.uniba.de/", className = "de.uniba.server.services.CloseAcceptedTicketResponse")
    @Action(input = "http://services.server.uniba.de/TicketManagementServer/closeAcceptedTicketRequest", output = "http://services.server.uniba.de/TicketManagementServer/closeAcceptedTicketResponse", fault = {
        @FaultAction(className = TicketNotFoundException_Exception.class, value = "http://services.server.uniba.de/TicketManagementServer/closeAcceptedTicket/Fault/TicketNotFoundException")
    })
    public String closeAcceptedTicket(
        @WebParam(name = "ticketID", targetNamespace = "")
        int ticketID)
        throws TicketNotFoundException_Exception
    ;

}
