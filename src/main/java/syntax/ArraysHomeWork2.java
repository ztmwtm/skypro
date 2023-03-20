package syntax;

import java.util.Arrays;

public class ArraysHomeWork2 {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(30);

        System.out.println("=====================TASK1=====================");
        System.out.printf("Сумма трат за месяц составила %d рублей.\n", task1(arr));

        System.out.println("=====================TASK2=====================");
        int[] task2Result = task2(arr);
        System.out.printf("Минимальная сумма трат за день составила %d рублей." +
                " Максимальная сумма трат за день составила %d рублей.\n", task2Result[0], task2Result[1]);

        System.out.println("=====================TASK3=====================");
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.\n", task3(arr));

        System.out.println("=====================TASK4=====================");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        task4(reverseFullName);
    }


    private static long task1(int[] arr) {
        long sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
//        return Arrays.stream(arr).sum();
    }

    private static int[] task2(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        return new int[]{min, max};
    }

    private static double task3(int[] arr) {
        return (double) Arrays.stream(arr).sum() / arr.length;
    }

    private static void task4(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[chars.length - i - 1]);
        }
        System.out.println();
    }


    public static int[] generateRandomArray(int length) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
