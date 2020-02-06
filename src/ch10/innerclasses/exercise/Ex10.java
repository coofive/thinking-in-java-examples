package ch10.innerclasses.exercise;

/**
 * ****************** Exercise 10 ******************
 * Repeat Exercise 9 but define the inner
 * class within a scope within a method.
 * **********************************************
 *
 * @author coofive
 */

public class Ex10 {
    public static void main(String[] args) {
        SimpleInterface3 simpleInterface3 = get();
        simpleInterface3.f();
    }

    public static SimpleInterface3 get() {
        {
            class SimpleInterfaceImpl implements SimpleInterface3 {
                @Override
                public void f() {
                    System.out.println("SimpleInterfaceImpl.f()");
                }
            }
            return new SimpleInterfaceImpl();
        }
    }
}
/* Output:
SimpleInterfaceImpl.f()
*///:~

interface SimpleInterface3 {
    /**
     * test
     */
    void f();
}