package sdu.edu.kz.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sdu.edu.kz.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
