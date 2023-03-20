package syntax;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class LoopHomeWork2 {

    private static final DecimalFormat df = new DecimalFormat("0.00");

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
    }

    private static void task1() {
        long monthIncome = 15000_00;
        int annualPercentage = 12;
        long totalIncome = 0;
        int countOfMonths = 0;

        while (totalIncome < 2_459_000_00) {
            countOfMonths++;
            totalIncome += monthIncome;
            totalIncome *= (1 + (double) (annualPercentage / 12) / 100);

        }
        System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей, при процентной ставке %d%% и ежемесячной капитализации.\n"
                , countOfMonths, (double) totalIncome / 100, annualPercentage);
    }

    private static void task2() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");

        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void task3() {
        long population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int period = 10;

        for (int i = 1; i <= period; i++) {
            population = population + (population / 1000) * fertility - (population / 1000) * mortality;
            System.out.printf("Год %d, численность населения составляет %d\n", i, population);
        }
    }

    private static void task4() {
        //Василий нашел какой-то скам под 7% ежемесячно!!!
        long startMoney = 15_000_00;
        int monthPercentage = 7;
        long totalIncome = startMoney;
        int countOfMonths = 0;
        long targetMoney = 12_000_000_00;

        while (totalIncome < targetMoney) {
            totalIncome *= (1 + (double) monthPercentage / 100);
            countOfMonths++;
            System.out.println("Месяц: " + countOfMonths + " Сумма: " +  df.format((double) totalIncome / 100));
        }
        System.out.println("Всего месяцев: " + countOfMonths);
    }

    private static void task5() {
        long startMoney = 15_000_00;
        int monthPercentage = 7;
        long totalIncome = startMoney;
        int countOfMonths = 0;
        long targetMoney = 12_000_000_00;

        while (totalIncome < targetMoney) {
            totalIncome *= (1 + (double) monthPercentage / 100);
            countOfMonths++;
            if (countOfMonths % 6 == 0) {
                System.out.println("Месяц: " + countOfMonths + " Сумма: " + df.format((double) totalIncome / 100));
            }
        }
        System.out.println("Всего месяцев: " + countOfMonths);
    }

    private static void task6() {
        long startMoney = 15_000_00;
        int monthPercentage = 7;
        long totalIncome = startMoney;
        int totalMonths = 108;
        long targetMoney = 12_000_000_00;

        for (int i = 1; i <= totalMonths; i++) {
            totalIncome *= (1 + (double) monthPercentage / 100);
            if (i % 6 == 0) {
                System.out.println("Месяц: " + i + " Сумма: " + df.format((double) totalIncome / 100));
            }
        }
    }

    private static void task7() {
        int firstFridayOfMonth = 3;
        int currentDay = firstFridayOfMonth;
        while (currentDay <= 31) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", currentDay);
            currentDay += 7;
        }
    }

    private static void task8() {
        int cometPeriod = 79;
        int twoHundredYearsBeforeCurrent = LocalDateTime.now().getYear() - 200; //SEEK NAME!!!
        int oneHundredYearsAfterCurrent = LocalDateTime.now().getYear() + 100; //SEEK NAME!!!
        for (int i = 0; i <= oneHundredYearsAfterCurrent; i+= cometPeriod) {
            if (i >= twoHundredYearsBeforeCurrent) {
                System.out.println(i);
            }
        }
    }
}
