package ch10.innerclasses.exercise.ex6;

import ch10.innerclasses.exercise.ex6.a.SimpleInterface;
import ch10.innerclasses.exercise.ex6.b.SimpleClass;

/**
 * ****************** Exercise 6 ******************
 * Create an interface with at least one method,
 * in its own package. Create a class in a
 * separate package. Add a protected inner class
 * that implements the interface. In a third
 * package, inherit from your class and, inside a
 * method, return an object of the protected
 * inner class, upcasting to the interface during
 * the return.
 * **********************************************
 *
 * @author coofive
 */

public class Ex6 extends SimpleClass {
    public static void main(String[] args) {
        new Ex6().get().f();
    }

    public SimpleInterface get(){
        return new Inner();
    }
}
///:~