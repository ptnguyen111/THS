package com.mycompany.app;

import org.junit.Assert;
import org.junit.Test;

public class Bit2Test {

    @Test
    public void testValue() {
        Bit2 one = Bit2.newOne();
        Bit2 zero = Bit2.newZero();

        Assert.assertTrue(one.value());
        Assert.assertFalse(zero.value());

        Assert.assertEquals(1, one.valueAsInt());
        Assert.assertEquals(0, zero.valueAsInt());

        Assert.assertEquals('1', one.valueAsChar());
        Assert.assertEquals('0', zero.valueAsChar());
    }

    @Test
    public void testConstructor() {
        Bit2 one = new Bit2(true);
        Assert.assertTrue(one.value());
        Assert.assertEquals(1, one.valueAsInt());
        Assert.assertEquals('1', one.valueAsChar());

        Bit2 zero = new Bit2(0);
        Assert.assertFalse(zero.value());
        Assert.assertEquals(0, zero.valueAsInt());
        Assert.assertEquals('0', zero.valueAsChar());

        Bit2 two = new Bit2(2);
        Assert.assertTrue(two.value());
        Assert.assertEquals(1, two.valueAsInt());
        Assert.assertEquals('1', two.valueAsChar());
    }

}
