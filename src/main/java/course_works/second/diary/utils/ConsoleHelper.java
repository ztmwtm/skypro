/**
 * Simple consoleHelper for read and write to console
 * Able to read Strings int Integers
 * readInteger method have overloaded version with borders
 * values out of borders rejected and method ask to repeat input
 * borders included to return values
 */


package course_works.second.diary.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader consoleIn;

    public ConsoleHelper() {
    }

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        while(true) {
            try {
                return consoleIn.readLine();
            } catch (IOException var1) {
                System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            }
        }
    }

    public static int readInt() {
        while(true) {
            try {
                return Integer.parseInt(readString());
            } catch (NumberFormatException var1) {
                System.out.println("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
            }
        }
    }

    public static int readInt(int start, int end) {
        while(true) {
            int result;
            try {
                result = Integer.parseInt(readString());
                if (start <= result && result <= end) {
                    return result;
                }
                else {
                    System.out.printf("Введите число в диапазоне %d %d включительно\n", start, end);
                }
            } catch (NumberFormatException var1) {
                System.out.println("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
            }
        }
    }

    static {
        consoleIn = new BufferedReader(new InputStreamReader(System.in));
    }
}
