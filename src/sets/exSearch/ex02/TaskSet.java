package sets.exSearch.ex02;

import java.util.HashSet;
import java.util.Set;

public class TaskSet {

    private Set<Task> taskSet;

    public TaskSet() {
        this.taskSet = new HashSet<>();
    }

    public void addTask(String description) {
        taskSet.add(new Task(description));
    }

    public void removeTask(String description) {
        verifyStorage();
        for(Task t: taskSet) {
            if (t.getDescription().equalsIgnoreCase(description)) taskSet.remove(t);
            break;
        }
    }

    public void showTasks() {
        verifyStorage();
        System.out.println(taskSet);
    }

    public int countTasks() {
        verifyStorage();
        return taskSet.size();
    }

    public Set<Task> getFinishedTasks() {
        verifyStorage();
        Set<Task> finishedTasks = new HashSet<>();
        for (Task t: taskSet) if (t.isFinished()) finishedTasks.add(t);
        return finishedTasks;
    }

    public Set<Task> getUnfinishedTasks() {
        verifyStorage();
        Set<Task> unfinishedTasks = new HashSet<>();
        for (Task t: taskSet) if (!t.isFinished()) unfinishedTasks.add(t);
        return unfinishedTasks;
    }

    public void markTaskAsFinished(String description) {
        verifyStorage();
        Task taskToMark = null;
        for (Task t: taskSet) {
            if (t.getDescription().equalsIgnoreCase(description)) taskToMark = t;
        }
        taskToMark.setFinished(true);
    }

    public void markTaskAsUnfinished(String description) {
        verifyStorage();
        Task taskToMark = null;
        for (Task t: taskSet) if (t.getDescription().equalsIgnoreCase(description)) taskToMark = t;
        taskToMark.setFinished(false);
    }

    public void removeAllTasks() {
        verifyStorage();
        taskSet.clear();
    }

    public void verifyStorage() {
        if (taskSet.isEmpty()) throw new RuntimeException("There is no task registered");
    }
}
