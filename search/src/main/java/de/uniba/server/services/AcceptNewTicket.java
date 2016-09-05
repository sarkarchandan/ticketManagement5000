
package de.uniba.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acceptNewTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acceptNewTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ticketID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acceptNewTicket", propOrder = {
    "ticketID"
})
public class AcceptNewTicket {

    protected int ticketID;

    /**
     * Gets the value of the ticketID property.
     * 
     */
    public int getTicketID() {
        return ticketID;
    }

    /**
     * Sets the value of the ticketID property.
     * 
     */
    public void setTicketID(int value) {
        this.ticketID = value;
    }

}
