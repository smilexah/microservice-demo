package sdu.edu.kz.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sdu.edu.kz.school.entity.School;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
