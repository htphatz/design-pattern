package dao;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();

        System.out.println("All students before add: " + studentDAO.getAll());

        Student newStudent1 = new Student("1", "1", "1");
        Student newStudent2 = new Student("2", "2", "2");
        Student newStudent3 = new Student("3", "3", "3");
        studentDAO.save(newStudent1);
        studentDAO.save(newStudent2);
        studentDAO.save(newStudent3);
        System.out.println("All students after add: " + studentDAO.getAll());

        studentDAO.delete("1");
        System.out.println("All students before remove student with id 1: " + studentDAO.getAll());

        Student updatedStudent = new Student("updated", "updated", "updated");
        studentDAO.update("2", updatedStudent);
        System.out.println("All students after update student with id 2: " + studentDAO.getAll());
    }
}
