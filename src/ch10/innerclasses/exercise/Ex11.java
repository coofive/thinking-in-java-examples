package ch10.innerclasses.exercise;

import ch10.innerclasses.exercise.ex6.a.SimpleInterface;

/**
 * ****************** Exercise 11 ******************
 * Create a private inner class that implements a
 * public interface. Write a method that returns
 * a reference to an instance of the private
 * inner class. upcast to the interface. Show
 * that the inner class is completely hidden by
 * trying to downcast to it.
 * **********************************************
 *
 * @author coofive
 */

public class Ex11 {
    public static void main(String[] args) {
        Outer6 outer = new Outer6();
        SimpleInterface s1 = outer.get();
        s1.f();
        /*Outer6.Inner s2 = outer.get2();
        s2.f();*/

    }
}

class Outer6{
    private class Inner implements SimpleInterface{
        @Override
        public void f() {
            System.out.println("Outer6.Inner.f()");
        }
    }

    public SimpleInterface get(){
        return new Inner();
    }

    public Inner get2(){
        return new Inner();
    }
}