package ch12.exceptions.exercise;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * @author wenwu.liu.o
 */
public class Ex7 {
    private static Logger logger = Logger.getLogger("Logging");

    public static void main(String[] args) {
        try {
            throw new IOException();
        } catch (IOException e) {
            logger.severe(e.getMessage());
        }
    }
}


