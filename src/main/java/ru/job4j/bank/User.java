package ru.job4j.bank;

import java.util.Objects;

/**
 *  Класс модели пользователя банка
 * @author TinnikovKR
 * @version 1.0
 */

public class User {
    /**
     * Хранение данных паспорта и фИО, осуществляется объектами типа String
     */
    private String passport;
    private String username;

    /**
     * Конструктор класса User
     * @param passport паспорт пользователя
     * @param username ФИО пользователя
     */

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод геттер
     * @return данные паспорта пользователя
     */

    public String getPassport() {
        return passport;
    }

    /**
     * Метод сеттер
     * @param passport данные паспорта пользователя
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод геттер
     * @return ФИО пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод сеттер
     * @param username ФИО пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Переопределение метода equals() класс Object
     * Метод сравнивает пользователя банка по паспорту
     * @return Возвращает true если пользователь существует или false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Переопределение метода Hashcode класса Object
     * Метод сравнивает пользователя банка по паспорту
     */

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
