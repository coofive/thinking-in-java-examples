package ch12.exceptions.exercise;


/**
 * exceptions/Ex12.java
 * <p>
 * TIJ4 Chapter Exceptions, Exercise 12, page 471
 * <p>
 * ****************** Exercise 12 ******************
 * Modify innerClasses/Sequence.java so that it throws an appropriate
 * exception if you try to put in too many elements.
 * ************************************************
 *
 * @author coofive
 */
public class Ex12 {
    public static void main(String[] args) {
        Sequence2 sequence = new Sequence2(10);
        final int size  = 11;
        for (int i = 0; i < size; i++) {
            sequence.add(Integer.toString(i));
        }
    }
}


class Sequence2 {
    private Object[] objects;
    private int next;

    public Sequence2(int size) {
        objects = new Object[size];
    }

    public void add(Object x) {
        if (next < objects.length) {
            objects[next++] = x;
        } else {
            throw new SequenceFullException();
        }
    }
}

class SequenceFullException extends RuntimeException {
}
///:~
