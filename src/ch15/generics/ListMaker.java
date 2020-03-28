//: generics/ListMaker.java
package ch15.generics;

import java.util.*;

/**
 * @author coofive
 */
public class ListMaker<T> {
    List<T> create() {
        return new ArrayList<T>();
    }

    public static void main(String[] args) {
        ListMaker<String> stringMaker = new ListMaker<String>();
        List<String> stringList = stringMaker.create();
    }
} ///:~
