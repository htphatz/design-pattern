package dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements IStudentDAO {
    List<Student> students;

    public StudentDAO() {
        students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public Student findById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void delete(String id) {
        students.removeIf(student -> student.getId().equals(id));
    }

    @Override
    public void update(String id, Student student) {
        Student existingStudent = findById(id);
        if (existingStudent != null) {
            existingStudent.setName(student.getName());
            existingStudent.setAddress(student.getAddress());
        }
    }
}
