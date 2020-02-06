package ch10.innerclasses.exercise;

/**
 * ****************** Exercise 8 ******************
 * Determine whether an outer class has access to
 * the private elements of its inner class.
 * **********************************************
 *
 * @author coofive
 */

public class Ex8 {
    public static void main(String[] args) {
        Outer5 outer = new Outer5();
        outer.testInnerAccess();
    }
}
/* Output:
Inner.h called
Inner.j = 47
*///:~

class Outer5 {
    class Inner{
        private int j;

        private void h(){
            System.out.println("Inner.h called");
            System.out.println("Inner.j = " + j);
        }
    }

    public void testInnerAccess(){
        Inner inner = new Inner();
        inner.j = 47;
        inner.h();
    }
}