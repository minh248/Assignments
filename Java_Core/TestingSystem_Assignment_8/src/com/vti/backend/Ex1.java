package com.vti.backend;

import com.vti.entity.ex1.Student;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    List<Student> students = new ArrayList<>();

    public void question1(){
        for (int i = 0; i < 5; i++) {
            students.add(new Student(i + 1, "A"));
        }

        Student student = new Student(2,"input");

        // a)
        System.out.println(students.size());

        // b)
        System.out.println(students.get(3));

        // c)
        System.out.println(students.get(0));
        System.out.println(students.get(students.size() - 1));

        // d)
        students.add(0, new Student(0, "minh"));
        System.out.println(students.get(0));

        // e)
        students.add(0, new Student(students.size() - 1, "minh"));
        System.out.println(students.get(students.size() - 1));
    }
}
