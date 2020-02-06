package ch10.innerclasses.exercise;

/**
 * ****************** Exercise 15 ******************
 * Create a class with a non-default constructor
 * (one with arguments) and no default constructor
 * (no "no-arg" constructor). Create a second class
 * with a method that returns a reference to
 * an object of the first class. Create the object
 * you return by making an anonymous inner
 * class inherit from the first class.
 * **********************************************
 *
 * @author coofive
 */

public class Ex15 {
    public static void main(String[] args) {
        Second sec = new Second();
        NoDefault nd1 = sec.get(888);
        nd1.f();
        NoDefault nd2 = sec.get2(999);
        nd2.f();
    }
}
/* Output:
NoDefault.f(),i=888
Second.get2().f(), i=999
*///~

class NoDefault {
    private int i;

    public NoDefault(int i) {
        this.i = i;
    }

    public void f() {
        System.out.println("NoDefault.f(),i=" + i);
    }
}

class Second {
    public NoDefault get(int i) {
        // Dosen't override any methods:
        return new NoDefault(i) {
        };
    }

    public NoDefault get2(int i) {
        return new NoDefault(i) {
            @Override
            public void f() {
                System.out.println("Second.get2().f(), i=" + i);
            }
        };
    }
}