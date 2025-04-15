package dao;

import java.util.List;

public interface IStudentDAO {
    List<Student> getAll();
    void save(Student student);
    Student findById(String id);
    void delete(String id);
    void update(String id, Student student);
}
