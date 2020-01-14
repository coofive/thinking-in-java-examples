package ch12.exceptions.exercise;

/**
 * exceptions/Ex11.java
 * <p>
 * TIJ4 Chapter Exceptions, Exercise 11, page 468
 * <p>
 * ****************** Exercise 11 ******************
 * Repeat the previous exercise, but inside the catch clause, wrap g()'s
 * exception in a RuntimeException.
 * ************************************************
 *
 * @author wenwu.liu.o
 */

public class Ex11 {
    public static void main(String[] args) {
        Ex11 ce = new Ex11();
        ce.f();
    }

    public void f() {
        try {
            g();
        } catch (An2Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void g() throws An2Exception {
        throw new An2Exception();
    }
}

class An2Exception extends Exception {
}
///:~
