import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(String name, int age, String course) {
        Student student = new Student(name, age, course);
        students.add(student);
        System.out.println("Student added: " + student);
    }

    public void removeStudent(String name) {
        boolean removed = students.removeIf(student -> student.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Student removed: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    public void displayStudents() {
        System.out.println("List of students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void findStudentByCourse(String course) {
        System.out.println("Students enrolled in " + course + ":");
        for (Student student : students) {
            if (student.getCourse().equalsIgnoreCase(course)) {
                System.out.println(student);
            }
        }
    }

    public void deleteAllStudents() {
        for (Student student : students) {
            boolean removed = students.removeIf(student -> student.getName().equalsIgnoreCase(name));
            if (removed) {
                System.out.println("Student removed: " + name);
            } else {
                System.out.println("Student not found: " + name);
            }
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent("Alice", 20, "Computer Science");
        manager.addStudent("Bob", 22, "Mathematics");
        manager.addStudent("Charlie", 19, "Physics");

        manager.displayStudents();

        manager.findStudentByCourse("Computer Science");

        manager.removeStudent("Alice");
        manager.displayStudents();
    }
}

class Student {
    private String name;
    private int age;
    private String course;  // Aggiunto nuovo campo

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", course='" + course + "'}";
    }
}