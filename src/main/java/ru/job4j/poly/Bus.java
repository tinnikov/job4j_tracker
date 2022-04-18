package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Поехали");
     }

    @Override
    public void askPass(int passenger) {
        System.out.println("Количество пассажиров: " + passenger);
     }

    @Override
    public int price(int refuel) {
        return refuel * 49;
     }
}
