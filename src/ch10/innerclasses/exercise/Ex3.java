package ch10.innerclasses.exercise;

/**
 * ****************** Exercise 3 ******************
 * Modify Exercise 1 so Outer has a private
 * String field (initialized by the constructor),
 * and Inner has a toString() that displays this
 * field. Create an object of type Inner and
 * display it.
 * **********************************************
 *
 * @author coofive
 */

public class Ex3 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2("Inner accessing outer!");
        Outer2.Inner inner = outer.getInner();
        System.out.println(inner);
    }
}
/* Output:
Inner created
Inner accessing outer!
*///:~

class Outer2{
    private String data;

    public Outer2(String data) {
        this.data = data;
    }

    public Inner getInner(){
        return new Inner();
    }

    class Inner{
        {
            System.out.println("Inner created");
        }

        @Override
        public String toString() {
            return data;
        }
    }
}