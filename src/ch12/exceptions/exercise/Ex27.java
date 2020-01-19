package ch12.exceptions.exercise;

/**
 * exceptions/Ex27.java
 * <p>
 * ****************** Exercise 27 ******************
 * Modify Exercise 3 to convert the exception to a
 * RuntimeException.
 * ************************************************
 *
 * @author coofive
 */
public class Ex27 {
    public static void main(String[] args) {
        char[] array = new char[10];
        try {
            array[array.length] = 'x';
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }

}

/* Output:
Exception in thread "main" java.lang.RuntimeException: java.lang.ArrayIndexOutOfBoundsException: 10
	at ch12.exceptions.exercise.Ex27.main(Ex27.java:19)
Caused by: java.lang.ArrayIndexOutOfBoundsException: 10
	at ch12.exceptions.exercise.Ex27.main(Ex27.java:17)
 *///:~