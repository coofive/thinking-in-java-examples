//: generics/UseList.java
package ch15.generics;
// {CompileTimeError} (Won't compile)

import java.util.*;

/**
 * @author coofive
 */
public class UseList<W, T> {
    /**
     * void f(List<T> v) {}
     */
    void f(List<W> v) {
    }
} ///:~
