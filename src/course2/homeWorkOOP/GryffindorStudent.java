package course2.homeWorkOOP;

import java.util.Random;

public class GryffindorStudent extends HogwartsStudent implements Gryffindor, Comparable<GryffindorStudent> {

    private int nobility;
    private int honor;
    private int courage;

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("nobility: %d, honor: %d, courage: %d\n", nobility, honor, courage);
    }

    public GryffindorStudent(String name, String secondName, int magicPower, int transgressDistance, int nobility, int honor, int courage) {
        super(name, secondName, magicPower, transgressDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public GryffindorStudent(String name, String secondName, int magicPower, int transgressDistance) {
        super(name, secondName, magicPower, transgressDistance);
        Random random = new Random();
        this.nobility = random.nextInt(100);
        this.honor = random.nextInt(100);
        this.courage = random.nextInt(100);
    }

    public GryffindorStudent(String name, String secondName) {
        super(name, secondName);
        Random random = new Random();
        this.nobility = random.nextInt(100);
        this.honor = random.nextInt(100);
        this.courage = random.nextInt(100);
    }

    @Override
    public int compareTo(GryffindorStudent o) {
        return this.nobility + this.honor + this.courage - o.nobility - o.honor - o.courage;
    }
}
