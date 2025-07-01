package sets.exSort.ex01;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;
    private Long enrollment;
    private double grade;

    public Student(String name, Long enrollment, double grade) {
        this.name = name;
        this.enrollment = enrollment;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Long enrollment) {
        this.enrollment = enrollment;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Student student)) return false;
        return Objects.equals(getEnrollment(), student.getEnrollment());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getEnrollment());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", enrollment=" + enrollment +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.getName());
    }
}

class StudentComparatorByGrade implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGrade(), s2.getGrade());
    }
}