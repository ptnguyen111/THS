package com.mycompany.app;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class RandomizeTest {
    @Test
    public void testRandom1() {
        randomBoolean();
    }

    @Test
    public void testRandom2() {
        randomBoolean();
    }

    @Test
    public void testRandom3() {
        randomBoolean();
    }

    private void randomBoolean() {
        Random generator = new Random();
        Assert.assertTrue(generator.nextBoolean());
    }
}
