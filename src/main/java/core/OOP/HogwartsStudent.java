package core.OOP;

import java.util.concurrent.ThreadLocalRandom;

public abstract class HogwartsStudent {
    private final int magicPower;
    private final int transgressDistance;
    private final String name;
    private final String secondName;

    public HogwartsStudent(String name, String secondName, int magicPower, int transgressDistance) {
        this.name = name;
        this.secondName = secondName;
        this.magicPower = magicPower;
        this.transgressDistance = transgressDistance;
    }

    public HogwartsStudent(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
        ThreadLocalRandom random = ThreadLocalRandom.current();
        magicPower = random.nextInt(100);
        transgressDistance = random.nextInt(100);
    }

    public void compareMagicPower(HogwartsStudent hogwartsStudent) {
        System.out.printf(this.magicPower > hogwartsStudent.magicPower ?
                        "%s %s has more magic power than %s %s\n" :
                        "%3$s %4$s has more magic power than %1$s %2$s\n",
                this.name, this.secondName, hogwartsStudent.name, hogwartsStudent.secondName);
    }

    public void compareTrasgressDistance(HogwartsStudent hogwartsStudent) {
        System.out.printf(this.transgressDistance > hogwartsStudent.transgressDistance ?
                        "%s %s has more transgress distance than %s %s\n" :
                        "%3$s %4$s has more transgress distance than %1$s %2$s\n",
                this.name, this.secondName, hogwartsStudent.name, hogwartsStudent.secondName);
    }

    public void printInfo() {
        System.out.printf("%s %s magic power : %d transgress distance : %d\n",
                name, secondName, magicPower, transgressDistance);
    }

    public void compareTo(HogwartsStudent o) {
        compareTrasgressDistance(o);
        compareMagicPower(o);
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressDistance() {
        return transgressDistance;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }
}
