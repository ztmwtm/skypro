package Syntax;

public class BasicsHomeWork1 {

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

    private static void task8() {
        var totalHours = 640;
        var totalWorkers = totalHours / 8;
        var possiblyWorkers = totalWorkers + 94;
        var possiblyHours = possiblyWorkers * 8;

        System.out.printf("Всего работников в компании — %d человек\n", totalWorkers);
        System.out.printf("Если в компании работает %d человек, то всего %d часов работы может быть поделено между сотрудниками.\n", possiblyWorkers, possiblyHours);
    }

    private static void task7() {
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        var differenceWeight  = secondFighterWeight - firstFighterWeight;
        var differenceWeight2  = secondFighterWeight % firstFighterWeight;

        //System.out.println( Double.compare(differenceWeight2, differenceWeight)); <== 0;
    }

    private static void task6() {
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        var totalWeight = firstFighterWeight + secondFighterWeight;
        var differenceWeight = Math.abs(firstFighterWeight - secondFighterWeight);

        System.out.printf("Вес двух бойцов: %.2f\n", totalWeight);
        System.out.printf("Разница в весе: %.2f\n", differenceWeight);
    }

    private static void task5() {
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
    }

    private static void task4() {
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
    }

    private static void task1() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    private static void task2() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    private static void task3() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7636;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }



}
