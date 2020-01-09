package ch12.exceptions.exercise;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * exceptions/Ex7.java
 *
 * TIJ4 Chapter Exceptions, Exercise 7, page 456
 *
 * ****************** Exercise 7 ******************
 * Modify Exercise 3 so that the catch clause logs
 * the results.
 *
 * ************************************************
 *
 * @author wenwu.liu.o
 */
public class Ex7 {
    private static Logger logger = Logger.getLogger("Ex7");
    public static void main(String[] args) {
        char[] array = new char[10];
        try {
            array[array.length] = 'x';
        } catch(ArrayIndexOutOfBoundsException e) {
            logException(e);
        }
    }

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

/* Output: (80% match)
Jan 09, 2020 11:21:38 PM ch12.exceptions.exercise.Ex7 logException
SEVERE: java.lang.ArrayIndexOutOfBoundsException: 10
	at ch12.exceptions.exercise.Ex7.main(Ex7.java:26)
*///:~
