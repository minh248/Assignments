package com.vti.service;

import com.vti.domain.Student;
import com.vti.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent(){
        return (List<Student>) studentRepository.findAll();
    }

    public Student getStudentById(Long id){
        Optional<Student> result = studentRepository.findById(id);

        if (result.isPresent()){
            return result.get();
        }

        return null;
    }

    public void createStudent(Student student){
        studentRepository.save(student);
    }

    public void updateStudent(Long id, Student student){
        Student student1 = getStudentById(id);
        student1.setName(student.getName());
        student1.setAge(student.getAge());

        studentRepository.save(student1);
    }

    public void deleteStudentById(Long id){
        studentRepository.deleteById(id);
    }
}
