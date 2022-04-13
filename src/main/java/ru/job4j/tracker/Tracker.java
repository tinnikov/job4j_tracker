package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] names = items;
        Item[] rsl = new Item[names.length];

        int value = 0;
        for (int index = 0; index < names.length; index++) {
            Item name = names[index];
            if (name != null) {
                rsl[value] = name;
                value++;
            }

        }
        rsl = Arrays.copyOf(rsl, value );
        return rsl;
    }

    public Item[] findByName(String key) {
       Item[] names = items;
        Item[] rsl = new Item[size];
        int value = 0;
        for (int index = 0; index < size; index++) {
            Item name = names[index];
            if (key.equals(name.getName())) {
                rsl[value] = name;
                value++;
            }
        }
        rsl = Arrays.copyOf(rsl, value );
        return rsl;
    }

}