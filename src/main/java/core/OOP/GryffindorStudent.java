package core.OOP;

import java.util.Random;

public class GryffindorStudent extends HogwartsStudent {

    private final int nobility;
    private final int honor;
    private final int courage;

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

    public void compareTo(GryffindorStudent o) {
        int compare = this.nobility + this.honor + this.courage - o.nobility - o.honor - o.courage;
        if (compare > 0) {
            System.out.printf("%s %s is a better Gryffindor than %s %s\n", this.getName(), this.getSecondName(), o.getName(), o.getSecondName());
        }
        if (compare == 0) {
            System.out.printf("%s %s is a same Gryffindor like %s %s\n", this.getName(), this.getSecondName(), o.getName(), o.getSecondName());
        }
        if (compare < 0) {
            System.out.printf("%s %s is a better Gryffindor than %s %s\n", o.getName(), o.getSecondName(), this.getName(), this.getSecondName());
        }
    }
}
