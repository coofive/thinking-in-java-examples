//: exceptions/ExceptionSilencer.java
package ch12.exceptions.sample;

/**
 * @author coofive
 */
public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            // Using 'return' inside the finally block
            // will silence any thrown exception.
//            return;
        }
    }
} ///:~