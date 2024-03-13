package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testAdd(){
        Cat cat = new Cat(null,null,null);

        int initialSize = CatHouse.getNumberOfCats(); //Gets the initial count to make sure we add a cat
        CatHouse.add(cat);

        Assert.assertEquals((int) CatHouse.getNumberOfCats(), initialSize + 1);
        CatHouse.clear();
    }


    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveByID(){
        //there is a cat
        //this cat has an ID
        int expected = 89456;
        Cat cat = new Cat(null,null,expected);

        CatHouse.add(cat);
        CatHouse.remove(expected);

        Assert.assertNull(CatHouse.getCatById(89456));
        CatHouse.clear();
    }


    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveObj(){
        Cat cat = new Cat(null,null,null);

        CatHouse.add(cat);
        int initialSize = CatHouse.getNumberOfCats();
        CatHouse.remove(cat);

        Assert.assertEquals((int) CatHouse.getNumberOfCats(), initialSize - 1);
        CatHouse.clear();
    }


    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatById(){
        int expectedId = 123456;
        Cat cat = new Cat(null,null,expectedId);

        CatHouse.add(cat);
        Assert.assertTrue(cat == CatHouse.getCatById(expectedId));
        CatHouse.clear();
    }


    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats(){
        Cat cat = new Cat(null,null,null);

        int initialSize = CatHouse.getNumberOfCats(); //Gets the initial count to make sure we add a cat
        CatHouse.add(cat);

        Assert.assertEquals((int) CatHouse.getNumberOfCats(), initialSize + 1);
        CatHouse.clear();
    }


}
