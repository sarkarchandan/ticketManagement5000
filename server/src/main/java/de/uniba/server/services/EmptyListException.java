package de.uniba.server.services;

/**
 * Created by chandan
 * On 7/4/16.
 */
public class EmptyListException extends Exception{

    private String emptyListMessage;

    public EmptyListException(String message, String emptyListMessage) {
        this.emptyListMessage = emptyListMessage;
    }

    public String getEmptyListMessage() {
        return emptyListMessage;
    }

    public void setEmptyListMessage(String emptyListMessage) {
        this.emptyListMessage = emptyListMessage;
    }
}
