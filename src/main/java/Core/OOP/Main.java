package Core.OOP;


import java.util.ArrayList;
import java.util.List;

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



        List<HogwartsStudent> students = new ArrayList<>();
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

        System.out.println("=============INFO==============");
        students.forEach(HogwartsStudent::printInfo);
        System.out.println();

        System.out.println("======COMPARE DIFFERENT FACULTY STUDENTS======");
        harryPotter.compareTo(dracoMalfoy);
        System.out.println();

        System.out.println("======COMPARE SAME FACULTY STUDENTS======");
        harryPotter.compareTo(hermioneGranger);
        dracoMalfoy.compareTo(grahamMontague);
        zachariasSmith.compareTo(cedricDiggory);
        choChang.compareTo(parvatiPatil);


    }
}
