package ch10.innerclasses.exercise;

/**
 * ****************** Exercise 7 ******************
 * Create a class with a private field and a
 * private method. Create an inner class with a
 * method that modifies the outer-class field and
 * calls the outer-class method. In a second
 * outer-class method, create an object of the
 * inner class and call its method, then show
 * the effect on the outer-class object.
 * **********************************************
 *
 * @author coofive
 */

public class Ex7 {
    public static void main(String[] args) {
        Outer4 outer = new Outer4();
        outer.h();
    }
}

class Outer4 {
    private int i = 10;

    public void f(){
        System.out.println("Outer4.f()");
    }

    class Inner{
        void g(){
            i++;
            f();
        }
    }

    public void h(){
        Inner inner = new Inner();
        inner.g();
        System.out.println("i = " + i);
    }
}