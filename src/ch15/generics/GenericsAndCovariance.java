//: generics/GenericsAndCovariance.java
package ch15.generics;

import java.util.*;

/**
 * @author coofive
 */
public class GenericsAndCovariance {
    public static void main(String[] args) {
        // Wildcards allow covariance:
        List<? extends Fruit> flist = new ArrayList<Apple>();
        // Compile Error: can't add any type of object:
        // flist.add(new Apple());
        // flist.add(new Fruit());
        // flist.add(new Object());
        // Legal but uninteresting
        flist.add(null);
        // We know that it returns at least Fruit:
        Fruit f = flist.get(0);
    }
} ///:~
