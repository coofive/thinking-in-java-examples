package ch12.exceptions.exercise;

/**
 * exceptions/Ex3.java
 * <p>
 * TIJ4 Chapter Exceptions, Exercise 3, page 452
 * <p>
 * ****************** Exercise 3 ******************
 * * Write code to generate and catch an
 * * ArrayIndexOutOfBoundsException.
 * ***********************************************
 *
 * @author : coofive
 * @version : 1.0.0
 * @date : 1/8/2020 10:56 PM
 */
public class Ex3 {
    public static void main(String[] args) {
        char[] array = new char[10];
        try {
            array[array.length] = 'x';
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("e = " + e);
        }
    }
}

/* Output:
e = java.lang.ArrayIndexOutOfBoundsException: 10
*///:~