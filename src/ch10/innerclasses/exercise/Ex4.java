package ch10.innerclasses.exercise;

/**
 * ****************** Exercise 4 ******************
 * Add a method to the class Sequence.SequenceSelector
 * that produces the reference to the outer class
 * Sequence.
 * **********************************************
 *
 * @author coofive
 */

public class Ex4 {
    public static void main(String[] args) {
        Sequence2 sequence = new Sequence2(10);
        System.out.println(sequence.check());
    }
}
/* Output:
true
*///:~

class Sequence2 {

    private Object[] items;
    private int next = 0;

    public Sequence2(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }

        public Sequence2 sequence() {
            return Sequence2.this;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public boolean check() {
        return this == ((SequenceSelector) selector()).sequence();
    }
}