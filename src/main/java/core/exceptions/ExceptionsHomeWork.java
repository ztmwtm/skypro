package core.exceptions;

import org.springframework.lang.NonNull;

public class ExceptionsHomeWork {
    public static void main(String[] args) {

    }

    public static boolean checkPassword(@NonNull String login, @NonNull String password, @NonNull String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("So sad your login length is " + login.length() + ", but must be not bigger then 20.");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("So sad your password is incorrect.");
            }
        }
        catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }

        return password.length() < 20 && password.matches("([a-zA-Z]|\\d|_)*") && login.matches("([a-zA-Z]|\\d|_)*");

    }
}
