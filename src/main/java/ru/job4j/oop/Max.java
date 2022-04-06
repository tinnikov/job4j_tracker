package ru.job4j.oop;

public class Max {

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        return max(a, b) > max(b, c) ? max(a, b) : max(b, c);
    }

    public int max(int a, int b, int c, int d) {
        return max(a, b, c) > max(b, c, d) ? max(a, b, c) : max(b, c, d);
    }
}