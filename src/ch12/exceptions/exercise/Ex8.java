package ch12.exceptions.exercise;

/**
 * exceptions/Ex8.java
 * <p>
 * TIJ4 Chapter Exceptions, Exercise 8, page 458
 * <p>
 * ****************** Exercise 8 ******************
 * Write a class with a method that throws an exception of the type created
 * in Exercise 4. Try compiling it without an exception specification to see
 * what the compiler says. Add the appropriate exception specification. Try
 * out your class and its exception inside a try-catch clause.
 * ************************************************
 *
 * @author coofive
 */
public class Ex8 {
    public static void main(String[] args) {
        Thrower t = new Thrower();
        try {
            t.g();
        } catch (MyException e) {
            e.printMsg();
        }
    }
}

class Thrower {
    public void f() {
    // Compiler gives an error: "unreported
    // exception MyException; must be caught
    // or declared to be thrown"
    //! throw new MyException("Inside f()");
    }

    public void g() throws MyException {
        throw new MyException("Inside g()");
    }
}

class MyException extends Exception {
    private String message;

    public MyException(String message) {
        super(message);
        this.message = message;
    }

    public void printMsg() {
        System.out.println("exception msg:" + message);
    }
}
/* Output:
msg = Inside g()
*///:~