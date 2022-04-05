package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Fox fox = new Fox();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        wolf.tryEat();
        hare.tryEat();
        fox.tryEat();
    }
}
