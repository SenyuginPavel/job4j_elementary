package ru.job4j;

public class ArgMethod {
    public static void name(String name) {
        System.out.println("hallo, " + name);
    }

    public static void main(String[] args) {
      String name = "job4j";
        ArgMethod.name(name);
        ArgMethod.name(name);
        ArgMethod.name(name);
        ArgMethod.name(name);
    }
}
