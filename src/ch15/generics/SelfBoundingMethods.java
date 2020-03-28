//: generics/SelfBoundingMethods.java
package ch15.generics;

/**
 * @author coofive
 */
public class SelfBoundingMethods {
    static <T extends SelfBounded<T>> T f(T arg) {
        return arg.set(arg).get();
    }

    public static void main(String[] args) {
        A a = f(new A());
    }
} ///:~
