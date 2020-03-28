//: generics/SimpleQueue.java
package ch15.generics;
// A different kind of container that is Iterable

import java.util.*;

/**
 * @author coofive
 */
public class SimpleQueue<T> implements Iterable<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void add(T t) {
        storage.offer(t);
    }

    public T get() {
        return storage.poll();
    }

    @Override
    public Iterator<T> iterator() {
        return storage.iterator();
    }
} ///:~
