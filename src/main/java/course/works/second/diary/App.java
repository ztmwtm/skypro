package course.works.second.diary;

import course.works.second.diary.utils.ConsoleHelper;
import course.works.second.diary.utils.TaskService;
import course.works.second.diary.utils.Type;
import course.works.second.diary.tasks.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        ConsoleHelper.writeMessage("Hello!!! Welcome to our retard daily CONSOLE!!!! application!");
        int control;
        while (true) {
            ConsoleHelper.writeMessage("""
                    Menu:
                    1. Create Task.
                    2. Show Tasks for current day.
                    3. Exit.""");
            control = ConsoleHelper.readInt(1, 3);

            switch (control) {
                case 1 -> TaskService.add(createTask());
                case 2 -> TaskService.getAllByDate(LocalDate.now()).forEach(System.out::println);
                default -> {
                    break;
                }
            }
        }
    }


    private static Task createTask() {
        ConsoleHelper.writeMessage("Please enter a title of task");
        String title = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("Please enter a description of task");
        String description = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("""
                Please choose a type of task
                1. Work
                2. Personal""");
        int typeInt = ConsoleHelper.readInt(1, 2);
        Type type = switch (typeInt) {
            case 1 -> Type.WORK;
            case 2 -> Type.PERSONAL;
            default -> throw new IllegalStateException("Unexpected value: " + typeInt);
        };
        ConsoleHelper.writeMessage("""
                Please choose a periodicity of task
                1. One time task
                2. Daily task
                3. Weekly task
                4. Monthly task
                5. Yearly task""");
        int taskPeriod = ConsoleHelper.readInt(1, 5);

        return switch (taskPeriod) {
            case 1 -> new OneTimeTask(title, description, type);
            case 2 -> new DailyTask(title, description, type);
            case 3 -> new WeeklyTask(title, description, type);
            case 4 -> new MonthlyTask(title, description, type);
            case 5 -> new YearlyTask(title, description, type);
            default -> throw new IllegalStateException("Unexpected value: " + taskPeriod);
        };
    }
}
