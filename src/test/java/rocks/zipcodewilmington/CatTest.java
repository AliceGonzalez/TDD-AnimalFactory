package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    //Given (lays out the pre-conditions for the test)
    // When (performs the action being tested)
    //Then (WHat you see)//
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest(){
        String name = "Milo";
        Date date = new Date("12/01/2023");
        Integer integer = 6;
        Cat cat = new Cat(name,date,integer);
        String newName = "Luna";

        cat.setName(newName);
        String getNameResult = cat.getName();

        Assert.assertEquals(newName, getNameResult);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        String name = "Cookie";
        Date date = new Date("3/5/2004");
        Integer integer = 45;
        Cat cat = new Cat(name,date,integer);

        String catSpeak = cat.speak();

        Assert.assertEquals("meow!", catSpeak);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        String name = "Olly";
        Date date = new Date("6/2/1990");
        Integer integer = 3;
        Cat cat = new Cat(name, date, integer);
        Date newBirthDate = new Date("4/2/2019");

        cat.setBirthDate(newBirthDate);
        Date getBirthDate = cat.getBirthDate();

        Assert.assertEquals(newBirthDate, getBirthDate);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void  eatTest(){
        //public void eat(Food food) {eatenMeals.add(food);}
        String name = "Rosa";
        Date date = new Date("6/12/1994");
        Integer integer = 16;
        Cat cat = new Cat(name, date, integer);
        Food newFood = new Food();
        Integer numOfMeals = 1;

        cat.eat(newFood);
        Integer getMealsEaten = cat.getNumberOfMealsEaten();

        Assert.assertEquals(numOfMeals, getMealsEaten);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void integerTest(){
        Integer newID = 1234;
        Cat cat = new Cat (null, null, newID);

        Integer actualID= cat.getId();

        Assert.assertEquals(newID,actualID);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword` (True or False)
    @Test
    public void catAnimalInheritanceTest(){
        Cat cat = new Cat(null,null,null);
        Assert.assertTrue(cat instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword` (True or False)
    @Test
    public void catMammalInheritanceTest(){
        Cat cat = new Cat(null,null,null);
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
}
