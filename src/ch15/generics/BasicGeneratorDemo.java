//: generics/BasicGeneratorDemo.java
package ch15.generics;

import ch15.net.mindview.util.BasicGenerator;
import ch15.net.mindview.util.Generator;

/**
 * @author coofive
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen =
                BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
} /* Output:
CountedObject 0
CountedObject 1
CountedObject 2
CountedObject 3
CountedObject 4
*///:~
