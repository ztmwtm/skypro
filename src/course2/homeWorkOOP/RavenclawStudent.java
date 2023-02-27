package course2.homeWorkOOP;

import java.util.Random;

public class RavenclawStudent extends HogwartsStudent implements Ravenclaw, Comparable<RavenclawStudent> {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("smart: %d, wise: %d, witty: %d, creativity: %d\n", smart, wise, witty, creativity);
    }

    public RavenclawStudent(String name, String secondName, int magicPower, int transgressDistance, int smart, int wise, int witty, int creativity) {
        super(name, secondName, magicPower, transgressDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public RavenclawStudent(String name, String secondName, int magicPower, int transgressDistance) {
        super(name, secondName, magicPower, transgressDistance);
        Random random = new Random();
        this.smart = random.nextInt(100);
        this.wise = random.nextInt(100);
        this.witty = random.nextInt(100);
        this.creativity = random.nextInt(100);
    }

    public RavenclawStudent(String name, String secondName) {
        super(name, secondName);
        Random random = new Random();
        this.smart = random.nextInt(100);
        this.wise = random.nextInt(100);
        this.witty = random.nextInt(100);
        this.creativity = random.nextInt(100);
    }

    @Override
    public int compareTo(RavenclawStudent o) {
        return this.smart + this.wise + this.witty + this.creativity - o.smart - o.wise - o.witty - o.creativity;
    }

}
