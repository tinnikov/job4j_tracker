package ru.job4j.early;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    public void whenValidPass() {
        String password = "Tinnikovkr1!";
        String expected = PasswordValidator.validate(password);
        assertThat(expected).isEqualTo("Валидация пройдена");
    }

    @Test
    public void whenPassIsNull() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            PasswordValidator.validate(null);
        });
        Assertions.assertEquals("Пароль не может быть null", thrown.getMessage());
    }

    @Test
    public void whenPassIsDiapozon() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            PasswordValidator.validate("Passwor");
        });
        Assertions.assertEquals("Пароль должен быть в диапазоне от 8 до 32 символов", thrown.getMessage());
    }

    @Test
    public void whenPassIsOneUpperLetter() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            PasswordValidator.validate("password1");
        });
        Assertions.assertEquals("Пароль должен содержать хоть одну заглавную букву", thrown.getMessage());
    }

    @Test
    public void whenPassIsOneLowLetter() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            PasswordValidator.validate("PASSWORD1");
        });
        Assertions.assertEquals("Пароль должен содержать хоть одну строчную букву", thrown.getMessage());
    }

    @Test
    public void whenPassIsOneDigit() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            PasswordValidator.validate("Password");
        });
        Assertions.assertEquals("Пароль должен содержать хотя бы одну цифру", thrown.getMessage());
    }

    @Test
    public void whenPassIsOneSpecSymb() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            PasswordValidator.validate("Password1");
        });
        Assertions.assertEquals("Пароль должен содержать один спецсимвол", thrown.getMessage());
    }

    @Test
    public void whenPassIsNoSubstring() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            PasswordValidator.validate("password123P?");
        });
        Assertions.assertEquals("Пароль не должен содержать подстроки в любых регистрах: qwerty, 12345, password, admin, user", thrown.getMessage());
    }
}