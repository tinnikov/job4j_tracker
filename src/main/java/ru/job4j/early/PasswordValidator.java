package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        boolean upperFlag = false;
        boolean lowFlag = false;
        boolean isDigit = false;
        boolean isSpecCh = false;
        boolean testStr = true;
        String[] noStr = new String[] {"qwerty", "12345", "password", "admin", "user"};
        if (password == null) {
            throw new IllegalArgumentException("Пароль не может быть null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Пароль должен быть в диапазоне от 8 до 32 символов");
        }
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                upperFlag = true;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                lowFlag = true;
            }
            if (Character.isDigit(password.charAt(i))) {
                isDigit = true;
            }
           if (!Character.isLetterOrDigit(password.charAt(i))) {
                isSpecCh = true;
            }
            if (upperFlag && lowFlag && isDigit && isSpecCh) {
                break;
            }
        }
        for (String s : noStr) {
            String low = s.toLowerCase();
            if (password.contains(low)) {
                testStr = false;
                break;
            }
        }
        if (!upperFlag) {
            throw new IllegalArgumentException("Пароль должен содержать хоть одну заглавную букву");
        }
        if (!lowFlag) {
            throw new IllegalArgumentException("Пароль должен содержать хоть одну строчную букву");
        }
        if (!isDigit) {
            throw new IllegalArgumentException("Пароль должен содержать хотя бы одну цифру");
        }
        if (!isSpecCh) {
            throw new IllegalArgumentException("Пароль должен содержать один спецсимвол");
        }
        if (!testStr) {
            throw new IllegalArgumentException("Пароль не должен содержать подстроки в любых регистрах: "
                    + "qwerty, 12345, password, admin, user");
        }
        return "Валидация пройдена";
    }
}
