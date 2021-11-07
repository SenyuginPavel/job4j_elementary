package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finich) {
        int sum = 0;
        for (sum = start; sum <= finich; sum++) {
            sum = start + finich;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }

}
