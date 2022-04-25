package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {

        try {
        String[] test = new String[] {"Moscow", "Krasnodar", "Abakan"};
        System.out.println(indexOf(test,"Krasnodar"));
        }

        catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
