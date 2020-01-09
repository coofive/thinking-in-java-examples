package ch12.exceptions.sample;

/**
 * @author coofive
 */
public class WhoCalled {
    public static void main(String[] args) {
        f();
        System.out.println("--------------------------------");
        g();
        System.out.println("--------------------------------");
        h();
    }

    static void f() {
        // Generate an exception to fill in the stack trace
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println(ste.getMethodName());
            }
        }
    }

    static void g() {
        f();
    }

    static void h() {
        g();
    }
}
/* Output:
f
main
--------------------------------
f
g
main
--------------------------------
f
g
h
main
*///:~