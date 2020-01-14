package ch12.exceptions.exercise;

/**
 * exceptions/Ex13.java
 * <p>
 * TIJ4 Chapter Exceptions, Exercise 13, page 476
 * <p>
 * ****************** Exercise 13 ******************
 * Modify Exercise 9 by adding a finally clause.
 * Verify that your finally clause is executed. even\
 * if a NullPointException is thrown.
 * ************************************************
 *
 * @author coofive
 */
public class Ex13 {
    public static void main(String[] args) {
        Thrower2 t = new Thrower2();
        try {
            t.f();
        } catch (ExBaseException e) {
            System.err.println("caught " + e);
        } finally {
            System.out.println("In finally clause A");
        }
        try {
            throwNull();
            t.f();
        } catch (ExBaseException e) {
            System.err.println("caught " + e);
        } finally {
            System.out.println("In finally clause B");
        }
    }

    public static void throwNull() {
        throw new NullPointerException();
    }
}
