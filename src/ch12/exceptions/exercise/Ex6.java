package ch12.exceptions.exercise;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author coofive
 */
public class Ex6 {
    public static void main(String[] args) {
        try {
            throw new My1Exception();
        } catch (My1Exception e) {
            e.printStackTrace();
        }

        try {
            throw new My2Exception();
        } catch (My2Exception e) {
            e.printStackTrace();
        }
    }
}


class My1Exception extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");

    public My1Exception() {
        super();
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class My2Exception extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");

    public My2Exception() {
        super();
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}