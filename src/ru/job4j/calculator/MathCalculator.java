package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second) + minusSum(first, second) + divisionSum(first, second);
    }

    public static void main(String[] args) {
        double minusDiv = minusSum(50, 30);
        double divMinus = divisionSum(100, 2);
        double sum = sum(120, 40);
        double mul = multiply(15, 2);
        double rls = sum - mul - minusDiv - divMinus;
        System.out.println(minusDiv);
        System.out.println(divMinus);
        System.out.println(rls);
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}
