package ru.job4j.ru.job4j.calculator.ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double step1 = x2 - x1;
        double step2 = y2 - y1;
        double step3 = Math.pow(step1, 2) + Math.pow(step2, 2);
        double rsl = Math.sqrt(step3);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(3, 4, 7, 1);
        double result3 = Point.distance(1, 4, 3, 9);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result2 (3, 4) to (7, 1) " + result2);
        System.out.println("result3 (1, 4) to (3, 9) " + result3);
    }
}
