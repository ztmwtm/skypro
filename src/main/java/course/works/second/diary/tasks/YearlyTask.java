package course.works.second.diary.tasks;

import course.works.second.diary.utils.Type;

import java.time.LocalDate;

public class YearlyTask extends Task {
    public YearlyTask(String title, String description, Type type) {
        super(title, description, type);
    }

    @Override
    public boolean appersIn(LocalDate dateTime) {
        //Logic of Leap years???????
        return dateTime.getDayOfYear() == this.getDateTime().getDayOfYear();
    }
}
