
package de.uniba.server.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.uniba.server.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ShutdownConnectorResponse_QNAME = new QName("http://services.server.uniba.de/", "shutdownConnectorResponse");
    private final static QName _RunResponse_QNAME = new QName("http://services.server.uniba.de/", "runResponse");
    private final static QName _CreateTicketResponse_QNAME = new QName("http://services.server.uniba.de/", "createTicketResponse");
    private final static QName _AcceptNewTicketResponse_QNAME = new QName("http://services.server.uniba.de/", "acceptNewTicketResponse");
    private final static QName _Run_QNAME = new QName("http://services.server.uniba.de/", "run");
    private final static QName _AcceptNewTicket_QNAME = new QName("http://services.server.uniba.de/", "acceptNewTicket");
    private final static QName _CloseAcceptedTicket_QNAME = new QName("http://services.server.uniba.de/", "closeAcceptedTicket");
    private final static QName _RejectNewTicket_QNAME = new QName("http://services.server.uniba.de/", "rejectNewTicket");
    private final static QName _RejectNewTicketResponse_QNAME = new QName("http://services.server.uniba.de/", "rejectNewTicketResponse");
    private final static QName _ShutdownConnector_QNAME = new QName("http://services.server.uniba.de/", "shutdownConnector");
    private final static QName _CloseAcceptedTicketResponse_QNAME = new QName("http://services.server.uniba.de/", "closeAcceptedTicketResponse");
    private final static QName _GetAllRegisteredTicketResponse_QNAME = new QName("http://services.server.uniba.de/", "getAllRegisteredTicketResponse");
    private final static QName _CreateTicket_QNAME = new QName("http://services.server.uniba.de/", "createTicket");
    private final static QName _GetAllRegisteredTicket_QNAME = new QName("http://services.server.uniba.de/", "getAllRegisteredTicket");
    private final static QName _TicketNotFoundException_QNAME = new QName("http://services.server.uniba.de/", "TicketNotFoundException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.uniba.server.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShutdownConnector }
     * 
     */
    public ShutdownConnector createShutdownConnector() {
        return new ShutdownConnector();
    }

    /**
     * Create an instance of {@link RejectNewTicketResponse }
     * 
     */
    public RejectNewTicketResponse createRejectNewTicketResponse() {
        return new RejectNewTicketResponse();
    }

    /**
     * Create an instance of {@link CloseAcceptedTicket }
     * 
     */
    public CloseAcceptedTicket createCloseAcceptedTicket() {
        return new CloseAcceptedTicket();
    }

    /**
     * Create an instance of {@link RejectNewTicket }
     * 
     */
    public RejectNewTicket createRejectNewTicket() {
        return new RejectNewTicket();
    }

    /**
     * Create an instance of {@link AcceptNewTicket }
     * 
     */
    public AcceptNewTicket createAcceptNewTicket() {
        return new AcceptNewTicket();
    }

    /**
     * Create an instance of {@link AcceptNewTicketResponse }
     * 
     */
    public AcceptNewTicketResponse createAcceptNewTicketResponse() {
        return new AcceptNewTicketResponse();
    }

    /**
     * Create an instance of {@link Run }
     * 
     */
    public Run createRun() {
        return new Run();
    }

    /**
     * Create an instance of {@link CreateTicketResponse }
     * 
     */
    public CreateTicketResponse createCreateTicketResponse() {
        return new CreateTicketResponse();
    }

    /**
     * Create an instance of {@link RunResponse }
     * 
     */
    public RunResponse createRunResponse() {
        return new RunResponse();
    }

    /**
     * Create an instance of {@link ShutdownConnectorResponse }
     * 
     */
    public ShutdownConnectorResponse createShutdownConnectorResponse() {
        return new ShutdownConnectorResponse();
    }

    /**
     * Create an instance of {@link TicketNotFoundException }
     * 
     */
    public TicketNotFoundException createTicketNotFoundException() {
        return new TicketNotFoundException();
    }

    /**
     * Create an instance of {@link CreateTicket }
     * 
     */
    public CreateTicket createCreateTicket() {
        return new CreateTicket();
    }

    /**
     * Create an instance of {@link GetAllRegisteredTicket }
     * 
     */
    public GetAllRegisteredTicket createGetAllRegisteredTicket() {
        return new GetAllRegisteredTicket();
    }

    /**
     * Create an instance of {@link GetAllRegisteredTicketResponse }
     * 
     */
    public GetAllRegisteredTicketResponse createGetAllRegisteredTicketResponse() {
        return new GetAllRegisteredTicketResponse();
    }

    /**
     * Create an instance of {@link CloseAcceptedTicketResponse }
     * 
     */
    public CloseAcceptedTicketResponse createCloseAcceptedTicketResponse() {
        return new CloseAcceptedTicketResponse();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShutdownConnectorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.uniba.de/", name = "shutdownConnectorResponse")
    public JAXBElement<ShutdownConnectorResponse> createShutdownConnectorResponse(ShutdownConnectorResponse value) {
        return new JAXBElement<ShutdownConnectorResponse>(_ShutdownConnectorResponse_QNAME, ShutdownConnectorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.uniba.de/", name = "runResponse")
    public JAXBElement<RunResponse> createRunResponse(RunResponse value) {
        return new JAXBElement<RunResponse>(_RunResponse_QNAME, RunResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.uniba.de/", name = "createTicketResponse")
    public JAXBElement<CreateTicketResponse> createCreateTicketResponse(CreateTicketResponse value) {
        return new JAXBElement<CreateTicketResponse>(_CreateTicketResponse_QNAME, CreateTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptNewTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.uniba.de/", name = "acceptNewTicketResponse")
    public JAXBElement<AcceptNewTicketResponse> createAcceptNewTicketResponse(AcceptNewTicketResponse value) {
        return new JAXBElement<AcceptNewTicketResponse>(_AcceptNewTicketResponse_QNAME, AcceptNewTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Run }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.uniba.de/", name = "run")
    public JAXBElement<Run> createRun(Run value) {
        return new JAXBElement<Run>(_Run_QNAME, Run.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptNewTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.uniba.de/", name = "acceptNewTicket")
    public JAXBElement<AcceptNewTicket> createAcceptNewTicket(AcceptNewTicket value) {
        return new JAXBElement<AcceptNewTicket>(_AcceptNewTicket_QNAME, AcceptNewTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseAcceptedTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.uniba.de/", name = "closeAcceptedTicket")
    public JAXBElement<CloseAcceptedTicket> createCloseAcceptedTicket(CloseAcceptedTicket value) {
        return new JAXBElement<CloseAcceptedTicket>(_CloseAcceptedTicket_QNAME, CloseAcceptedTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RejectNewTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.uniba.de/", name = "rejectNewTicket")
    public JAXBElement<RejectNewTicket> createRejectNewTicket(RejectNewTicket value) {
        return new JAXBElement<RejectNewTicket>(_RejectNewTicket_QNAME, RejectNewTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RejectNewTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.uniba.de/", name = "rejectNewTicketResponse")
    public JAXBElement<RejectNewTicketResponse> createRejectNewTicketResponse(RejectNewTicketResponse value) {
        return new JAXBElement<RejectNewTicketResponse>(_RejectNewTicketResponse_QNAME, RejectNewTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShutdownConnector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.uniba.de/", name = "shutdownConnector")
    public JAXBElement<ShutdownConnector> createShutdownConnector(ShutdownConnector value) {
        return new JAXBElement<ShutdownConnector>(_ShutdownConnector_QNAME, ShutdownConnector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseAcceptedTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.uniba.de/", name = "closeAcceptedTicketResponse")
    public JAXBElement<CloseAcceptedTicketResponse> createCloseAcceptedTicketResponse(CloseAcceptedTicketResponse value) {
        return new JAXBElement<CloseAcceptedTicketResponse>(_CloseAcceptedTicketResponse_QNAME, CloseAcceptedTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRegisteredTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.uniba.de/", name = "getAllRegisteredTicketResponse")
    public JAXBElement<GetAllRegisteredTicketResponse> createGetAllRegisteredTicketResponse(GetAllRegisteredTicketResponse value) {
        return new JAXBElement<GetAllRegisteredTicketResponse>(_GetAllRegisteredTicketResponse_QNAME, GetAllRegisteredTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.uniba.de/", name = "createTicket")
    public JAXBElement<CreateTicket> createCreateTicket(CreateTicket value) {
        return new JAXBElement<CreateTicket>(_CreateTicket_QNAME, CreateTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRegisteredTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.uniba.de/", name = "getAllRegisteredTicket")
    public JAXBElement<GetAllRegisteredTicket> createGetAllRegisteredTicket(GetAllRegisteredTicket value) {
        return new JAXBElement<GetAllRegisteredTicket>(_GetAllRegisteredTicket_QNAME, GetAllRegisteredTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.uniba.de/", name = "TicketNotFoundException")
    public JAXBElement<TicketNotFoundException> createTicketNotFoundException(TicketNotFoundException value) {
        return new JAXBElement<TicketNotFoundException>(_TicketNotFoundException_QNAME, TicketNotFoundException.class, null, value);
    }

}
