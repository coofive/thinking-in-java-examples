//: innerclasses/TestParcel.java
package ch10.innerclasses.sample;


public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
        // Illegal -- can't access private class:
        //! Parcel4.PContents pc = p.new PContents();
    }
}

class Parcel4 {
    private class PaContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PaDestination implements Destination {
        private String label;

        private PaDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PaDestination(s);
    }

    public Contents contents() {
        return new PaContents();
    }
}
///:~