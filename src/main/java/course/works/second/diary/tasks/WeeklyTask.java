package course.works.second.diary.tasks;

import course.works.second.diary.utils.Type;

import java.time.LocalDate;

public class WeeklyTask extends Task {
    public WeeklyTask(String title, String description, Type type) {
        super(title, description, type);
    }

    @Override
    public boolean appersIn(LocalDate dateTime) {
        return dateTime.getDayOfWeek().equals(this.getDateTime().toLocalDate().getDayOfWeek());

    }
}
