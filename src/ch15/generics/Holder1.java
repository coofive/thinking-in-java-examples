//: generics/Holder1.java
package ch15.generics;

class Automobile {
}

/**
 * @author coofive
 */
public class Holder1 {
    private Automobile a;

    public Holder1(Automobile a) {
        this.a = a;
    }

    Automobile get() {
        return a;
    }
} ///:~