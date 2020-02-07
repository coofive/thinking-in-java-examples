//: holding/SimpleCollection.java
package ch11.holding.sample;

import java.util.*;

/**
 * @author coofive
 */
public class SimpleCollection {
    public static void main(String[] args) {
        final int size = 10;
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            // Autoboxing
            c.add(i);
        }
        for (Integer i : c) {
            System.out.print(i + ", ");
        }
    }
} /* Output:
0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
*///:~