package syntax.ObjectsHomeWork;

public class Main {
    public static void main(String[] args) {
        Author edgarPo = new Author("Edgar", "Poe");
        Book theBlackCat = new Book("The Black Cat", edgarPo, 1843);

        Author lionFat = new Author("Лев", "Толстой");
        Book theWarAndPiece = new Book("Война и мир", lionFat, 1868);

        System.out.println(theWarAndPiece);

        System.out.println(theBlackCat);
        theBlackCat.setPublicationYear(2003);
        System.out.println(theBlackCat);

    }
}
