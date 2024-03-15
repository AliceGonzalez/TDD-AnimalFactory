package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        String givenName = "Muffin";
        Date givenDate = new Date("3/4/1997");
        Dog dog = AnimalFactory.createDog(givenName, givenDate);

        Assert.assertEquals(givenName,dog.getName());
        Assert.assertEquals(givenDate,dog.getBirthDate());
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest(){
        String givenName = "Cupcake";
        Date givenDate = new Date("1/4/2000");
        Cat cat = AnimalFactory.createCat(givenName, givenDate);

        Assert.assertEquals(givenName,cat.getName());
        Assert.assertEquals(givenDate,cat.getBirthDate());
    }
}
