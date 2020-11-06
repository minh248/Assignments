package com.vti.backend;

import com.vti.entity.ex2.*;

public class Exercise2 {
    public void question1(){
        System.out.println(MyMath.sum(5));
    }

    public void question2() {
        Student student1 = new PrimaryStudent();
        System.out.println(Student.getId());
        Student.study();

        Student student2 = new SecondaryStudent();
        System.out.println(Student.getId());
        Student.study();
    }
}
