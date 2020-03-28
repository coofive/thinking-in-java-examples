//: generics/ErasedTypeEquivalence.java
package ch15.generics;

import java.util.*;

/**
 * @author coofive
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
} /* Output:
true
*///:~
