//: exceptions/OnOffSwitch.java
package ch12.exceptions.sample;
// Why use finally?

/**
 * @author coofive
 */
public class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void f() throws OnOff1Exception, OnOff2Exception {
    }

    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw exceptions...
            f();
            sw.off();
        } catch (OnOff1Exception e) {
            System.out.println("OnOff1Exception");
            sw.off();
        } catch (OnOff2Exception e) {
            System.out.println("OnOff2Exception");
            sw.off();
        }
    }
} /* Output:
on
off
*///:~