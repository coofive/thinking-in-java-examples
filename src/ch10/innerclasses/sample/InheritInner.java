//: innerclasses/InheritInner.java
package ch10.innerclasses.sample;
// Inheriting an inner class.

class WithInner {
    class Inner {
    }
}

/**
 * @author coofive
 */
public class InheritInner extends WithInner.Inner {
    /**
     * ! InheritInner() {} // Won't compile
     */
    InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
} ///:~