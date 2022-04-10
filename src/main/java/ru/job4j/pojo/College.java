package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Тинников Константин Рафаилович");
        student.setGroup("Бакалавр");
        student.setDate(new Date(98, 06, 05));
        System.out.println("ФИО: " + student.getFio() + System.lineSeparator() + "Группа: " + student.getGroup() + System.lineSeparator() + "Дата поступления: " + student.getDate());
    }
}
