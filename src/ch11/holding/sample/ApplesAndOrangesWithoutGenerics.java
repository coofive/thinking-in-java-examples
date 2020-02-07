//: holding/ApplesAndOrangesWithoutGenerics.java
package ch11.holding.sample; /* Added by Eclipse.py */
// Simple container example (produces compiler warnings).
// {ThrowsException}

import java.util.*;

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }

}

class Orange {

}

/**
 * @author coofive
 */
public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        final int size = 3;
        ArrayList apples = new ArrayList();
        for (int i = 0; i < size; i++) {
            apples.add(new Apple());
        }
        // Not prevented from adding an Orange to apples:
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            ((Apple) apples.get(i)).id();
        }
        // Orange is detected only at run time
    }
} /* (Execute to see output) *///:~
