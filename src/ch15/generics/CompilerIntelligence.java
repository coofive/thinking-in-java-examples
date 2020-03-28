//: generics/CompilerIntelligence.java
package ch15.generics;

import java.util.*;

/**
 * @author coofive
 */
public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist =
                Arrays.asList(new Apple());
        // No warning
        Apple a = (Apple) flist.get(0);
        // Argument is 'Object'
        flist.contains(new Apple());
        // Argument is 'Object'
        flist.indexOf(new Apple());
    }
} ///:~
