//: innerclasses/Parcel7b.java
package ch10.innerclasses.sample;
// Expanded version of Parcel7.java

/**
 * @author coofive
 */
public class Parcel7b {
    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
    }

    class MyContents implements Contents {

        private int i = 11;

        @Override
        public int value() {
            return i;
        }

    }

    public Contents contents() {
        return new MyContents();
    }
} ///:~