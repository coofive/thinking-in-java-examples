//: holding/SetOfInteger.java
package ch11.holding.sample;

import java.util.*;

/**
 * @author coofive
 */
public class SetOfInteger {
    public static void main(String[] args) {
        final int size = 10000;
        Random rand = new Random(47);
        Set<Integer> intSet = new HashSet<Integer>();
        for (int i = 0; i < size; i++) {
            intSet.add(rand.nextInt(30));
        }
        System.out.println(intSet);
    }
} /* Output:
[15, 8, 23, 16, 7, 22, 9, 21, 6, 1, 29, 14, 24, 4, 19, 26, 11, 18, 3, 12, 27, 17, 2, 13, 28, 20, 25, 10, 5, 0]
*///:~