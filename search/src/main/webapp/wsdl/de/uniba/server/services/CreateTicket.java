
package de.uniba.search.wsdlDependencies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ticketContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createTicket", propOrder = {
    "ticketContent"
})
public class CreateTicket {

    protected String ticketContent;

    /**
     * Gets the value of the ticketContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketContent() {
        return ticketContent;
    }

    /**
     * Sets the value of the ticketContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketContent(String value) {
        this.ticketContent = value;
    }

}
