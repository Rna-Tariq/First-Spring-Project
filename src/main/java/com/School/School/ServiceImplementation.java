package com.School.School;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImplementation implements SchoolService {

    private final SchoolRepo schoolRepo;

    public ServiceImplementation(SchoolRepo schoolRepo) {
        this.schoolRepo = schoolRepo;
    }

    @Override
    public List<SchoolEntity> findAllStudents() {
        return schoolRepo.findAll();
    }

    @Override
    public Optional<SchoolEntity> findById(Long id) {
        return schoolRepo.findById(id);
    }

    @Override
    public SchoolEntity save(SchoolEntity student) {
        return schoolRepo.save(student);
    }

    @Override
    public SchoolEntity update(SchoolEntity student) {
        return schoolRepo.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        schoolRepo.deleteById(id);

    }
}
