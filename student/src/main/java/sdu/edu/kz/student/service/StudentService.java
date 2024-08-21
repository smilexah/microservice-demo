package sdu.edu.kz.student.service;

import sdu.edu.kz.student.entity.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(Student student);
    List<Student> findAllStudents();
}
