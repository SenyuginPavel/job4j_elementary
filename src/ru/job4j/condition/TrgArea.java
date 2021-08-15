package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double rls = Math.sqrt((a / 2) + (b / 2) + (c / 2));
        return  rls;
    }
    public static void main(String[] args) {
        double rls = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rls);
    }


}
