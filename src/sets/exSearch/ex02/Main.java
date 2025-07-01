package sets.exSearch.ex02;

public class Main {
    public static void main(String[] args) {

        TaskSet taskSet = new TaskSet();

        taskSet.addTask("Read a new book");
        taskSet.addTask("Cook lunch");
        taskSet.addTask("Workout");
        taskSet.addTask("Watch a movie");

        taskSet.showTasks();

        taskSet.removeTask("Cook lunch");
        taskSet.showTasks();

        System.out.println("There are " + taskSet.countTasks() + " tasks");

        System.out.println(taskSet.getFinishedTasks());

        taskSet.markTaskAsFinished("workout");
        taskSet.markTaskAsFinished("read a new book");
        System.out.println(taskSet.getFinishedTasks());

        System.out.println(taskSet.getUnfinishedTasks());

        taskSet.markTaskAsUnfinished("workout");
        System.out.println(taskSet.getUnfinishedTasks());
    }
}
