package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {

        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when12215to3699then120dot21() {
        Point a = new Point(122, 15);
        Point b = new Point(36, 99);
        double out = a.distance(b);
        double expected = 120.21;
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when211to20then11() {
        Point a = new Point(2, 11);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        double expected = 11;
        Assert.assertEquals(expected, out, 0.01);
    }
}