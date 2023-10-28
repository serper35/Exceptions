
import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

import java.util.Scanner;

import static Checker.Checker.check;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.next();
        String password = scanner.next();
        String confirmPassword = scanner.next();

        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
    }
}
