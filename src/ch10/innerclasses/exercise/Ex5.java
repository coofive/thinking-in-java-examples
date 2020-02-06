package ch10.innerclasses.exercise;

/**
 * ****************** Exercise 5 ******************
 * Create a class with an inner class. In a
 * separate class, make an instance of the inner
 * class.
 * **********************************************
 *
 * @author coofive
 */

public class Ex5 {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        Outer3.Inner inner = outer.new Inner();
    }
}
/* Output:
Inner created
*///:~

class Outer3{
    class Inner{
        {
            System.out.println("Inner created");
        }
    }
}