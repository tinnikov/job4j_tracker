package ru.job4j.oop;

public class Student {
    public void song() {
        System.out.println("I believe I can fly");
    }

    public void accordion() {
         System.out.println("Петя играет на баяне");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.song();
        petya.song();
        petya.song();
        petya.accordion();
        petya.accordion();
        petya.accordion();
    }
}
