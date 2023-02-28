package Core.OOP;

import java.util.Random;

public class HufflepuffStudent extends HogwartsStudent {

    private final int hardworking;
    private final int loyal;
    private final int honest;

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

    public void compareTo(HufflepuffStudent o) {
        int compare = this.hardworking + this.loyal + this.honest - o.hardworking - o.loyal - o.honest;
        if (compare > 0) {
            System.out.printf("%s %s is a better Hufflepuff than %s %s\n", this.getName(), this.getSecondName(), o.getName(), o.getSecondName());
        }
        if (compare == 0) {
            System.out.printf("%s %s is a same Hufflepuff like %s %s\n", this.getName(), this.getSecondName(), o.getName(), o.getSecondName());
        }
        if (compare < 0) {
            System.out.printf("%s %s is a better Hufflepuff than %s %s\n", o.getName(), o.getSecondName(), this.getName(), this.getSecondName());
        }
    }
}
