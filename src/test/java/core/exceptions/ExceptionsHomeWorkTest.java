package core.exceptions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static core.exceptions.ExceptionsHomeWork.checkPassword;
import static org.junit.jupiter.api.Assertions.*;

class ExceptionsHomeWorkTest {

//    @Test
//    @Tag("ExceptionHomeWork")
//    @DisplayName("checkPassword Test")
//    void checkPasswordNull() {
//        String login = null;
//        String password = null;
//        String confirmPassword = null;
//        assertThrows(NullPointerException.class, () -> checkPassword(login,password,confirmPassword));
//    }

    @Test
    @Tag("ExceptionHomeWork")
    @DisplayName("checkPassword Test")
    void checkPasswordTrue1() {
        String login = "123z";
        String password = "DDFFF";
        String confirmPassword = "DDFFF";
        assertTrue(checkPassword(login, password, confirmPassword));
    }

    @Test
    @Tag("ExceptionHomeWork")
    @DisplayName("checkPassword Test")
    void checkPasswordFalse0() {
        String login = "123z";
        String password = "z$DDFFF";
        String confirmPassword = "z$DDFFF";
        assertFalse(checkPassword(login, password, confirmPassword));
    }

    @Test
    @Tag("ExceptionHomeWork")
    @DisplayName("checkPassword Test")
    void checkPasswordTrue3() {
        String login = "123z";
        String password = "DDFFF";
        String confirmPassword = "DDFFF";
        assertTrue(checkPassword(login, password, confirmPassword));
    }

    @Test
    @Tag("ExceptionHomeWork")
    @DisplayName("checkPassword Test")
    void checkPasswordFalse1() {
        String login = "123z^^^";
        String password = "z$DDFFF";
        String confirmPassword = "z$DDFFF";
        assertFalse(checkPassword(login, password, confirmPassword));
    }

    @Test
    @Tag("ExceptionHomeWork")
    @DisplayName("checkPassword Test")
    void checkPasswordFalse2() {
        String login = "AS12_12aaa";
        String password = "z$DDFFF";
        String confirmPassword = "z$DDFFF";
        assertFalse(checkPassword(login, password, confirmPassword));
    }

    @Test
    @Tag("ExceptionHomeWork")
    @DisplayName("checkPassword Test")
    void checkPasswordFalse3() {
        String login = "AS12_12aaaaa";
        String password = "z$DDddddddddddddddddddddddddFFF";
        String confirmPassword = "z$DDddddddddddddddddddddddddFFF";
        assertFalse(checkPassword(login, password, confirmPassword));
    }

    @Test
    @Tag("ExceptionHomeWork")
    @DisplayName("checkPassword Test")
    void checkPasswordFalse4() {
        String login = "AS12_12aaaaa";
        String password = "z$DDddddd";
        String confirmPassword = "z$DDdd";
        assertFalse(checkPassword(login, password, confirmPassword));
    }


    @Test
    @Tag("ExceptionHomeWork")
    @DisplayName("checkPassword Test")
    void checkPasswordFalse5() {
        String login = "AS12_12aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String password = "z$DDFFF";
        String confirmPassword = "z$DDFFF";
        assertFalse(checkPassword(login, password, confirmPassword));
    }
}