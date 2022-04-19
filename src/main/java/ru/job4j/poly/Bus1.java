package ru.job4j.poly;

public class Bus1 implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Двигается по скоростным трассам");
    }

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " Бесшумно передвигается по трассе");
    }
}
