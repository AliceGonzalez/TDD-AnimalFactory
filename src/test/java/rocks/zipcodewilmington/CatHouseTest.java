package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest(){
        Integer catID = 372;
        Cat cat = new Cat(null, null, catID);

        CatHouse.add(cat);
        Cat actualCat = CatHouse.getCatById(catID);

        Assert.assertEquals(catID, actualCat.getId());
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatByIDTest(){
        Cat cat = new Cat(null, null, 736);
        Integer expectedCatID = null;

        CatHouse.add(cat);
        CatHouse.remove(cat.getId());
        Cat actualCat = CatHouse.getCatById(cat.getId());

        Assert.assertEquals(expectedCatID, actualCat);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest(){
        Cat cat = new Cat("Lola", new Date("6/1/2003"), 236);

        CatHouse.add(cat);
        CatHouse.remove(cat);
        Cat actualCat = CatHouse.getCatById(236);

        Assert.assertEquals(null, actualCat);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void gatCatByIDTest(){
        Cat expectedCat = new Cat("Dave", new Date("3/1/1990"), 723);

        CatHouse.add(expectedCat);
        Cat actualCat = CatHouse.getCatById(723);

        Assert.assertEquals(expectedCat, actualCat);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest(){
        Cat cat1 = new Cat("Milo", new Date("6/2/2020"),342);
        Cat cat2 = new Cat("Eric", new Date("4/1/1998"),911);
        Cat cat3 = new Cat("Muffin", new Date("6/12/1998"),123);
        Integer expectedNum = 3;


        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.add(cat3);
        Integer numOfCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNum,numOfCats);

    }
}
