//: generics/SuperTypeWildcards.java
package ch15.generics;

import java.util.*;

/**
 * @author coofive
 */
public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
        // apples.add(new Fruit()); // Error
    }
} ///:~
