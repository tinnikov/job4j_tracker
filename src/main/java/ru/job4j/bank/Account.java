package ru.job4j.bank;

/**
 * Класс модели банковского счета
 * @author TinnikovKR
 * @version 1.0
 */

public class Account {
    /**
     *  Хранение данных банковского счета:
     *  реквизиты банковского счета - объект типа String
     *  баланс банковского счета - переменная типа double
     */
    private String requisite;
    private double balance;
    /**
     * Конструктор класса Account
     * @param requisite реквизиты банковского счета
     * @param balance баланс банковского счета
     */

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }
    /**
     *Метод геттер
     * @return requisite реквизиты банковского счета
     */

    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод сеттер
     * @param requisite реквизиты банковского счета
     */

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод геттер
     * @return баланс банковского счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * метод сеттер
     * @param balance баланс банковского счета
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Переопределние метода equals() класса Object
     * метод сравнивает банковские счета по реквизитам банковского счета
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Account)) {
            return false;
        }
        Account account = (Account) o;
        return requisite.equals(account.requisite);
    }

    /**
     * Переопределение метода Hashcode()
     * метод сравнивает банковские счета по полю requisite
     */
    @Override
    public int hashCode() {
        return requisite.hashCode();
    }
}
