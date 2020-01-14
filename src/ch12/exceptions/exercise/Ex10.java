package ch12.exceptions.exercise;

/**
 * exceptions/Ex10.java
 * <p>
 * TIJ4 Chapter Exceptions, Exercise 10, page 468
 * <p>
 * ****************** Exercise 10 ******************
 * Create a class with two methods, f() and g(). In g(), throw an exception of
 * a new type that you define. In f(), call g(), catch its exception and, in the
 * catch clause, throw a different exception (of a second type that you define).
 * Test your code in main().
 * ************************************************
 *
 * @author coofive
 */
public class Ex10 {
    public static void main(String[] args) {
        Ex10 ce = new Ex10();
        try {
            ce.f();
        } catch (AnotherException e) {
            System.out.println("Caught " + e);
        }
    }

    public void g() throws An2Exception {
        throw new An2Exception();
    }

    public void f() throws AnotherException {
        try {
            g();
        } catch (An2Exception e) {
            throw new AnotherException();
        }
    }
}

class AnException extends Exception {
}

class AnotherException extends Exception {
}
/* Output:
Caught exceptions.AnotherException
*///:~