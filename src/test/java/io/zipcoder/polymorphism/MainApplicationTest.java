package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class MainApplicationTest {


    //Cat tests
    @Test
    public void testCatConstructor() {
        String expected = "Mittens";
        Cat kitty = new Cat(expected);

        String actual = kitty.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCatSpeak() {
        String expected = "Meow";
        Cat kitty = new Cat(null);
        
        String actual = kitty.speak();
        
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testDogConstructor() {
        String expected = "Fido";
        Dog pupper = new Dog(expected);

        String actual = pupper.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testDogSpeak() {
        String expected = "Bark";
        Dog pupper = new Dog(null);

        String actual = pupper.speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testBirdConstructor() {
        String expected = "Ezylryb";
        Bird birdy = new Bird(expected);

        String actual = birdy.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testBirdSpeak() {
        String expected = "Tweet";
        Bird birdy = new Bird(null);

        String actual = birdy.speak();

        Assert.assertEquals(expected,actual);
    }
}
