import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import lombok.Data;

@Data
public class Student {
    // Fields for the Student class
    
    String name;
    int age;
    double percentage; // Corrected from boolean to double for realistic percentage representation
    int marks;
    long phoneNumber;

    public Student() {

    }

    // Constructor
    public Student(String name, Integer age, double percentage, Integer marks, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
        this.marks = marks;
        this.phoneNumber = phoneNumber;
    }

    // ToString method to print student details
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", percentage=" + percentage +
                ", marks=" + marks +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public List<Student> createStudentList() {
        // Create a list of students
        List<Student> students = new ArrayList<>();

        // Random object for generating random values
        Random random = new Random();

        // Names array for random name selection
        String[] names = {"John", "Sarah", "Mike", "Emma", "Bob", "Alice", "Mark", "Anna", "Tom", "Eva"};

        students.add(new Student("John", 21, 90.0, 86, 57656576));
        students.add(new Student("Sarah", 21, 95.0, 90, 23213213));
        students.add(new Student("Mike", 25, 80.0, 47, 12331237));
        students.add(new Student("Emma", 21, 75.0, 91, 69234324));
        students.add(new Student("Bob", 30, 100.0, 99, 80942469));


        // Print all students
        // for (Student student : students) {
        //     System.out.println(student);
        // }

        return students;
    }

    // Main method to execute
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();

        // Random object for generating random values
        Random random = new Random();

        // Names array for random name selection
        String[] names = {"John", "Sarah", "Mike", "Emma", "Bob", "Alice", "Mark", "Anna", "Tom", "Eva"};

        // Generate 10 random students
        for (int i = 0; i < 10; i++) {
            String name = names[random.nextInt(names.length)];
            int age = random.nextInt(10) + 15; // Ages between 15 and 24
            double percentage = 50.0 + random.nextDouble() * 50.0; // Percentages between 50.0 and 100.0
            int marks = random.nextInt(101); // Marks between 0 and 100
            long phoneNumber = (long) (1000000000L + random.nextFloat() * 9000000000L); // Random phone number

            // Create a new student and add to the list
            students.add(new Student(name, age, percentage, marks, phoneNumber));
        }

        // Print all students
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
