package course2.homeWorkOOP;

import java.util.Random;

public abstract class HogwartsStudent implements Hogwarts {
    int magicPower;
    int transgressDistance;
    private String name;
    private String secondName;


    public HogwartsStudent(String name, String secondName, int magicPower, int transgressDistance) {
        this.name = name;
        this.secondName = secondName;
        this.magicPower = magicPower;
        this.transgressDistance = transgressDistance;
    }

    public HogwartsStudent(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
        Random random = new Random();
        magicPower = random.nextInt(100);
        transgressDistance = random.nextInt(100);
    }

    public void compareMagicPower(HogwartsStudent hogwartsStudent) {
        System.out.printf(this.magicPower > hogwartsStudent.magicPower ?
                        "%s %s has more magic power than %s %s" :
                        "%3$s %4$s has more magic power than %1$s %2$s",
                this.name, this.secondName, hogwartsStudent.name, hogwartsStudent.secondName);
    }

    public void compareTrasgressDistance(HogwartsStudent hogwartsStudent) {
        System.out.printf(this.transgressDistance > hogwartsStudent.transgressDistance ?
                        "%s %s has more transgress distance than %s %s" :
                        "%3$s %4$s has more transgress distance than %1$s %2$s",
                this.name, this.secondName, hogwartsStudent.name, hogwartsStudent.secondName);
    }

    @Override
    public void printInfo() {
        System.out.printf("%s %s magic power : %d transgress distance : %d\n",
                name, secondName, magicPower, transgressDistance);
    }
}
