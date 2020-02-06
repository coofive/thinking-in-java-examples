package ch10.innerclasses.exercise;

/**
 * ****************** Exercise 1 ******************
 * Write a classes named Outer containing an
 * inner class name Inner. Add a method to Outer
 * that returns an object of type Inner. In
 * main(), create and initialize a reference to an
 * Inner.
 * **********************************************
 *
 * @author coofive
 */

public class Ex1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.getInner();
    }
}

class Outer{

    public Inner getInner(){
        return new Inner();
    }

    class Inner{
        {
            System.out.println("Inner created");
        }
    }
}