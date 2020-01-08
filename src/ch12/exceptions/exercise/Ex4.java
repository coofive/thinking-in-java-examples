package ch12.exceptions.exercise;

/**
 * exceptions/Ex4.java
 * <p>
 * TIJ4 Chapter Exceptions, Exercise 4, page 452
 * <p>
 * ****************** Exercise 4 ******************
 * Create your own exception class using the
 * extends keyword. Write a constructor for this
 * class that takes a String argument and stores
 * it inside the object with a String reference.
 * Write a method that prints out the stored
 * String. Create a try-catch clause to exercise
 * you new exception.
 * ************************************************
 *
 * @author : coofive
 * @version : 1.0.0
 * @date : 1/8/2020 11:01 PM
 */
public class Ex4 {
    public static void main(String[] args) {
        // 1
        try {
            throw new MyException("MyException message");
        } catch (MyException e) {
            e.printMsg();
        }
        // 2
        try {
            throw new My2Exception("My2Exception message");
        } catch (My2Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }

    /**
     * Following the instructions to the letter
     */
    private static class MyException extends Exception {
       private String msg;

        public MyException(String msg) {
            this.msg = msg;
        }

        public void printMsg() {
            System.out.println("msg = " + msg);
        }
    }

    /**
     * Or take a more clever approach,
     * noting that string storage and printing are
     * built into Exception:
     */
    private static class My2Exception extends Exception{
        public My2Exception(String message) {
            super(message);
        }
    }
}

/* Output:
msg = MyException message
e.getMessage() = My2Exception message
*///:~