package course_works.second.diary.tasks;

import course_works.second.diary.utils.Type;

import java.time.LocalDate;

public class MonthlyTask extends Task {
    public MonthlyTask(String title, String description, Type type) {
        super(title, description, type);
    }

    @Override
    public boolean appersIn(LocalDate dateTime) {
        return dateTime.getDayOfMonth() == this.getDateTime().getDayOfMonth();

    }
}
