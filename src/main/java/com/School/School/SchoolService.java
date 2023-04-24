package com.School.School;

import java.util.List;
import java.util.Optional;

public interface SchoolService {
     List<SchoolEntity> findAllStudents();
     Optional<SchoolEntity> findById(Long id);
     SchoolEntity save(SchoolEntity student);
     SchoolEntity update(SchoolEntity student);
     void deleteStudent(Long id);
}
