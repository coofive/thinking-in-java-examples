package ch12.exceptions.exercise;

/**
 * exceptions/Ex28.java
 * <p>
 * ****************** Exercise 28 ******************
 * Modify Exercise 4 so that the custom exception
 * class inherits from RuntimeException. and show
 * that the compiler allows you to leave out the
 * try block.
 * ************************************************
 *
 * @author coofive
 */
public class Ex28 {
    public static void main(String[] args) {
        throw new MyRuntimeException("MyRuntimeException msg");
    }
}

class MyRuntimeException extends RuntimeException {
    public MyRuntimeException(String s) {
        super(s);
    }
}

/* Output:
Exception in thread "main" ch12.exceptions.exercise.MyRuntimeException: MyRuntimeException msg
	at ch12.exceptions.exercise.Ex28.main(Ex28.java:17)
 *///:~