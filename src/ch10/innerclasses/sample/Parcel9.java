//: innerclasses/Parcel9.java
package ch10.innerclasses.sample;
// An anonymous inner class that performs
// initialization. ExA briefer version of Parcel5.java.

public class Parcel9 {
    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
    }

    /**
     * Argument must be final to use inside
     * anonymous inner class:
     */
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }
} ///:~