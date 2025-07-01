package sets.exSort.ex01;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class StudentManager  {

    private Set<Student> studentSet;

    public StudentManager() {
        this.studentSet = new HashSet<>();
    }

    public void addStudent(String name, Long enrollment, double grade) {
        this.studentSet.add(new Student(name, enrollment, grade));
    }

    public void removeByEnrollment(Long enrollment) {
        verifyStorage();
        Student studentToRemove = null;
        for(Student s: studentSet) if (Objects.equals(s.getEnrollment(), enrollment)) studentToRemove = s;
        studentSet.remove(studentToRemove);
    }

    public void showStudentsByName() {
        verifyStorage();
        Set<Student> studentsByName = new TreeSet<>(studentSet);
        System.out.println(studentsByName);
    }

    public void showStudentsByGrade() {
        verifyStorage();
        Set<Student> studentsByGrade = new TreeSet<>(new StudentComparatorByGrade());
        studentsByGrade.addAll(studentSet);
        System.out.println(studentsByGrade);
    }

    public void showAllStudents() {
        verifyStorage();
        System.out.println(studentSet);
    }

    public void verifyStorage() {
        if (studentSet.isEmpty()) throw new RuntimeException("There is no student registered");
    }

}
