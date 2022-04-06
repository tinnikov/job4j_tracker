package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when5more2() {
        Max max2 = new Max();
        int expected = 5;
        int result = max2.max(5, 2);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void When11MoreThan4and7() {
        Max max3 = new Max();
        int expected = 11;
        int result = max3.max(4, 11, 7);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void When21MoreThan4and11adn15() {
        Max max4 = new Max();
        int expected = 21;
        int result = max4.max(4, 11, 21, 15);
        Assert.assertEquals(expected, result);
    }
}