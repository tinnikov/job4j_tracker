package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 15);
        Book book2 = new Book("Biblical", 20);
        Book book3 = new Book("Philosophy Java", 30);
        Book book4 = new Book("War and Piece", 50);
        Book[] array = new Book[4];
        array[0] = book1;
        array[1] = book2;
        array[2] = book3;
        array[3] = book4;

        for (Book out : array) {
            System.out.println(out.getName() + " - " + out.getCount());
        }
        System.out.println("Меняем местами первый и последний элемент массива");

        Book[] temp = new Book[4];
        temp[0] = array[0];
        array[0] = array[3];
        array[3] = temp[0];

        for (Book out : array) {
            System.out.println(out.getName() + " - " + out.getCount());
        }

        for (Book out : array) {
            if (out.getName() == "Clean code") {
                System.out.println(out.getName());
            }
        }
    }
}
