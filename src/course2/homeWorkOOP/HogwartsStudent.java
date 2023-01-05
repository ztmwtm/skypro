package course2.homeWorkOOP;

public abstract class HogwartsStudent implements Hogwarts {
    int magicPower;
    int transgressDistance;

    public HogwartsStudent(int magicPower, int transgressDistance) {
        this.magicPower = magicPower;
        this.transgressDistance = transgressDistance;
    }

    public int compareToOverFacultate (HogwartsStudent o) {
        return this.magicPower + this.transgressDistance - o.magicPower - o.transgressDistance;
    }
}
