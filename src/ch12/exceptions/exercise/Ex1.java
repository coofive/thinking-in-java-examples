package ch12.exceptions.exercise;

/**
 * exceptions/Ex1.java
 * <p>
 * TIJ4 Chapter Exceptions, Exercise 1, page 452
 * <p>
 * Create a class with a main(0 that throws an object of class Exception
 * inside a try block. Give the constructor for Exception a String argument.
 * Catch the exception inside a catch clause and print the String argument.
 * Add a finally clause and print a message to prove you were there.
 *
 * @author coofive
 */
public class Ex1 {
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException("From f()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            System.err.println("Caught MyException");
            e.printStackTrace();
        } finally {
            System.out.println("Made it to finally");
        }

    }
}

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
        System.out.println("MyException(String msg)");
    }
}

/*
Output:
Throwing MyException from f()
Caught MyExceptionMyException(String msg)

ch12.exceptions.exercise.MyException: From f()
	at ch12.exceptions.exercise.Ex1.f(Ex1.java:18)
	at ch12.exceptions.exercise.Ex1.main(Ex1.java:23)
Made it to finally
*/