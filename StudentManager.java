import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, int age) {
        Student student = new Student(name, age);
        students.add(student);
        System.out.println("Added student: " + student);
    }

    public void removeStudent(String name) {
        students.removeIf(student -> student.getName().equalsIgnoreCase(name));
        System.out.println("Removed student with name: " + name);
    }

    public void displayStudents() {
        System.out.println("Current list of students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent("Alice", 20);
        manager.addStudent("Bob", 22);
        manager.addStudent("Charlie", 19);

        manager.displayStudents();

        manager.removeStudent("Bob");
        manager.displayStudents();
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}