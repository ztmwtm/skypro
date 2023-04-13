package course.works.second.diary.utils;

import course.works.second.diary.tasks.Task;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TaskService {
    private static final Map<Integer, Task> taskMap = new HashMap<>();
    private static final List<Task> removedTasks = new ArrayList<>();

    public static void add(Task task) {
        taskMap.put(task.getId(), task);
    }

    public static void remove(int id) throws TaskNotFoundException {
        Task removedTask = taskMap.get(id);
        if (removedTask == null) {
            throw new TaskNotFoundException("Task with id " + id + " not found.");
        }
        removedTasks.add(removedTask);
        taskMap.remove(id);
    }

    public static List<Task> getAllByDate(LocalDate date) {

        List<Task> result;
        result = taskMap.values().stream()
                .filter(v -> v.appersIn(date))
                .collect(Collectors.toList());
        return result;
    }

    public static Map<LocalDate, List<Task>> getAllGroupByDate(LocalDate date) {
        Map<LocalDate, List<Task>> result = new HashMap<>();

        for (Task t : taskMap.values()) {
            List<Task> currentBucket = result.get(t.getDateTime().toLocalDate());
            if (currentBucket == null) {
                result.put(t.getDateTime().toLocalDate(), new ArrayList<>(List.of(t)));
            } else {
                currentBucket.add(t);
            }
        }
        return result;
    }

    public static Task updateDescription(int id, String description) throws TaskNotFoundException {
        Task updatedTask = taskMap.get(id);
        if (updatedTask == null) {
            throw new TaskNotFoundException("Task with id " + id + " not found.");
        }
        updatedTask.setDescription(description);
        return updatedTask;
    }

    public static Task updateTitle(int id, String title) throws TaskNotFoundException {
        Task updatedTask = taskMap.get(id);
        if (updatedTask == null) {
            throw new TaskNotFoundException("Task with id " + id + " not found.");
        }
        updatedTask.setTitle(title);
        return updatedTask;
    }

    public static List<Task> getRemovedTasks() {
        return removedTasks;
    }
}
