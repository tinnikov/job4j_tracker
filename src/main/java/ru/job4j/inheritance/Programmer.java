package ru.job4j.inheritance;

public class Programmer extends Engineer {

     private String language;

    public Programmer(String name, String surname, String education, String birthday, String speciality, String language) {
        super(name, surname, education, birthday, speciality);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println(getLanguage());

    }
}
