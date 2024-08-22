package sdu.edu.kz.school.service;

import sdu.edu.kz.school.dto.response.FullSchoolResponse;
import sdu.edu.kz.school.entity.School;

import java.util.List;

public interface SchoolService {
    void saveSchool(School school);
    List<School> findAllSchools();
    FullSchoolResponse findSchoolsWithStudents(Long schoolId);
}
