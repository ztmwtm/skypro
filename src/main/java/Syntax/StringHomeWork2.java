package Syntax;

import java.time.LocalDate;

public class StringHomeWork2 {
    public static void main(String[] args) {
        //task1
        printIsLeapYear(1986);
        //task2
        printAppVersionRecommendation(1, 2023);
        //task3
        printDeliveryTime(95);
    }

    private static void printIsLeapYear(int year) {
        System.out.printf(isLeapYear(year) ? "%d год — високосный год" : "%d год — невисокосный год\n", year);
    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }

    private static void printAppVersionRecommendation(int os, int yearOfManufacture) {
        if (yearOfManufacture == LocalDate.now().getYear()) {
            switch (os) {
                case 0 -> System.out.println("Установите версию приложения для iOS по ссылке.");
                case 1 -> System.out.println("Установите версию приложения для Android по ссылке.");
                default -> System.out.println("Неверно указана ОС");
            }
        } else {
            switch (os) {
                case 0 -> System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                case 1 -> System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                default -> System.out.println("Неверно указана ОС");
            }
        }
    }

    private static void printDeliveryTime(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance < 0) {
            System.out.println("Расстояние не может быть отрицательным.");
            return;
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставка только до 100 км");
            return;
        }

        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.printf("Доставка займет: %d дня", deliveryDays);
    }
}
