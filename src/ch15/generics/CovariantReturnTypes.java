//: generics/CovariantReturnTypes.java
package ch15.generics;

class Base {
}

class Derived extends Base {
}

interface OrdinaryGetter {
    Base get();
}

interface DerivedGetter extends OrdinaryGetter {
    /**
     * Return type of overridden method is allowed to vary:
     */
    @Override
    Derived get();
}

/**
 * @author coofive
 */
public class CovariantReturnTypes {
    void test(DerivedGetter d) {
        Derived d2 = d.get();
    }
} ///:~
