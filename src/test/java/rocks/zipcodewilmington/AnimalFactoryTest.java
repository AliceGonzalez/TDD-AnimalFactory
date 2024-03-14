package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
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
        String name = "Snoopy";
        Date birthDate = new Date(4/7/2022);

        Dog dog = new Dog (name,birthDate, null);

        String newName = dog.createDog();
        Date newDate = creat

    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
}
