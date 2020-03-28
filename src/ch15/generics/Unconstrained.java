//: generics/Unconstrained.java
package ch15.generics;

class Other {
}

class BasicOther extends BasicHolder<Other> {
}

/**
 * @author coofive
 */
public class Unconstrained {
    public static void main(String[] args) {
        BasicOther b = new BasicOther(), b2 = new BasicOther();
        b.set(new Other());
        Other other = b.get();
        b.f();
    }
} /* Output:
Other
*///:~
