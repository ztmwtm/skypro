package Syntax;

import java.util.*;
import java.util.stream.Collectors;

public class ArraysHomeWork1 {


    public static void main(String[] args) {
        //TASK 1
        int[] ints = new int[]{1, 2, 3};
        double[] doubles = {1.57, 7.654, 9.986};
        long[] longs = {123L, 321L, 777L, 666L, 314L};

        //TASK 2
        System.out.println("=============TASK 2=============");

        for (int i = 0; i < ints.length; i++) {
            if (i == ints.length - 1) {
                System.out.println(ints[i]);
            } else {
                System.out.print(ints[i] + ", ");
            }
        }

        System.out.println(Arrays.toString(doubles).replaceAll("[\\[\\]]", ""));

        String[] strings = Arrays.stream(longs).mapToObj(String::valueOf).toArray(String[]::new);
        System.out.println(String.join(", ", strings));

        //TASK3
        System.out.println("=============TASK 3=============");

        for (int i = 0; i < ints.length; i++) {
            if (i == ints.length - 1) {
                System.out.println(ints[ints.length - 1 - i]);
            } else {
                System.out.print(ints[ints.length - 1 - i] + ", ");
            }
        }

        for (int i = doubles.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(doubles[i]);
            } else {
                System.out.print(doubles[i] + ", ");
            }
        }

        //Строк конечно меньше, но нервов убито больше ¯\_(ツ)_/¯
        List<Long> longList = new ArrayList<>(Arrays.stream(longs).boxed().toList());
        Collections.reverse(longList);
        System.out.println((longList.stream().map(String::valueOf).collect(Collectors.joining(", "))));

        //TASK4
        System.out.println("=============TASK 4=============");

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 1) {
                ints[i]++;
            }
            if (i == ints.length - 1) {
                System.out.println(ints[i]);
            } else {
                System.out.print(ints[i] + ", ");
            }
        }

//        System.out.println(Arrays.stream(ints).map(e -> e % 2 == 0 ? e : e + 1 ).mapToObj(String::valueOf).collect(Collectors.joining(", ")));
    }
}
