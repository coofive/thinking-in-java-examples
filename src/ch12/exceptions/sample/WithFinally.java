//: exceptions/WithFinally.java
package ch12.exceptions.sample;
// Finally Guarantees cleanup.

/**
 * @author coofive
 */
public class WithFinally {
    static Switch sw = new Switch();

    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw exceptions...
            OnOffSwitch.f();
        } catch (OnOff1Exception e) {
            System.out.println("OnOffException1");
        } catch (OnOff2Exception e) {
            System.out.println("OnOffException2");
        } finally {
            sw.off();
        }
    }
}
/* Output:
on
off
*///:~