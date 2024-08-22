package sdu.edu.kz.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sdu.edu.kz.student.entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAllBySchoolId(Long schoolId);
}
