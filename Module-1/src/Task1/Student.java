package Task1;
import java.util.*;

public class Student implements Comparable<Student> {
    String name;
    int rollno;
    int age;
    double marks;

    public Student(String name, int rollno, int age, double marks) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.age, s.age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}