//: innerclasses/Parcel10.java
package ch10.innerclasses.sample;
// Using "instance initialization" to perform
// construction on an anonymous inner class.

/**
 * @author coofive
 */
public class Parcel10 {
    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tasmania", 101.395F);
    }

    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private int cost;

            // Instance initialization for each object:
            {
                cost = Math.round(price);
                final int max = 100;
                if (cost > max) {
                    System.out.println("Over budget!");
                }
            }

            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }
}
/* Output:
Over budget!
*///:~