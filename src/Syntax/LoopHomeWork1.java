package Syntax;

import java.util.stream.IntStream;

public class LoopHomeWork1 {
    public static void main(String[] args) {
        System.out.println("=======TASK1=======");
        task1();
        System.out.println("=======TASK2=======");
        task2();
        System.out.println("=======TASK3=======");
        task3();
        System.out.println("=======TASK4=======");
        task4();
        System.out.println("=======TASK5=======");
        task5();
        System.out.println("=======TASK6=======");
        task6();
        System.out.println("=======TASK7=======");
        task7();
        System.out.println("=======TASK8=======");
        task8();
        System.out.println("=======TASK9=======");
        task9();
        System.out.println("=======TASK10=======");
        task10();

    }

    private static void task1() {
//        IntStream.range(1, 11).forEach(System.out::println);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    private static void task2() {
//        IntStream.iterate(11 - 1, i -> i - 1).limit(11 - 1).forEach(System.out::println);
        for (int i  = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    private static void task3() {
//        IntStream.iterate(0, i -> i+=2).limit(9).forEach(System.out::println);
        for (int i = 0; i < 17; i+=2) {
            System.out.println(i);
        }
    }

    private static void task4() {
//        IntStream.rangeClosed(-10, 10).forEach(System.out::println);
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    private static void task5() {
//        IntStream.iterate(1904, i -> i+=4).limit(49).forEach(System.out::println);
        for (int i = 1904; i <= 2096; i+=4) {
            System.out.printf("%d год является високосным\n", i);
        }
    }

    private static void task6() {
//        System.out.printf("%s\n",
//                String.join(" ",
//                        IntStream.iterate(7, i -> i+=7).limit(14).mapToObj(String::valueOf).toList()));

        for (int i = 7; i < 100; i+=7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void task7() {
//        System.out.printf("%s\n",
//            String.join(" ",
//                    IntStream.iterate(1, i -> i*2).limit(10).mapToObj(String::valueOf).toList()));

        for (int i = 1; i < 512; i*=2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void task8() {
//        IntStream.iterate(29000, i -> i+= 29000).limit(12)
//                .forEach(i -> System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i / 29000, i));

        int sum = 0;
        int everyMonthIncome = 29000;
        for (int i = 1; i <= 12; i++) {
            sum += everyMonthIncome;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, sum);
        }
    }

    private static void task9() {
        int sum = 0;
        int everyMonthIncome = 29000;
        for (int i = 1; i <= 12; i++) {
            sum *= 1.01;
            sum += everyMonthIncome;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, sum);
        }
    }

    private static void task10() {
//        IntStream.rangeClosed(1, 10).forEach(i -> System.out.printf("2 x %d = %d\n", i, i * 2));

        for (int i = 1; i <= 10; i++) {
            System.out.printf("2 x %d = %d\n", i, i * 2);
        }
    }
}
