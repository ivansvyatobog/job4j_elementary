package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to10then1dot41() {
        double expected = 1.41;
        Point a = new Point(0, 1);
        Point b = new Point(1, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to14then2dot23() {
        double expected = 2.23;
        Point a = new Point(0, 2);
        Point b = new Point(1, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when26to36then1() {
        double expected = 1;
        Point a = new Point(2, 6);
        Point b = new Point(3, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when48to13then5dot83() {
        double expected = 5.83;
        Point a = new Point(4, 8);
        Point b = new Point(1, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when486to139then6dot55() {
        double expected = 6.55;
        Point a = new Point(4, 8, 6);
        Point b = new Point(1, 3, 9);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when123to795then9dot43() {
        double expected = 9.43;
        Point a = new Point(1, 2, 3);
        Point b = new Point(7, 9, 5);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}