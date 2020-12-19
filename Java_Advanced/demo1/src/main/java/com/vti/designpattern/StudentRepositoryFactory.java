package com.vti.designpattern;

import com.vti.repository.IStudentRepository;
import com.vti.repository.StudentRepository;

public class StudentRepositoryFactory {
    public static IStudentRepository getStudentRepositoryObject() {
        return new StudentRepository();
    }
}
