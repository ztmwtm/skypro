package course_works.second.diary.utils;

import course_works.second.diary.tasks.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskService {
    private static final Map<Integer, Task> taskMap = new HashMap<>();
    private static final List<Task> removedTasks = new ArrayList<>();

    public static void add(Task task) {
        taskMap.put(task.getId(), task);
    }

    public static void remove(int id) {
        removedTasks.add(taskMap.get(id));
        taskMap.remove(id);
    }

    public static List<Task> getAllByDate(LocalDate date) {
        List<Task> result;
        result = taskMap.values().stream().filter(v -> v.getDateTime().toLocalDate().equals(date)).collect(Collectors.toList());
        return result;
    }
}
