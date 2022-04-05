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
        int result = sum(10);
        System.out.println(result);
        Calculator multiply = new Calculator();
        System.out.println(multiply.multiply(5));
        Calculator min = new Calculator();
        System.out.println(min.minus(10));
        Calculator div = new Calculator();
        System.out.println(div.divide(100));
        Calculator summa = new Calculator();
        System.out.println(summa.sumAllOperation(12));
    }
}
