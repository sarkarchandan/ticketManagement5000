package de.uniba.search.services;

/**
 * Created by chandan
 * On 7/4/16.
 */
public class EmptyListException extends Exception{

    private String emptyListMessage;

    //public EmptyListException(String emptyListMessage) {
     //   this.emptyListMessage = emptyListMessage;
    //}

    public EmptyListException(){
        super ("No Tickets found which satisfies the parameter");
    }


    public String getEmptyListMessage() {
        return emptyListMessage;
    }

    public void setEmptyListMessage(String emptyListMessage) {
        this.emptyListMessage = emptyListMessage;
    }


}
