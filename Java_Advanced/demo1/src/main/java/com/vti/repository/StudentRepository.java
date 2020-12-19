package com.vti.repository;

import com.vti.designpattern.StudentRepositoryFactory;

public class StudentRepository implements IStudentRepository{
//    public String getStudentNameById(Long id){
//        StudentRepository studentRepository = StudentRepositoryFactory.getStudentRepositoryObject();
//        return studentRepository.getStudentNameById(id);
//    }

    @Override
    public String getStudentNameById() {
        return null;
    }
}
