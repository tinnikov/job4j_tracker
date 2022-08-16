package ru.job4j.bank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author TinnikovKR
 * @version 1.0
 * Класс описывает работу банковской системы *
 * Регистрация пользователя
 * Удаление пользователя
 * Добавление пользователю, банковского счета. У пользователя может быть несколько счетов
 * Перевод денег, с одного банковского счета, на другой счет
 */

public class BankService {
    /**
     * Хранение осуществляется в коллекции типа Map поле содержит всех пользователей системы с привязанными к ним счетами
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя, с пустым счетом
     */
    public void addUser(User user) {
          users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет банковский счет пользователю
     * @param passport паспорт пользователя
     * @param account счет, который добавляем пользователю
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> rsl = users.get(user);
            if (!rsl.contains(account)) {
                rsl.add(account);
            }
        }
    }

    /**
     * Метод осуществляет поиск пользователя по паспорту
     * @param passport паспорт пользователя
     * @return возвращает пользователя или null, если такой пользователь отсутствует
     */

    public User findByPassport(String passport) {
       for (User key: users.keySet()) {
           if (key.getPassport().equals(passport)) {
                return key;
            }
       }
        return null;
        }

    /**
     * Метод осуществляет поиск банковского счета по паспорту и по реквизитам
     * @param passport паспорт пользователя
     * @param requisite реквизиты банковского счета
     * @return возвращает банковский счет или null, если такой счет отсутствует
     */

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
          for (Account key: users.get(user)) {
            if (key.getRequisite().equals(requisite)) {
                    return key;
                }
            }
        }
        return null;
    }

    /**
     * Метод осуществляет перевод банковских средств между банковскими счетами
      * @param srcPassport паспорт отправителя
     * @param srcRequisite реквизиты отправителя
     * @param destPassport паспорт получателя
     * @param destRequisite реквизиты получателя
     * @param amount сумма денежных средств
     * @return возвращает true если перевод успешно осуществлен или false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}