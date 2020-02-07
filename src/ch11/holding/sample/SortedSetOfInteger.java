//: holding/SortedSetOfInteger.java
package ch11.holding.sample;

import java.util.*;

/**
 * @author coofive
 */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        final int size = 10000;
        Random rand = new Random(47);
        SortedSet<Integer> intset = new TreeSet<Integer>();
        for (int i = 0; i < size; i++) {
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);
    }
} /* Output:
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29]
*///:~