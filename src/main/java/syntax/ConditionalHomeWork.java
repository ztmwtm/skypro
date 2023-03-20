package syntax;

import java.util.Scanner;

public class ConditionalHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        task1(scanner);
        task2(scanner);
        task3(scanner);
        task4(scanner);
        task5(scanner);
        task6(scanner);
        task7(scanner);
    }

    private static void task1(Scanner scanner) {
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are over 18 years old");
        }
        else {
            System.out.println("You are less than 18 years old. You have to wait a little while...");
        }
    }

    private static void task2(Scanner scanner) {
        System.out.println("Please enter the outdoor temperature");
        int temperature = scanner.nextInt();
        if (temperature < 5) {
            System.out.printf("It's %d degrees outside, you have to wear a hat.\n", temperature);
        }
        else {
            System.out.printf("It's %d degrees outside, you can walk without a hat.\n", temperature);
        }
    }

    private static void task3(Scanner scanner) {
        System.out.println("Please enter the speed");
        int speed = scanner.nextInt();
        if (speed > 60) {
            System.out.printf("If the speed %d, you will have to pay a fine.\n", speed);
        }
        else {
            System.out.printf("If the speed %d, you can drive safely.\n", speed);
        }
    }

    private static void task4(Scanner scanner) {
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        boolean isKindergartenAge =  (2 <= age && age <= 6);
        boolean isSchoolAge =  (7 <= age && age <= 18);
        boolean isInstituteAge =  (19 <= age && age < 24);
        boolean isWorkAge =  (24 <= age && age < 65);
        boolean isPensionAge =  (65 <= age && age <= 130);
        boolean isItPossible = (130 < age);

        if (isKindergartenAge) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад.", age);
        }
        else {
            if (isSchoolAge) {
                System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу.", age);
            }
            if (isInstituteAge) {
                System.out.printf("Если возраст человека равен %d, то ему нужно ходить в институт.", age);
            }
            if (isWorkAge) {
                System.out.printf("Если возраст человека равен %d, то ему нужно ходить на работу.", age);
            }
            if (isPensionAge) {
                System.out.printf("Если возраст человека равен %d, то он пенсионер.", age);
            }
            if (isItPossible) {
                System.out.printf("Если возраст человека равен %d, то столько не живут ¯\\_(ツ)_/¯.", age);
            }
        }
    }

    private static void task5(Scanner scanner) {
        System.out.println("Please enter child age");
        int age = scanner.nextInt();
        boolean isNotAllowed =  (age < 5);
        boolean isAllowedWithParents =  (5 <= age && age < 14);
        boolean isAllowedWithoutParents =  (14 <= age);

        if (isNotAllowed) {
            System.out.printf("Если возраст ребенка равен %d, то ему нельзя кататься на аттракционе.", age);
        }
        else {
            if (isAllowedWithParents) {
                System.out.printf("Если возраст ребенка равен %d, то ему можно кататься на аттракционе в сопровождении.", age);
            }
            if (isAllowedWithoutParents) {
                System.out.printf("Если возраст ребенка равен %d, то ему можно кататься на аттракционе без сопровождения взрослого.", age);
            }
        }
    }

    private static void task6(Scanner scanner) {
        System.out.println("Please enter the number of passengers.");
        int numberOfPassengers = scanner.nextInt();

        if (numberOfPassengers >= 102) {
            System.out.println("Мест нет.");
        }
        else {
            if (numberOfPassengers < 60) {
                System.out.println("Есть сидячие места.");
            }
            else {
                System.out.println("Есть стоячие места.");
            }
        }
    }

    private static void task7(Scanner scanner) {
        System.out.println("Please enter 3 numbers");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        if(one >= two && one >= three) {
            System.out.printf("The biggest is %d", one);
        }
        else {
            if (two >= three) {
                System.out.printf("The biggest is %d", two);
            }
            else {
                System.out.printf("The biggest is %d", three);
            }
        }
    }

}
