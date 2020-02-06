//: innerclasses/ClassInInterface.java
package ch10.innerclasses.sample;
// {main: ClassInInterface$Test}

/**
 * @author coofive
 */
public interface ClassInInterface {
    /**
     * h
     */
    void howdy();

    class Test implements ClassInInterface {
        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
} /* Output:
Howdy!
*///:~