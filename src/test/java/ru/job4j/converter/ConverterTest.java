package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
           public void whenConvert140RblThen2Euro() {
            float in = 140;
            float expected = 2;
            float out = Converter.rubleToEuro(in);
            float eps = 0.0001f;
            Assert.assertEquals(expected, out, eps);
        }

        @Test
    public void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollars(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}