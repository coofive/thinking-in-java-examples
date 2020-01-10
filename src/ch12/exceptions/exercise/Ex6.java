package ch12.exceptions.exercise;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * exceptions/Ex6.java
 *
 * TIJ4 Chapter Exceptions, Exercise 6, page 456
 *
 * ****************** Exercise 6 ******************
 * Create two exception classes. each of which
 * performs its own logging automatically.
 * Demonstrate that these work.
 * ************************************************
 *
 * @author coofive
 */
public class Ex6 {
    public static void main(String[] args) {
        try {
            throw new My1Exception();
        } catch(My1Exception e) {
            System.err.println("Caught " + e);
        }
        try {
            throw new My2Exception();
        } catch(My2Exception e) {
            System.err.println("Caught " + e);
        }
    }
}


class My1Exception extends Exception {
    private static Logger logger = Logger.getLogger("My1Exception");

    public My1Exception() {
        super();
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class My2Exception extends Exception {
    private static Logger logger = Logger.getLogger("My2Exception");

    public My2Exception() {
        super();
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

/* Output: (45% match)
Jan 09, 2020 11:18:28 PM ch12.exceptions.exercise.My1Exception <init>
SEVERE: ch12.exceptions.exercise.My1Exception
	at ch12.exceptions.exercise.Ex6.main(Ex6.java:23)

Caught ch12.exceptions.exercise.My1Exception
Jan 09, 2020 11:18:28 PM ch12.exceptions.exercise.My2Exception <init>
SEVERE: ch12.exceptions.exercise.My2Exception
	at ch12.exceptions.exercise.Ex6.main(Ex6.java:28)

Caught ch12.exceptions.exercise.My2Exception
*///:~