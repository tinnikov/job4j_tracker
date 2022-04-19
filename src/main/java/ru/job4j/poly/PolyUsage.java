package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle airplane1 = new Airplane();
        Vehicle bus = new Bus1();
        Vehicle bus1 = new Bus1();
        Vehicle train = new Train();
        Vehicle train1 = new Train();
        Vehicle[] vehicles = new Vehicle[] {airplane, bus, train, bus1, airplane1, train1};
        for (Vehicle a : vehicles) {
            a.move();
            a.sound();
        }
    }
}
