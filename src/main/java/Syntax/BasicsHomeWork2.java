package main.java.Syntax;

public class BasicsHomeWork2 {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    private static void task1() {
        byte by = Byte.MAX_VALUE;
        short sh = Short.MIN_VALUE;
        int in = Integer.MAX_VALUE;
        long lo = Long.MIN_VALUE;
        float fl = 0.55f;
        double dou = 0.777877;


        System.out.printf("Значение переменной by с типом %s равно %d\n", byte.class.getName(), by);
        System.out.printf("Значение переменной sh с типом %s равно %d\n", short.class.getName(), sh);
        System.out.printf("Значение переменной in с типом %s равно %d\n", int.class.getName(), in);
        System.out.printf("Значение переменной lo с типом %s равно %d\n", long.class.getName(), lo);
        System.out.printf("Значение переменной fl с типом %s равно %.2f\n", float.class.getName(), fl);
        System.out.printf("Значение переменной dou с типом %s равно %.6f\n", double.class.getName(), dou);


    }

    private static void task2() {
        float f = 27.12f;
        long l = 987678965549L;
        short s = 2786;
        short s2 = 569;
        short s3 = -159;
        short s4 = 27897;
        byte b = 67;
    }

    private static void task3() {
        byte lp = 23;
        byte as = 27;
        byte ea = 30;

        short totalPapers = 480;

        System.out.printf("На каждого ученика рассчитано %d листов бумаги\n", totalPapers / (lp + as + ea));
    }

    private static void task4() {
        byte effInTwoMin = 16;
        short twentyMin = (short) (effInTwoMin * 10);
        short day = (short) (effInTwoMin * 30 * 24);
        int threeDays = day * 3;
        int thirtyDays = threeDays * 10;
        System.out.printf("За 20 минут машина произвела %d штук бутылок\n", twentyMin);
        System.out.printf("За сутки машина произвела %d штук бутылок\n", day);
        System.out.printf("За 3 дня машина произвела %d штук бутылок\n", threeDays);
        System.out.printf("За месяц (30 дней) машина произвела %d штук бутылок\n", thirtyDays);

    }

    private static void task5() {
        byte total = 120;
        byte white = 2;
        byte brown = 4;
        byte classesAmount = (byte) (total / (white + brown));
        byte totalWhite = (byte) (white * classesAmount);
        byte totalBrown = (byte) (brown * classesAmount);

        System.out.printf("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски\n", classesAmount, totalWhite, totalBrown);

    }

    private static void task6() {
        byte bananas = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        short total = (short) (bananas * 5 + milk * 2 + iceCream * 2 + egg * 4);
        System.out.printf("%d гр\n", total);
        System.out.printf("%.2f кг\n", (float) total / 1000);
    }

    private static void task7() {
        short min = 250;
        short max = 500;
        short total = 7000;
        float average = (float) (min + max) / 2;
        byte minDays = (byte) (total / max);
        byte maxDays = (byte) (total / min);
        float averageDays = total / average;
        System.out.printf("В лучшем случае %d дней, в худшем случае %d дней, в среднем %.2f дней\n", minDays, maxDays, averageDays);

    }

    private static void task8() {
        int masha = 6776000;
        int den = 8369000;
        int kri = 7623000;

        int mashaAfter = (int) (masha * 1.1);
        int denAfter = (int) (den * 1.1);
        int kriAfter = (int) (kri * 1.1);

        int mashaDiff = mashaAfter - masha;
        int denDiff = denAfter - den;
        int kriDiff = kriAfter - kri;

        System.out.printf("Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n", (float) mashaAfter / 100, (float) mashaDiff / 100);
        System.out.printf("Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n", (float) denAfter / 100, (float) denDiff / 100);
        System.out.printf("Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n", (float) kriAfter / 100, (float) kriDiff / 100);
    }
}
