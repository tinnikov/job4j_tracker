package ru.job4j.collection;
import java.util.*;
import java.util.HashSet;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account collect : accounts) {
            rsl.add(collect);
        }
        return rsl;
    }
}
