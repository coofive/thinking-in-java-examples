//: net/mindview/util/Pair.java
package ch15.net.mindview.util;

/**
 * @author coofive
 */
public class Pair<K, V> {
    public final K key;
    public final V value;

    public Pair(K k, V v) {
        key = k;
        value = v;
    }
} ///:~
