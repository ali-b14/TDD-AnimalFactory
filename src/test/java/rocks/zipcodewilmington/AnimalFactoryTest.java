package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateDog(){
        String givenName = "Billy";
        Date givenBirthDate = new Date();

        Dog dog = AnimalFactory.createDog(givenName, givenBirthDate);

        Assert.assertEquals(givenName, dog.getName());
        Assert.assertEquals(givenBirthDate, dog.getBirthDate());
    }


    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateCat(){
        String givenName = "Obi";
        Date givenBirthDate = new Date();

        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);

        Assert.assertEquals(givenName, cat.getName());
        Assert.assertEquals(givenBirthDate, cat.getBirthDate());

    }


}
