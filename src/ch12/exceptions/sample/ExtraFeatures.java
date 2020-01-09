package ch12.exceptions.sample;


/**
 * @author coofive
 */
public class ExtraFeatures {
    public static void main(String[] args) {
        try {
            f();
        } catch (My2Exception e) {
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch (My2Exception e) {
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch (My2Exception e) {
            e.printStackTrace(System.out);
            System.out.println("e.val() = " + e.val());
        }
    }


    public static void f() throws My2Exception {
        System.out.println("Throwing My2Exception from f()");
        throw new My2Exception();
    }

    public static void g() throws My2Exception {
        System.out.println("Throwing My2Exception from g()");
        throw new My2Exception("Originated in g()");
    }

    public static void h() throws My2Exception {
        System.out.println("Throwing My2Exception from h()");
        throw new My2Exception("Originated in h()", 47);
    }
}

class My2Exception extends Exception {
    private int x;

    public My2Exception() {
    }

    public My2Exception(String msg) {
        super(msg);
    }

    public My2Exception(String msg, int x) {
        super(msg);
        this.x = x;
    }

    public int val() {
        return x;
    }

    @Override
    public String getMessage() {
        return "Detail Message: " + x + " " + super.getMessage();
    }
}
/* Output:
Throwing My2Exception from f()
My2Exception: Detail Message: 0 null
        at ExtraFeatures.f(ExtraFeatures.java:22)
        at ExtraFeatures.main(ExtraFeatures.java:34)
Throwing My2Exception from g()
My2Exception: Detail Message: 0 Originated in g()
        at ExtraFeatures.g(ExtraFeatures.java:26)
        at ExtraFeatures.main(ExtraFeatures.java:39)
Throwing My2Exception from h()
My2Exception: Detail Message: 47 Originated in h()
        at ExtraFeatures.h(ExtraFeatures.java:30)
        at ExtraFeatures.main(ExtraFeatures.java:44)
e.val() = 47
*///:~