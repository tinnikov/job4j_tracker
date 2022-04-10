package ru.job4j.inheritance;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        return birthday;
    }

    public void printInfo() {
        System.out.println(getName() + " " + getSurname() + " " + getEducation() + " " + getBirthday());
    }

    public static void main(String[] args) {
        Profession prof = new Profession("Костя", "Тинников", "Высшее", "11.12.1980");
        Engineer engin = new Engineer(prof.getName(), prof.getSurname(), prof.getEducation(), prof.getBirthday(), "Инженер");
        Profession java = new Programmer(prof.getName(), prof.getSurname(), prof.getEducation(), prof.getBirthday(), engin.getSpeciality(), "программист Java");
        java.printInfo();
    }
}
