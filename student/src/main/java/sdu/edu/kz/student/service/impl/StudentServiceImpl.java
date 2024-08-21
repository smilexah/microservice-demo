package sdu.edu.kz.student.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sdu.edu.kz.student.entity.Student;
import sdu.edu.kz.student.repository.StudentRepository;
import sdu.edu.kz.student.service.StudentService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }
}
