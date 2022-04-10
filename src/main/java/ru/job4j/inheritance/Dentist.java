package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String teeth;

    public Dentist(String name, String surname, String education, String birthday, String heal, String teeth) {
        super(name, surname, education, birthday, heal);
        this.teeth = teeth;
    }

    public String getTeeth() {
        return teeth;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println(getTeeth());
    }
}
