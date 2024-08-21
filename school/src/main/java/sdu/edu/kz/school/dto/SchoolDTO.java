package sdu.edu.kz.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolDTO {
    private String firstName;
    private String lastName;
    private String email;
    private Long schoolId;
}
