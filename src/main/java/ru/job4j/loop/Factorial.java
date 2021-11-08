package ru.job4j.loop;

public class Factorial {
    public static int calc(int n, int b) {
        int result = 1;

        for (int i = n; i <= b; i++) {

            result = result * i;
        }

        return result;

    }
}
