
package de.uniba.search.wsdlDependencies;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "TicketNotFoundException", targetNamespace = "http://services.server.uniba.de/")
public class TicketNotFoundException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private TicketNotFoundException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public TicketNotFoundException_Exception(String message, TicketNotFoundException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public TicketNotFoundException_Exception(String message, TicketNotFoundException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: de.uniba.server.services.TicketNotFoundException
     */
    public TicketNotFoundException getFaultInfo() {
        return faultInfo;
    }

}
