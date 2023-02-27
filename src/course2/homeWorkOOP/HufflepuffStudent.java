package course2.homeWorkOOP;

import java.util.Random;

public class HufflepuffStudent extends HogwartsStudent implements Hufflepuff, Comparable<HufflepuffStudent> {

    private int hardworking;
    private int loyal;
    private int honest;

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("hardworking: %d, loyal: %d, honest: %d\n", hardworking, loyal, honest);
    }

    public HufflepuffStudent(String name, String secondName, int magicPower, int transgressDistance, int hardworking, int loyal, int honest) {
        super(name, secondName, magicPower, transgressDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public HufflepuffStudent(String name, String secondName, int magicPower, int transgressDistance) {
        super(name, secondName, magicPower, transgressDistance);
        Random random = new Random();
        this.hardworking = random.nextInt(100);
        this.loyal = random.nextInt(100);
        this.honest = random.nextInt(100);
    }

    public HufflepuffStudent(String name, String secondName) {
        super(name, secondName);
        Random random = new Random();
        this.hardworking = random.nextInt(100);
        this.loyal = random.nextInt(100);
        this.honest = random.nextInt(100);
    }

    @Override
    public int compareTo(HufflepuffStudent o) {
        return this.hardworking + this.loyal + this.honest - o.hardworking - o.loyal - o.honest;
    }
}
