//: generics/PlainGenericInheritance.java
package ch15.generics;

/**
 * Not self-bounded
 *
 * @param <T>
 */
class GenericSetter<T> {
    void set(T arg) {
        System.out.println("GenericSetter.set(Base)");
    }
}

class DerivedGS extends GenericSetter<Base> {
    void set(Derived derived) {
        System.out.println("DerivedGS.set(Derived)");
    }
}

/**
 * @author coofive
 */
public class PlainGenericInheritance {
    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        DerivedGS dgs = new DerivedGS();
        dgs.set(derived);
        // Compiles: overloaded, not overridden!
        dgs.set(base);
    }
} /* Output:
DerivedGS.set(Derived)
GenericSetter.set(Base)
*///:~
