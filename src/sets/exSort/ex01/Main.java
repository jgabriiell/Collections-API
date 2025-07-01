package sets.exSort.ex01;

public class Main {
    public static void main(String[] args) {

        StudentManager studentManager = new StudentManager();

        studentManager.addStudent("Jhonny", 12334L, 8.5);
        studentManager.addStudent("Rose", 36421L, 7.7);
        studentManager.addStudent("Mary", 6847L, 5.9);
        studentManager.addStudent("Joe", 64723L, 6.4);

        studentManager.showAllStudents();
        studentManager.removeByEnrollment(64723L);
        studentManager.showAllStudents();

        studentManager.showStudentsByName();
        studentManager.showStudentsByGrade();
    }
}
