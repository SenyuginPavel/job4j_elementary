package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return num % 1 == 0;
    }

    public static boolean notPositive(int num) {
        return num > -5;
    }

    public static boolean notEvenAndPositive(int num) {
        return num % 3 == 0 && num > 5;
    }

    public static boolean evenOrNotPositive(int num) {
        return num % 4 == 0 && num > -9;
    }

}
