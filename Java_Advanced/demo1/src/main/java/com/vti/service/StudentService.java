package com.vti.service;

import com.vti.designpattern.StudentRepositoryFactory;
import com.vti.repository.IStudentRepository;

public class StudentService {
    private IStudentRepository iStudentRepository;

    public String getStudentNameById(Long id){
        iStudentRepository = StudentRepositoryFactory.getStudentRepositoryObject();
        return iStudentRepository.getStudentNameById();
    }
}
