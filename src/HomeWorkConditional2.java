import java.util.Scanner;

public class HomeWorkConditional2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        task1(scanner);
        task2(scanner);
        task3(scanner);
        task4(scanner);
        task5(scanner);
    }

    private static void task1(Scanner scanner) {
        System.out.println("Укажите тив вашей ОС: 0 - iOS, 1 - Android");
        int clientOS = scanner.nextInt();
        switch (clientOS) {
            case 0 -> System.out.println("Установите версию приложения для iOS по ссылке.");
            case 1 -> System.out.println("Установите версию приложения для Android по ссылке.");
            default -> System.out.println("Неверно указана ОС");
        }
    }

    private static void task2(Scanner scanner) {
        System.out.println("Укажите тив вашей ОС: 0 - iOS, 1 - Android");
        int clientOS = scanner.nextInt();
        System.out.println("Укажите год выпуска телефона");
        int clientDeviceYear = scanner.nextInt();

        if (clientDeviceYear >= 2015) {
            switch (clientOS) {
                case 0 -> System.out.println("Установите версию приложения для iOS по ссылке.");
                case 1 -> System.out.println("Установите версию приложения для Android по ссылке.");
                default -> System.out.println("Неверно указана ОС");
            }
        }
        else {
            switch (clientOS) {
                case 0 -> System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                case 1 -> System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                default -> System.out.println("Неверно указана ОС");
            }
        }
    }

    private static void task3(Scanner scanner) {
        System.out.println("Укажите год");
        int year = scanner.nextInt();
        boolean isLeap = year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
        System.out.println(isLeap ? "Високосный" : "Не високосный");
    }

    private static void task4(Scanner scanner) {
        System.out.println("Укажите расстояние для доставки");
        int deliveryDistance = scanner.nextInt();
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

    private static void task5(Scanner scanner) {
        System.out.println("Укажите номер месяца");
        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
            case 1, 2, 12 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Не верно указан месяц");
        }
    }
}
