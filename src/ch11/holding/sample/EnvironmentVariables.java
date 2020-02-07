//: holding/EnvironmentVariables.java
package ch11.holding.sample;

import java.util.*;

/**
 * @author coofive
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " +
                    entry.getValue());
        }
    }
} /* (Execute to see output) *///:~