package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        Item dataFormat = new Item();
        String formatData = dataFormat.getCreated().format(formatter);
        System.out.println(formatData);
    }


}
