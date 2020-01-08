package ch12.exceptions.exercise;

/**
 * exceptions/Ex5.java
 * <p>
 * TIJ4 Chapter Exceptions, Exercise 5, page 452
 * <p>
 * ****************** Exercise 5 ******************
 * Create you own resumption-like behavior using
 * a while loop that repeats until an exception
 * is no longer thrown.
 * ************************************************
 *
 * @author : coofive
 * @version : 1.0.0
 * @date : 1/8/2020 11:17 PM
 */
public class Ex5 {
    public static void main(String[] args) {
        while (true) {
            try {
                Resumer.f();
            } catch (ResumerException e) {
                System.out.println("Caught " + e);
                continue;
            }
            System.out.println("Got through...");
            break;
        }
        System.out.println("Successful execution");
    }
}

class ResumerException extends Exception {

}

class Resumer {
    static int count = 3;

    static void f() throws ResumerException {
        if (--count > 0) {
            throw new ResumerException();
        }
    }
}

/* Output:
Caught ch12.exceptions.exercise.ResumerException
Caught ch12.exceptions.exercise.ResumerException
Got through...
Successful execution
*///:~
