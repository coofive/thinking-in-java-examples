//: exceptions/Human.java
package ch12.exceptions.sample;
// Catching exception hierarchies.

/**
 * @author coofive
 */
public class Human {
    public static void main(String[] args) {
        // Catch the exact type:
        try {
            throw new SneezeException();
        } catch (SneezeException s) {
            System.out.println("Caught SneezeException");
        } catch (AnnoyanceException a) {
            System.out.println("Caught AnnoyanceException");
        }
        // Catch the base type:
        try {
            throw new SneezeException();
        } catch (AnnoyanceException a) {
            System.out.println("Caught AnnoyanceException");
        }
    }
}

class AnnoyanceException extends Exception {
}

class SneezeException extends AnnoyanceException {
}
/* Output:
Caught SneezeException
Caught AnnoyanceException
*///:~