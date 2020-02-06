package ch10.innerclasses.exercise;

/**
 * ****************** Exercise 2 ******************
 * Create a classes that holds a String, with a
 * toString() method that displays this String.
 * Add several instances of your new classes to a
 * Sequence object, then display them.
 * **********************************************
 *
 * @author coofive
 */

public class Ex2 {
    public static void main(String[] args) {
        final int size = 10;
        Sequence sequence = new Sequence(size);
        for (int i = 0; i < size; i++) {
            sequence.add(new StringHolder(Integer.toString(i)));
        }
        Selector selector = sequence.selector();
        while (!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
/* Output:
0 1 2 3 4 5 6 7 8 9
*///:~

class StringHolder{
    private String data;

    public StringHolder(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }
}

class Sequence {

    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
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
    }

    public Selector selector() {
        return new SequenceSelector();
    }


}

interface Selector {
    /**
     * end
     *
     * @return boolean
     */
    boolean end();

    /**
     * current
     *
     * @return obj
     */
    Object current();

    /**
     * next
     */
    void next();
}