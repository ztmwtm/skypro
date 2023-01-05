package course2.homeWorkOOP;

public class GryffindorStudent extends HogwartsStudent implements Comparable<GryffindorStudent> {

    private int honor;

    @Override
    public void printInfo() {

    }

    public GryffindorStudent(int magicPower, int transgressDistance,int honor) {
        super(magicPower, transgressDistance);
        this.honor = honor;
    }


    public int compareTo(GryffindorStudent o) {
        return this.honor - o.honor;
    }

}
