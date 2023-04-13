package course.works.second.diary.tasks;

import course.works.second.diary.utils.Type;

import java.time.LocalDate;

public class OneTimeTask extends Task {

    public OneTimeTask(String title, String description, Type type) {
        super(title, description, type);
    }

    @Override
    public boolean appersIn(LocalDate dateTime) {
        return dateTime.equals(this.getDateTime().toLocalDate());
    }
}
