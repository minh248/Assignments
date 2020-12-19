package com.vti.controller;

import com.vti.domain.Student;
import com.vti.repository.StudentRepository;
import com.vti.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/student")
@CrossOrigin("http://127.0.0.1:8080")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping(value = "/{id}")
    public Student getStudentById(@PathVariable(name = "id") Long id){
        return studentService.getStudentById(id);
    }

    @GetMapping(value = "/create")
    public void createStudent(@RequestBody Student student){
        studentService.createStudent(student);
    }

    @PutMapping("/update/{id}")
    public void updateStudent(@PathVariable(value = "id") Long id, @RequestBody Student student){
        studentService.updateStudent(id, student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable("id") Long id){
        studentService.deleteStudentById(id);
    }
}
