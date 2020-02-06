package ch10.innerclasses.exercise;

/**
 * ****************** Exercise 9 ******************
 * Create an interface with at least one method.
 * and implement it by defining an
 * inner class within a method that returns a
 * reference to your interface.
 * **********************************************
 *
 * @author coofive
 */

public class Ex9 {
    public static void main(String[] args) {
        SimpleInterface2 simpleInterface = get();
        simpleInterface.f();
    }

    public static SimpleInterface2 get(){
        class SimpleInterfaceImpl implements SimpleInterface2{
            @Override
            public void f() {
                System.out.println("SimpleInterfaceImpl.f()");
            }
        }
        return new SimpleInterfaceImpl();
    }
}
/* Output:
SimpleInterfaceImpl.f()
*///:~

interface SimpleInterface2{
    /**
     * test
     */
    void f();
}