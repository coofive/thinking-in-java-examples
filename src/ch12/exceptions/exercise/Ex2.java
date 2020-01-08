package ch12.exceptions.exercise;

/**
 * exceptions/Ex2.java
 * <p>
 * TIJ4 Chapter Exceptions, Exercise 2, page 452
 * <p>
 * ***************** Exercise 2 ******************
 * Define an object reference and initialize it
 * to null. Try to call a method through this
 * Thinking in Java, 4 th Edition Annotated Solution Guide 222
 * reference. Now wrap the code in a try-catch
 * clause to catch the exception.
 * **********************************************
 *
 * @author : coofive
 * @version : 1.0.0
 * @date : 1/8/2020 10:46 PM
 */
public class Ex2 {
    public static void main(String[] args) {
        String s = null;
        try {
            s.toString();
        } catch (Exception e) {
            System.out.println("Caught exception " + e);
        }
    }
}

/* Output:
Caught exception java.lang.NullPointerException
*///:~