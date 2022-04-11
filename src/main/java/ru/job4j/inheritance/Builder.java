package ru.job4j.inheritance;

public class Builder extends Engineer {

    public String house;

     public Builder(String name, String surname, String education, String birthday, String speciality, String house) {
        super(name, surname, education, birthday, speciality);
        this.house = house;
    }

    public String getHouse() {
        return house;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println(getHouse());
    }
}