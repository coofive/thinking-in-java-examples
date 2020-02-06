//: innerclasses/DotThis.java
package ch10.innerclasses.sample;
// Qualifying access to the outer-class object.

/**
 * @author coofive
 */
public class DotThis {
    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }

    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
            // ExA plain "this" would be Inner's "this"
        }
    }

    public Inner inner() {
        return new Inner();
    }


}
/* Output:
DotThis.f()
*///:~