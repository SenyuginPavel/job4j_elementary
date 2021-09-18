package ru.job4j.condition;

import java.util.concurrent.locks.Condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right  ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int sum = Max.max(33, 20);
        System.out.println(sum);
    }
}
