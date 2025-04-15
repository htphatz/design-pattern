package prototype;

public class Main {
    public static void main(String[] args) {
        try {
            Student originStudent = new Student("Tan Phat", 20);

            Student clonedStudent = (Student) originStudent.clone();

            System.out.println("Original Student: " + originStudent);
            System.out.println("Cloned Student: " + clonedStudent);
            System.out.println("Are both students the same object? " + (originStudent == clonedStudent));
        } catch (CloneNotSupportedException ex) {
            System.out.println("Clone not supported: " + ex.getMessage());
        }
    }
}
