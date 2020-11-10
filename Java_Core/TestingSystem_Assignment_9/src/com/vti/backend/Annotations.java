package com.vti.backend;

import com.vti.entity.Student;

import java.util.Date;

public class Annotations {
    @SuppressWarnings("deprecation")
    public void question1(){
        Date date = new Date("18/05/2020");
        System.out.println(date);
    }

    @SuppressWarnings("deprecation")
    public void question2() {
        Student student = new Student(1, "Nguyễn Văn A");
        System.out.println(student.getId());
        System.out.println(student.getName());

        System.out.println(student.getIdV2());
    }
}
