package com.vti.backend;

import com.vti.entity.encapsulation.*;

public class Encapsulation {

    // Question 1
    public void question1(){
        // Create new Student
        Student student = new Student("Minh", "x");
        // Set and add mark
        student.setMarks(5);
        student.add(2);
        // Print studen information and capacity
        student.info();
    }
}
