package ru.job4j.converter;

public class TestConverter {
    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        float in2 = 120;
        float expected2 = 2;
        float out2 = Converter.rubleToDollars(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed2);

    }

}
