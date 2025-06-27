package lists.exBasics.ex01;

import lists.exceptions.EmptyStorageException;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addATask(String description) {
        this.taskList.add(new Task(description));
        System.out.println("Task added successfully");
    }

    public void removeTask(String description) {
        verifyStorage();
        this.taskList.removeIf(task -> task.getDescription().equalsIgnoreCase(description));
        System.out.println("Task removed successfully");
    }

    private void verifyStorage() {
        if (this.taskList.isEmpty()) throw new EmptyStorageException("There is no task on the list");
    }

    public int getTotalNumberOfTasks() {
        return this.taskList.size();
    }

    public List<Task> getAllDescriptions() {
        verifyStorage();
        return this.taskList;
    }
}
