package course_works.second.diary.utils;

public enum Type {

    WORK("work task"), PERSONAL("personal task");

    private final String value;

    Type(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
