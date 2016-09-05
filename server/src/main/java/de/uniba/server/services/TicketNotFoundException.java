package de.uniba.server.services;

/**
 * Created by chandan
 * On 7/3/16.
 */
public class TicketNotFoundException extends Exception{


    private String  exceptionMessage;

    public TicketNotFoundException(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
}
