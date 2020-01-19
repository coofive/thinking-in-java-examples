package ch12.exceptions.exercise;

/**
 * exceptions/Ex21.java
 * <p>
 * ****************** Exercise 21 ******************
 * Demonstrate that a derived-class constructor
 * cannot catch exceptions thrown by its
 * base-class constructor.
 * ************************************************
 *
 * @author coofive
 */
public class Ex21 {
    public static void main(String[] args) {
        try {
            new DerivedException();
        } catch (Except1Exception ex1) {
            System.out.println("Caught " + ex1);
        }
    }
}

class Except1Exception extends Exception {
    public Except1Exception(String s) {
        super(s);
    }
}

class BaseWithException {
    public BaseWithException() throws Except1Exception {
        throw new Except1Exception("thrown by BaseWithException");
    }
}

class DerivedException extends BaseWithException {
    /**
     * Produces compile-time error:
     * unreported exception Except1Exception
     * call to 'super()' must be first statement in constructor body.
     */
    /*public DerivedException() {
        try {
            super();
        } catch (Except1Exception ex1) {
        }
    }*/

    public DerivedException() throws Except1Exception {
    }
}

/* Output:
Caught ch12.exceptions.exercise.Except1Exception: thrown by BaseWithException
*///:~