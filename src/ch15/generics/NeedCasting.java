//: generics/NeedCasting.java
package ch15.generics;

import java.io.*;
import java.util.*;

/**
 * @author coofive
 */
public class NeedCasting {
    @SuppressWarnings("unchecked")
    public void f(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(args[0]));
        List<Widget> shapes = (List<Widget>) in.readObject();
    }
} ///:~
