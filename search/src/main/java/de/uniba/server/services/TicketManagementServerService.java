
package de.uniba.server.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TicketManagementServerService", targetNamespace = "http://services.server.uniba.de/", wsdlLocation = "http://laptop-dsscai8r:8080/TicketManagementServer/TicketManagementServerService?wsdl")
public class TicketManagementServerService
    extends Service
{

    private final static URL TICKETMANAGEMENTSERVERSERVICE_WSDL_LOCATION;
    private final static WebServiceException TICKETMANAGEMENTSERVERSERVICE_EXCEPTION;
    private final static QName TICKETMANAGEMENTSERVERSERVICE_QNAME = new QName("http://services.server.uniba.de/", "TicketManagementServerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://laptop-dsscai8r:8080/TicketManagementServer/TicketManagementServerService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TICKETMANAGEMENTSERVERSERVICE_WSDL_LOCATION = url;
        TICKETMANAGEMENTSERVERSERVICE_EXCEPTION = e;
    }

    public TicketManagementServerService() {
        super(__getWsdlLocation(), TICKETMANAGEMENTSERVERSERVICE_QNAME);
    }

    public TicketManagementServerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TICKETMANAGEMENTSERVERSERVICE_QNAME, features);
    }

    public TicketManagementServerService(URL wsdlLocation) {
        super(wsdlLocation, TICKETMANAGEMENTSERVERSERVICE_QNAME);
    }

    public TicketManagementServerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TICKETMANAGEMENTSERVERSERVICE_QNAME, features);
    }

    public TicketManagementServerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TicketManagementServerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TicketManagementServer
     */
    @WebEndpoint(name = "TicketManagementServerPort")
    public TicketManagementServer getTicketManagementServerPort() {
        return super.getPort(new QName("http://services.server.uniba.de/", "TicketManagementServerPort"), TicketManagementServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TicketManagementServer
     */
    @WebEndpoint(name = "TicketManagementServerPort")
    public TicketManagementServer getTicketManagementServerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.server.uniba.de/", "TicketManagementServerPort"), TicketManagementServer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TICKETMANAGEMENTSERVERSERVICE_EXCEPTION!= null) {
            throw TICKETMANAGEMENTSERVERSERVICE_EXCEPTION;
        }
        return TICKETMANAGEMENTSERVERSERVICE_WSDL_LOCATION;
    }

}
