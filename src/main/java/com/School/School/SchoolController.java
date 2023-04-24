package com.School.School;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/school")
public class SchoolController {

    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping
    public List<SchoolEntity> findAllStudents(){
        return schoolService.findAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<SchoolEntity> findById(@PathVariable("id") Long id){
        return schoolService.findById(id);
    }

    @PostMapping
    public SchoolEntity save(@RequestBody SchoolEntity student){
        return schoolService.save(student);
    }

    @PutMapping
    public SchoolEntity update(@RequestBody SchoolEntity student){
        return schoolService.update(student);
    }

    public void deleteStudent(@PathVariable("id") Long id){
        schoolService.deleteStudent( id);
    }
}
