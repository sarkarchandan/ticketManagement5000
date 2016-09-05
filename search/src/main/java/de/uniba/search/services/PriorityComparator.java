package de.uniba.search.services;

import de.uniba.server.services.Ticket;
import de.uniba.server.services.Priority;
import de.uniba.rz.entities.*;
import de.uniba.server.services.Type;

import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class PriorityComparator compares the priorities of the Tickets in the list and helps to sort the tickets according to their priority.
 * Created by chandan
 * On 7/4/16.
 */
public class PriorityComparator implements Comparator<Ticket> {

    /**
     * Declaring Logger object for logging
     */
    private static Logger newLogger = Logger.getLogger(PriorityComparator.class.getName());



    @Override
    public int compare(Ticket o1, Ticket o2) {

        newLogger.setLevel(Level.ALL);
        newLogger.info("Class PriorityComparator / Abstract Method compare : Comparing Priority of the Tickets");

       if ((o1.getPriority().equals(Priority.CRITICAL) && o2.getPriority().equals(Priority.MAJOR)) || (o1.getPriority().equals(Priority.CRITICAL) && o2.getPriority().equals(Priority.MINOR)) || (o1.getPriority().equals(Priority.MAJOR) && o2.getPriority().equals(Priority.MINOR))){

           return -1;
       }else if((o1.getPriority().equals(Priority.MAJOR) && o2.getPriority().equals(Priority.CRITICAL)) || (o1.getPriority().equals(Priority.MINOR) && o2.getPriority().equals(Priority.CRITICAL)) || (o1.getPriority().equals(Priority.MINOR) && o2.getPriority().equals(Priority.MAJOR))){

           return 1;
       }
        return 0;
    }


}
