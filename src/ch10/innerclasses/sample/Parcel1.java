//: innerclasses/Parcel1.java
package ch10.innerclasses.sample;
// Creating inner classes.

/**
 * @author coofive
 */
public class Parcel1 {
    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }

    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }


    }

    /**
     * Using inner classes looks just like
     * using any other class, within Parcel1:
     *
     * @param dest
     */
    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }
}
/* Output:
Tasmania
*///:~