package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] index = new int[5];
        for (int a = 0; a < index.length; a++) {
            index[a] = a * 2 + 3;
        }
        for (int a = 0; a < index.length; a++) {
            System.out.println(index[a]);
        }
    }
}
