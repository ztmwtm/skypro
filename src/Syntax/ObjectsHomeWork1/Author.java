package Syntax.ObjectsHomeWork1;

public class Author {
    private String name;
    private String secondName;

    public Author(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
