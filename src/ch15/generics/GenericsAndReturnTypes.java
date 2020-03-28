//: generics/GenericsAndReturnTypes.java
package ch15.generics;

interface GenericGetter<T extends GenericGetter<T>> {
    T get();
}

interface Getter extends GenericGetter<Getter> {
}

/**
 * @author coofive
 */
public class GenericsAndReturnTypes {
    void test(Getter g) {
        Getter result = g.get();
        // Also the base type
        GenericGetter gg = g.get();
    }
} ///:~
