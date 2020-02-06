//: innerclasses/DotNew.java
package ch10.innerclasses.sample;
// Creating an inner class directly using the .new syntax.

/**
 * @author coofive
 */
public class DotNew {
    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }

    public class Inner {
    }
} ///:~