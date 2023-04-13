package course.works.second.diary.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {



    @Test
    void removeException() {
        int id = -1;
        TaskNotFoundException thrown = assertThrows(
                TaskNotFoundException.class,
                () -> TaskService.remove(id),
                "Expected doThing() to throw, but it didn't"
        );

        assertTrue(thrown.getMessage().contentEquals("Task with id " + id + " not found."));
    }

    @Test
    void getAllByDate() {
        //TODO
    }
}