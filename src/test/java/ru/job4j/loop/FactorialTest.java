package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 1;
        int b = 5;
        int result = Factorial.calc(n, b);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 1;
        int b = 1;
        int result = Factorial.calc(n, b);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}
