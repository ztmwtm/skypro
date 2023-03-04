package course_works.second.diary.tasks;

import course_works.second.diary.utils.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyTask extends Task {
    public DailyTask(String title, String description, Type type) {
        super(title, description, type);
    }

    @Override
    public boolean appersIn(LocalDate dateTime) {
        return dateTime.isAfter(this.getDateTime().toLocalDate())
                || dateTime.equals(this.getDateTime().toLocalDate());
    }
}
