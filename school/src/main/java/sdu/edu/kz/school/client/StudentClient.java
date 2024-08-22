package sdu.edu.kz.school.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sdu.edu.kz.school.dto.response.Student;

import java.util.List;

@FeignClient(
        name = "student-service",
        url = "${application.config.students-url}"
)
public interface StudentClient {
    @GetMapping("/school/{schoolId}")
    List<Student> findAllStudentsBySchool(@PathVariable Long schoolId);
}
