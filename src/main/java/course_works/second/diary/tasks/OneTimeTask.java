package course_works.second.diary.tasks;

import course_works.second.diary.utils.Type;

import java.time.LocalDateTime;

public class OneTimeTask extends Task {

    public OneTimeTask(String title, String description, Type type) {
        super(title, description, type);
    }

    @Override
    public boolean appersIn(LocalDateTime dateTime) {

        return true;
    }
}
