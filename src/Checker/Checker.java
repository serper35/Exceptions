package Checker;

import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {
    public static void check(String login, String password, String confirmPassword) {

        Pattern pattern = Pattern.compile("^[\\w][a-zA-Z0-9_]{1,19}");
        Matcher logMatcher = pattern.matcher(login);
        Matcher passMatcher = pattern.matcher(password);

        if (!logMatcher.matches()) {
            throw new WrongLoginException("В логине содержатся некорректные символы!");
        }

        if (!passMatcher.matches()) {
            throw new WrongPasswordException("В пароле содержатся некорректные символы!");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Ошибка подтверждения пароля!");
        }
    }
}
