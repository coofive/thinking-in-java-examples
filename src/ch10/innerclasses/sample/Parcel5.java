//: innerclasses/Parcel5.java
package ch10.innerclasses.sample;
// Nesting a class within a method.

/**
 * @author coofive
 */
public class Parcel5 {
    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }

    public Destination destination(String s) {
        class PaDestination implements Destination {
            private String label;

            private PaDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PaDestination(s);
    }
} ///:~