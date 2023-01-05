package course2.homeWorkOOP;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        GryffindorStudent gryffindorStudent1 = new GryffindorStudent(10, 5, 50);
        GryffindorStudent gryffindorStudent2 = new GryffindorStudent(5, 5, 77);
        System.out.println(gryffindorStudent1.compareTo(gryffindorStudent2));
        System.out.println(gryffindorStudent1.compareToOverFacultate(gryffindorStudent2));
    }
}
