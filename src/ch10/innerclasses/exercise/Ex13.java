package ch10.innerclasses.exercise;

import ch10.innerclasses.exercise.ex6.a.SimpleInterface;

/**
 * ****************** Exercise 13 ******************
 * Repeat Exercise 9 using an anonymous inner
 * class.
 * **********************************************
 *
 * @author coofive
 */

public class Ex13 {
    public static void main(String[] args) {
        SimpleInterface simpleInterface = get();
        simpleInterface.f();
    }

    public static SimpleInterface get() {
        return new SimpleInterface() {
            @Override
            public void f() {
                System.out.println("SimpleInterfaceImpl.f()");
            }
        };
    }
}
/* Output:
SimpleInterfaceImpl.f()
*///:~
