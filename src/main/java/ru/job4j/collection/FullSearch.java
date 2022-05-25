package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
<<<<<<< HEAD
        for (Task index : list) {
=======
        for (Task index:
             list) {
>>>>>>> origin/master
            numbers.add(index.getNumber());
        }
        return numbers;
    }
}
