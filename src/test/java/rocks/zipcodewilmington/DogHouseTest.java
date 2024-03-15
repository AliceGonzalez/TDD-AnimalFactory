package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
      @Test
      public void addTest(){
            Integer dogID = 372;
            Dog dog = new Dog(null, null, dogID);

            DogHouse.add(dog);
            Dog actualDog = DogHouse.getDogById(dogID);

            Assert.assertEquals(dogID, actualDog.getId());
      }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeDogByIDTest(){
        Dog dog = new Dog(null, null, 736);
        Integer expectedDogID = null;

        DogHouse.add(dog);
        DogHouse.remove(dog.getId());
        Dog actualDog = DogHouse.getDogById(dog.getId());

        Assert.assertEquals(expectedDogID, actualDog);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest(){
        Dog dog = new Dog("Lola", new Date("6/1/2003"), 236);

        DogHouse.add(dog);
        DogHouse.remove(dog);
        Dog actualDog = DogHouse.getDogById(236);

        Assert.assertEquals(null, actualDog);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void gatDogByIDTest(){
        Dog expectedDog = new Dog("Dave", new Date("3/1/1990"), 723);

        DogHouse.add(expectedDog);
        Dog actualDog = DogHouse.getDogById(723);

        Assert.assertEquals(expectedDog, actualDog);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogsTest(){
      DogHouse.clear();
        Dog dog1 = new Dog("Milo", new Date("6/2/2020"),342);
        Dog dog2 = new Dog("Eric", new Date("4/1/1998"),911);
        Dog dog3 = new Dog("Muffin", new Date("6/12/1998"),123);
        Integer expectedNum = 3;


        DogHouse.add(dog1);
        DogHouse.add(dog2);
        DogHouse.add(dog3);
        Integer numOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNum,numOfDogs);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
