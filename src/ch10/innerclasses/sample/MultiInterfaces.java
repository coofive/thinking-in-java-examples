//: innerclasses/MultiInterfaces.java
// Two ways that a class can implement multiple interfaces.
package ch10.innerclasses.sample;

/**
 * @author coofive
 */
public class MultiInterfaces {
    public static void main(String[] args) {
        ExX ex = new ExX();
        ExY y = new ExY();
        takesExa(ex);
        takesExa(y);
        takesExb(ex);
        takesExb(y.makeExBo());
    }

    static void takesExa(ExA ex) {
    }

    static void takesExb(ExB ex) {
    }
}

interface ExA {
}

interface ExB {
}

class ExX implements ExA, ExB {
}

class ExY implements ExA {
    ExB makeExBo() {
        // Anonymous inner class:
        return new ExB() {
        };
    }

}
///:~