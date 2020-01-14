package ch12.exceptions.exercise;

/**
 * exceptions/Ex9.java
 * <p>
 * TIJ4 Chapter Exceptions, Exercise 9, page 460
 * <p>
 * ****************** Exercise 9 ******************
 * Create three new types of exceptions. Write a class with a method that
 * throws all three. In main(), call the method but only use a single catch
 * clause that will catch all three types of exceptions.
 * ************************************************
 *
 * @author coofive
 */
public class Ex9 {
    public static void main(String[] args) {
        Thrower2 t = new Thrower2();
        try {
            t.f();
        } catch (ExBaseException e) {
            System.out.println("caught " + e);
        } catch (Exception e) {
            System.out.println("caught " + e);
        }
    }
}


class ExBaseException extends Exception {
}

class Ex1Exception extends ExBaseException {
}

class Ex2Exception extends ExBaseException {
}

class Ex3Exception extends ExBaseException {
}

class Thrower2 {
    void f() throws Ex1Exception, Ex2Exception, Ex3Exception {
        throw new Ex1Exception();
        // You aren't forced to throw all the
        // exceptions in the specification.
    }
}

/* Output:
caught ch12.exceptions.exercise.Ex1Exception
*///:~