package ch12.exceptions.sample;

import java.util.logging.*;
import java.io.*;

/**
 * @author coofive
 */
public class LoggingExceptions2 {
    private static Logger logger =
            Logger.getLogger("LoggingExceptions2");

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logException(e);
        }
    }

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }


}

/* Output: (90% match)
Aug 30, 2005 4:07:54 PM LoggingExceptions2 logException
SEVERE: java.lang.NullPointerException
        at LoggingExceptions2.main(LoggingExceptions2.java:16)
*///:~