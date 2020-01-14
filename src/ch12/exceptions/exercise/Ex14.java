package ch12.exceptions.exercise;

import ch12.exceptions.sample.OnOff1Exception;
import ch12.exceptions.sample.OnOff2Exception;
import ch12.exceptions.sample.Switch;

/**
 * exceptions/Ex14.java
 * <p>
 * TIJ4 Chapter Exceptions, Exercise 14, page 476
 * <p>
 * ****************** Exercise 14 ******************
 * Show that OnOffSwitch.java can fail by
 * throwing a RuntimeException inside the try
 * block.
 * ************************************************
 *
 * @author coofive
 */
public class Ex14 {

    static Switch sw = new Switch();

    public static void main(String[] args) {
        try {
            try {
                sw.on();
                // Code that can throw exceptions...
                f();
                sw.off();
            } catch (OnOff1Exception e) {
                System.out.println("OnOffException1");
                sw.off();
            } catch (OnOff2Exception e) {
                System.out.println("OnOffException2");
                sw.off();
            }
        } catch (RuntimeException e) {
            System.out.println(sw);
            System.out.println("Oops! the exception '"
                    + e + "' slipped through without "
                    + "turning the switch off!");
        }
    }

    static void f() throws OnOff1Exception, OnOff2Exception {
        throw new RuntimeException("Inside try");
    }
}
