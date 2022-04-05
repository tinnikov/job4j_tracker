package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {

    }

    public void printInfo() {
        System.out.println("active = " + active);
        System.out.println("status = " + status);
        System.out.println("message = " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        error1.printInfo();
        Error error = new Error(true, 5, "Тест");
        error.printInfo();
        Error error2 = new Error(false, 125, "Второй тест");
        error2.printInfo();
    }
}
