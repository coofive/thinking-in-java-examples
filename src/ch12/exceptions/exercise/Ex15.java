package ch12.exceptions.exercise;

import ch12.exceptions.sample.OnOff1Exception;
import ch12.exceptions.sample.OnOff2Exception;
import ch12.exceptions.sample.Switch;

/**
 * exceptions/Ex15.java
 * <p>
 * TIJ4 Chapter Exceptions, Exercise 15, page 476
 * <p>
 * ****************** Exercise 15 ******************
 * Show that WithFinally.java doesn't fail by
 * throwing a RuntimeException inside the try
 * block.
 * ************************************************
 *
 * @author coofive
 */
public class Ex15 {
    static Switch sw = new Switch();

    public static void main(String[] args) {
        try {
            try {
                sw.on();
                // Code that can throw exceptions...
                f();
            } catch (OnOff1Exception e) {
                System.out.println("OnOffException1");
            } catch (OnOff2Exception e) {
                System.out.println("OnOffException2");
            } finally {
                sw.off();
            }
        } catch (RuntimeException e) {
            System.out.println("Exception '" + e +
                    "'. Did the switch get turned off?");
            System.out.println(sw);
        }
    }

    static void f() throws OnOff1Exception, OnOff2Exception {
        throw new RuntimeException("Inside try");
    }
}

/* Output:
on
off
Exception 'java.lang.RuntimeException: Inside try'. Did the
switch get turned off?
off
*///:~
