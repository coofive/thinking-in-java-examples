//: generics/CheckedList.java
package ch15.generics;
// Using Collection.checkedList().

import ch11.holding.sample.pets.Cat;
import ch11.holding.sample.pets.Dog;
import ch11.holding.sample.pets.Pet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author coofive
 */
public class CheckedList {
    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List probablyDogs) {
        probablyDogs.add(new Cat());
    }

    public static void main(String[] args) {
        List<Dog> dogs1 = new ArrayList<Dog>();
        // Quietly accepts a Cat
        oldStyleMethod(dogs1);
        List<Dog> dogs2 = Collections.checkedList(
                new ArrayList<Dog>(), Dog.class);
        try {
            // Throws an exception
            oldStyleMethod(dogs2);
        } catch (Exception e) {
            System.out.println(e);
        }
        // Derived types work fine:
        List<Pet> pets = Collections.checkedList(
                new ArrayList<Pet>(), Pet.class);
        pets.add(new Dog());
        pets.add(new Cat());
    }
} /* Output:
java.lang.ClassCastException: Attempt to insert class typeinfo.pets.Cat element into collection with element type class typeinfo.pets.Dog
*///:~
