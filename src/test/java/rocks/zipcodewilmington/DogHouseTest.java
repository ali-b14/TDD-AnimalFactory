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
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testAdd(){
        Dog dog = new Dog(null,null,null);
        int initialSize = DogHouse.getNumberOfDogs(); //Gets the initial count to make sure we add a dog
        DogHouse.add(dog);
        Assert.assertEquals((int) DogHouse.getNumberOfDogs(), initialSize + 1);
        DogHouse.clear();
    }


    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveByID(){
        int expected = 89456;
        Dog dog = new Dog(null,null,expected);
        DogHouse.add(dog);
        int initialSize = DogHouse.getNumberOfDogs();
        DogHouse.remove(expected);
        Assert.assertEquals((int) DogHouse.getNumberOfDogs(), initialSize - 1);
    }


    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveObj(){
        Dog dog = new Dog(null,null,null);
        DogHouse.add(dog);
        int initialSize = DogHouse.getNumberOfDogs();
        DogHouse.remove(dog);
        Assert.assertEquals((int) DogHouse.getNumberOfDogs(), initialSize - 1);
        DogHouse.clear();
    }


    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogById(){
        int expectedId = 123456;
        Dog dog = new Dog(null,null,expectedId);
        DogHouse.add(dog);
        Assert.assertTrue(dog == DogHouse.getDogById(expectedId));
        DogHouse.clear();
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
