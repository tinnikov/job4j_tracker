package ru.job4j.inheritance;

public class Surgeon extends Doctor{

    private String operation;
    public Surgeon(String name, String surname, String education, String birthday, String heal, String operation) {
        super(name, surname, education, birthday, heal);
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println(getOperation());
    }
}
