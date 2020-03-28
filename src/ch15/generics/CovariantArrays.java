//: generics/CovariantArrays.java
package ch15.generics;

class Fruit {
}

class Apple extends Fruit {
}

class Jonathan extends Apple {
}

class Orange extends Fruit {
}

/**
 * @author coofive
 */
public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        // OK
        fruit[0] = new Apple();
        // OK
        fruit[1] = new Jonathan();
        /* Runtime type is Apple[], not Fruit[] or Orange[]: */
        try {
            // Compiler allows you to add Fruit:
            // ArrayStoreException
            fruit[0] = new Fruit();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            // Compiler allows you to add Oranges:
            // ArrayStoreException
            fruit[0] = new Orange();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
} /* Output:
java.lang.ArrayStoreException: Fruit
java.lang.ArrayStoreException: Orange
*///:~
