package core.OOP;

import java.util.Random;

public class SlytherinStudent extends HogwartsStudent {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("cunning: %d, determination: %d, ambition: %d, resourcefulness: %d, lust of power: %d\n",
                cunning, determination, ambition, resourcefulness, lustForPower);
    }

    public SlytherinStudent(String name, String secondName, int magicPower, int transgressDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, secondName, magicPower, transgressDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public SlytherinStudent(String name, String secondName, int magicPower, int transgressDistance) {
        super(name, secondName, magicPower, transgressDistance);
        Random random = new Random();
        this.cunning = random.nextInt(100);
        this.determination = random.nextInt(100);
        this.ambition = random.nextInt(100);
        this.resourcefulness = random.nextInt(100);
        this.lustForPower = random.nextInt(100);
    }

    public SlytherinStudent(String name, String secondName) {
        super(name, secondName);
        Random random = new Random();
        this.cunning = random.nextInt(100);
        this.determination = random.nextInt(100);
        this.ambition = random.nextInt(100);
        this.resourcefulness = random.nextInt(100);
        this.lustForPower = random.nextInt(100);
    }

    public void compareTo(SlytherinStudent o) {
        int compare = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower
                - o.cunning - o.determination - o.ambition - o.resourcefulness - o.lustForPower;

        if (compare > 0) {
            System.out.printf("%s %s is a better Slytherin than %s %s\n", this.getName(), this.getSecondName(), o.getName(), o.getSecondName());
        }
        if (compare == 0) {
            System.out.printf("%s %s is a same Slytherin like %s %s\n", this.getName(), this.getSecondName(), o.getName(), o.getSecondName());
        }
        if (compare < 0) {
            System.out.printf("%s %s is a better Slytherin than %s %s\n", o.getName(), o.getSecondName(), this.getName(), this.getSecondName());
        }
    }

}
