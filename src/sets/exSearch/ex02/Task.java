package sets.exSearch.ex02;

public class Task {

    private String description;
    private boolean finished;

    public Task(String description) {
        this.description = description;
        this.finished = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", finished=" + finished +
                '}';
    }
}
