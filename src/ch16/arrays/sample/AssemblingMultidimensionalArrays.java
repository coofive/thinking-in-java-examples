//: arrays/AssemblingMultidimensionalArrays.java
package ch16.arrays.sample;
// Creating multidimensional arrays.

import java.util.*;

/**
 * @author coofive
 */
public class AssemblingMultidimensionalArrays {
    public static void main(String[] args) {
        Integer[][] a;
        a = new Integer[3][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Integer[3];
            for (int j = 0; j < a[i].length; j++) {
                // Autoboxing
                a[i][j] = i * j;
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
} /* Output:
[[0, 0, 0], [0, 1, 2], [0, 2, 4]]
*///:~