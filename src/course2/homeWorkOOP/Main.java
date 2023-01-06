package course2.homeWorkOOP;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        GryffindorStudent harryPotter = new GryffindorStudent("Harry", "Potter");
        GryffindorStudent hermioneGranger = new GryffindorStudent("Hermione", "Granger");
        GryffindorStudent ronWeasley = new GryffindorStudent("Ron", "Weasley");

        SlytherinStudent dracoMalfoy = new SlytherinStudent("Draco", "Malfoy");
        SlytherinStudent grahamMontague = new SlytherinStudent("Graham", "Montague");
        SlytherinStudent gregoryGoyle = new SlytherinStudent("Gregory", "Goyle");

        HufflepuffStudent zachariasSmith = new HufflepuffStudent("Zacharias", "Smith");
        HufflepuffStudent cedricDiggory = new HufflepuffStudent("Cedric", "Diggory");
        HufflepuffStudent justinFinchFletchley = new HufflepuffStudent("Justin", "Finch-Fletchley");

        RavenclawStudent choChang = new RavenclawStudent("Cho", "Chang");
        RavenclawStudent parvatiPatil = new RavenclawStudent("Parvati", "Patil");
        RavenclawStudent marcusBelby = new RavenclawStudent("Marcus", "Belby");

        List<Hogwarts> students = new ArrayList<>();
        students.add(harryPotter);
        students.add(hermioneGranger);
        students.add(ronWeasley);
        students.add(dracoMalfoy);
        students.add(grahamMontague);
        students.add(gregoryGoyle);
        students.add(zachariasSmith);
        students.add(cedricDiggory);
        students.add(justinFinchFletchley);
        students.add(choChang);
        students.add(parvatiPatil);
        students.add(marcusBelby);

        students.forEach(Hogwarts::printInfo);



    }
}
