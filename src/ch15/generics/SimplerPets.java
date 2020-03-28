//: generics/SimplerPets.java
package ch15.generics;

import ch11.holding.sample.pets.Person;
import ch11.holding.sample.pets.Pet;
import ch15.net.mindview.util.New;

import java.util.List;
import java.util.Map;

/**
 * @author coofive
 */
public class SimplerPets {
  public static void main(String[] args) {
    Map<Person, List<? extends Pet>> petPeople = New.map();
    // Rest of the code is the same...
  }
} ///:~