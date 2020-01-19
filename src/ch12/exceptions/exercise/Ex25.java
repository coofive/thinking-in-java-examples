package ch12.exceptions.exercise;

/**
 * exceptions/Ex25.java
 * <p>
 * ****************** Exercise 25 ******************
 * Create a three-level hierarchy of exceptions.
 * Now create a base class ExA with a method that
 * throws an exception at the base of your
 * hierarchy. Inherit ExB from ExA and override the
 * method so it throws an exception at level two
 * of your hierarchy. Repeat by inheriting class
 * C from ExB. In main(). create a C and upcast it
 * to ExA. then call the method.
 * ************************************************
 *
 * @author coofive
 */
public class Ex25 {
    public static void main(String[] args) {
        ExA a = new ExC();
        try {
            a.f();
        } catch (Level1Exception e) {
            System.out.println("Caught " + e);
        }
    }
}

class Level1Exception extends Exception {
}

class Level2Exception extends Level1Exception {
}

class Level3Exception extends Level2Exception {
}

class ExA {
    public void f() throws Level1Exception {
        throw new Level1Exception();
    }
}

class ExB extends ExA {
    @Override
    public void f() throws Level2Exception {
        throw new Level2Exception();
    }
}

class ExC extends ExB {
    @Override
    public void f() throws Level3Exception {
        throw new Level3Exception();
    }
}