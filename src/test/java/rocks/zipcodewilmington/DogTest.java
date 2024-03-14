package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void newDogTest(){
        String name = "Buddy";
        Date date = new Date(8/31/2021);
        Integer id = 542;

        Dog dog = new Dog(name, date, id);

        String setName = dog.getName();
        Date setDate = dog.getBirthDate();
        Integer setID = dog.getId();

        Assert.assertEquals(name,setName);
        Assert.assertEquals(date,setDate);
        Assert.assertEquals(id,setID);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        Dog dog = new Dog(null, null, null);

        String dogSpeak = dog.speak();

        Assert.assertEquals("bark!", dogSpeak);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        Date date = new Date("7/21/2023");
        Dog dog = new Dog(null, date,null);
        Date setDate = new Date("7/23/2023");

        dog.setBirthDate(setDate);
        Date newDate = dog.getBirthDate();

        Assert.assertEquals(setDate,newDate);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        Dog dog = new Dog(null,null,0);
        Food dogFood = new Food();
        Integer numOfMeals = 1;

        dog.eat(dogFood);
        Integer dogMeals = dog.getNumberOfMealsEaten();

        Assert.assertEquals(numOfMeals,dogMeals);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIDTest(){
        Integer expectedId = 53;
        Dog dog = new Dog(null,null,expectedId);

        Integer getDogId = dog.getId();

        Assert.assertEquals(expectedId,getDogId);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void dogAnimalInheritanceTest(){
            Dog dog = new Dog(null,null,null);
            Assert.assertTrue(dog instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void dogMammalInheritanceTest(){
        Dog dog = new Dog(null,null,null);
        Assert.assertTrue(dog instanceof Mammal);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
