package core.exceptions;

public class ExceptionsHomeWork {
    public static void main(String[] args) {

        System.out.println(checkPassword("123z", "DDFFF", "DDFFF"));
        System.out.println(checkPassword("", "", ""));
        System.out.println(checkPassword("123z", "z$DDFFF", "z$DDFFF"));
        System.out.println(checkPassword("123z^^^", "z$DDFFF", "z$DDFFF"));
        System.out.println(checkPassword("AS12_12aaa", "z$DDFFF", "z$DDFFF"));
        System.out.println(checkPassword("AS12_12aaaaa", "z$DDddddddddddddddddddddddddFFF", "z$DDddddddddddddddddddddddddFFF"));
        System.out.println(checkPassword("AS12_12aaaaa", "z$DDddddd", "z$DDdd"));
        System.out.println(checkPassword("AS12_12aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "z$DDFFF", "z$DDFFF"));
    }

    public static boolean checkPassword(String login, String password, String confirmPassword) {
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
