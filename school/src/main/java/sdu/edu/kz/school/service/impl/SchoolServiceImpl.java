package sdu.edu.kz.school.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sdu.edu.kz.school.entity.School;
import sdu.edu.kz.school.repository.SchoolRepository;
import sdu.edu.kz.school.service.SchoolService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {
    private final SchoolRepository schoolRepository;
    @Override
    public void saveSchool(School school) {
        schoolRepository.save(school);
    }

    @Override
    public List<School> findAllSchools() {
        return schoolRepository.findAll();
    }
}
