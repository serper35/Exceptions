import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.next();
        String password = scanner.next();
        String confirmPassword = scanner.next();

        try {
            Checker.check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}
