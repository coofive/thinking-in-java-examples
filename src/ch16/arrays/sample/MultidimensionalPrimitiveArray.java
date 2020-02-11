//: arrays/MultidimensionalPrimitiveArray.java
package ch16.arrays.sample;
// Creating multidimensional arrays.

import java.util.*;

/**
 * @author coofive
 */
public class MultidimensionalPrimitiveArray {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3,},
                {4, 5, 6,},
        };
        System.out.println(Arrays.deepToString(a));
    }
} /* Output:
[[1, 2, 3], [4, 5, 6]]
*///:~