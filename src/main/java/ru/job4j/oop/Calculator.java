package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = sum(10);
        System.out.println(result);
        System.out.println(calc.multiply(5));
        System.out.println(calc.minus(10));
        System.out.println(calc.divide(100));
        System.out.println(calc.sumAllOperation(12));
    }
}
