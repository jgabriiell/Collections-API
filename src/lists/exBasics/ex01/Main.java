package lists.exBasics.ex01;

public class Main {
    public static void main(String[] args) {

        TaskList taskList = new TaskList();
        System.out.println("Total of tasks: " + taskList.getTotalNumberOfTasks());

        taskList.addATask("Read a new book");
        taskList.addATask("Start a new hobby");
        taskList.addATask("Finish previous tasks");

        System.out.println("Total of tasks: " + taskList.getTotalNumberOfTasks());

        System.out.println(taskList.getAllDescriptions());

        taskList.removeTask("finish PREVIOUS TaKs");
    }
}
