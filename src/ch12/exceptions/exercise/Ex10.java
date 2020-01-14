package ch12.exceptions.exercise;

/**
 * exceptions/Ex10.java
 * <p>
 * TIJ4 Chapter Exceptions, Exercise 10, page 468
 * <p>
 * ****************** Exercise 10 ******************
 * Create a class with two methods, f() and g(). In g(), throw an exception of
 * a new type that you define. In f(), call g(), catch its exception and, in the
 * catch clause, throw a different exception (of a second type that you define).
 * Test your code in main().
 * ************************************************
 *
 * @author coofive
 */
public class Ex10 {
    public static void main(String[] args) {
        f();
    }

    private static void f() {
        try {
            g();
        } catch (G1Exception e) {
            e.printStackTrace();
            throw new H1Exception("f()抛出异常");
        }
    }

    private static void g() throws G1Exception {
        throw new G1Exception("g()抛出异常");
    }
}

class G1Exception extends Exception {
    G1Exception(String s) {
        super(s);
    }
}

class H1Exception extends RuntimeException {
    H1Exception(String s) {
        super(s);
    }
}
