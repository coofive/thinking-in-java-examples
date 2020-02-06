//: innerclasses/Parcel8.java
package ch10.innerclasses.sample;
// Calling the base-class constructor.

/**
 * @author coofive
 */
public class Parcel8 {
    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }

    public Wrapping wrapping(int x) {
        // Base constructor call:
        // Pass constructor argument.
        return new Wrapping(x) {
            @Override
            public int value() {
                return super.value() * 47;
            }
        }; // Semicolon required
    }
} ///:~