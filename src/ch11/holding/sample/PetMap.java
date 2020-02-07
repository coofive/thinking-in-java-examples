//: holding/PetMap.java
package ch11.holding.sample;

import ch11.holding.sample.pets.Cat;
import ch11.holding.sample.pets.Dog;
import ch11.holding.sample.pets.Hamster;
import ch11.holding.sample.pets.Pet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author coofive
 */
public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<String, Pet>(3);
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        System.out.println(petMap);
        Pet dog = petMap.get("My Dog");
        System.out.println(dog);
        System.out.println(petMap.containsKey("My Dog"));
        System.out.println(petMap.containsValue(dog));
    }
} /* Output:
{My Cat=Cat Molly, My Hamster=Hamster Bosco, My Dog=Dog Ginger}
Dog Ginger
true
true
*///:~