package sdu.edu.kz.school.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sdu.edu.kz.school.dto.response.FullSchoolResponse;
import sdu.edu.kz.school.entity.School;
import sdu.edu.kz.school.service.SchoolService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {
    private final SchoolService schoolService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody School school) {
        schoolService.saveSchool(school);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<School>> findAllStudents() {
        return new ResponseEntity<>(schoolService.findAllSchools(), HttpStatus.OK);
    }

    @GetMapping("/with-students/{schoolId}")
    public ResponseEntity<FullSchoolResponse> findSchoolsWithStudents(@PathVariable Long schoolId) {
        return new ResponseEntity<>(schoolService.findSchoolsWithStudents(schoolId), HttpStatus.OK);
    }
}
