package ch10.innerclasses.exercise;

/**
 * ****************** Exercise 12 ******************
 * Repeat Exercise 7 using an anonymous inner
 * class.
 * **********************************************
 *
 * @author coofive
 */

public class Ex12 {
    public static void main(String[] args) {
        Outer7 outer = new Outer7();
        outer.h();
    }
}
/* Output:
Outer7.f()
i = 11
*///:~

class Outer7 {
    private int i = 10;

    private void f() {
        System.out.println("Outer7.f()");
    }

    public void h() {
        new Object() {
            void g() {
                i++;
                f();
            }
        }.g();
        System.out.println("i = " + i);
    }
}