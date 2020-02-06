//: innerclasses/MultiImplementation.java
// With concrete or abstract classes, inner
// classes are the only way to produce the effect
// of "multiple implementation inheritance."
package ch10.innerclasses.sample;

/**
 * @author coofive
 */
public class MultiImplementation {
    public static void main(String[] args) {
        Z z = new Z();
        takesd(z);
        takese(z.makee());
    }

    static void takesd(ExD d) {
    }

    static void takese(AbstractE e) {
    }
}
class ExD {

}
abstract class AbstractE {

}
class Z extends ExD {
    AbstractE makee() {
        return new AbstractE() {
        };
    }

}

///:~