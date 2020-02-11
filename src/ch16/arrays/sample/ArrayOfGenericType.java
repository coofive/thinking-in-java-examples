//: arrays/ArrayOfGenericType.java
package ch16.arrays.sample;
// Arrays of generic types won't compile.

/**
 * @author coofive
 */
public class ArrayOfGenericType<T> {
    /**
     * OK
     */
    T[] array;

    @SuppressWarnings("unchecked")
    public ArrayOfGenericType(int size) {
        //! array = new T[size]; // Illegal
        // "unchecked" Warning
        array = (T[]) new Object[size];
    }
    // Illegal:
    //! public <U> U[] makeArray() { return new U[10]; }
} ///:~