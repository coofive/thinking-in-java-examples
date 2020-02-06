//: innerclasses/MultiNestingAccess.java
package ch10.innerclasses.sample;
// Nested classes can access all members of all
// levels of the classes they are nested within.

/**
 * @author coofive
 */
public class MultiNestingAccess {
    public static void main(String[] args) {
        Mna mna = new Mna();
        Mna.ExA mnaa = mna.new ExA();
        Mna.ExA.ExB mnaab = mnaa.new ExB();
        mnaab.h();
    }
}

class Mna {

    private void f() {
    }

    class ExA {

        private void g() {
        }

        public class ExB {
            void h() {
                g();
                f();
            }
        }

    }
}
///:~