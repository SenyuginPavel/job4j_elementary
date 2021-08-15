package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.pow(x1 - x2, 2);
        return result;
    }

    public static double distance2(int x1, int y1, int x2, int y2) {
        double result2 = Math.pow(y1 - y2, 2);
        return result2;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance2(0, 0, 2, 0);
        double sqrt = result + result2;
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println(result + result2);
        System.out.println(Math.sqrt(sqrt));
    }
}
