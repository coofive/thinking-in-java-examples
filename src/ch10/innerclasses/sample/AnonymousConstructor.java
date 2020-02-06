//: innerclasses/AnonymousConstructor.java
package ch10.innerclasses.sample;
// Creating a constructor for an anonymous inner class.

/**
 * @author coofive
 */
public class AnonymousConstructor {
    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }

    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("Inside instance initializer");
            }

            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }
}

abstract class Base {
    public Base(int i) {
        System.out.println("Base constructor, i = " + i);
    }

    /**
     * f
     */
    public abstract void f();
}

/* Output:
Base constructor, i = 47
Inside instance initializer
In anonymous f()
*///:~