package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testSetName(){
        //Given
        Cat cat = new Cat(null,null,null);
        String expected = "Kitty";
        //When
        cat.setName(expected);
        String actual = cat.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        Cat cat = new Cat(null,null,null);
        String expected = "meow!";

        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate(){
        Cat cat = new Cat(null,null,null);
        Date expected = new Date(2016,10,20);

        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();

        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat(){
        Cat cat = new Cat(null,null,null);
        Food food = new Food();

        cat.eat(food);

        Assert.assertTrue(cat.getNumberOfMealsEaten() > 0);

    }


    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId(){
        Cat cat = new Cat(null,null,89456);
        int expected = 89456;

        int actual = cat.getId();

        Assert.assertEquals(expected, actual);
    }


    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance(){
        Cat cat = new Cat(null,null,null);

        Assert.assertTrue(cat instanceof Cat);
    }


    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance(){
        Cat cat = new Cat(null,null,null);

        Assert.assertTrue(cat instanceof Mammal);
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
