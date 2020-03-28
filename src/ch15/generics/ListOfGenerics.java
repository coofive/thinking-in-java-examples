//: generics/ListOfGenerics.java
package ch15.generics;

import java.util.*;

/**
 * @author coofive
 */
public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<T>();

    public void add(T item) {
        array.add(item);
    }

    public T get(int index) {
        return array.get(index);
    }
} ///:~
