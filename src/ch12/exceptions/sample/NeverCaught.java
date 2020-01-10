package ch12.exceptions.sample;

/**
 * @author coofive
 */
public class NeverCaught {
    public static void main(String[] args) {
        g();
    }

    static void f() {
        throw new RuntimeException("From f()");
    }

    static void g() {
        f();
    }
}
/* Output:
Exception in thread "main" java.lang.RuntimeException: From f()
	at ch12.exceptions.sample.NeverCaught.f(NeverCaught.java:11)
	at ch12.exceptions.sample.NeverCaught.g(NeverCaught.java:15)
	at ch12.exceptions.sample.NeverCaught.main(NeverCaught.java:8)
*/ //:~