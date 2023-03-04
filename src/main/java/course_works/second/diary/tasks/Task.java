package course_works.second.diary.tasks;

import course_works.second.diary.utils.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Task {

    private String title;
    private String description;
    private Type type;
    private static int idGenerator = 0;
    private int id;
    private LocalDateTime dateTime;


    public Task(String title, String description, Type type) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.id = ++idGenerator;
        this.dateTime = LocalDateTime.now();
    }

    public abstract boolean appersIn(LocalDate dateTime);

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && Objects.equals(title, task.title) && Objects.equals(description, task.description) && type == task.type && Objects.equals(dateTime, task.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, type, id, dateTime);
    }

    @Override
    public String toString() {
        return """
                        %s
                %s
                %s
                
                """.formatted(title, type, description);

    }
}
