package com.vti.frontend;

import com.vti.entity.ex5.Student;
import com.vti.utils.IOManger;

import java.util.ArrayList;

public class Program5 {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());

        IOManger.writeObject(students, "src\\com\\vti\\frontend\\StudentInformation.txt");

        System.out.println(IOManger.readObject("src\\com\\vti\\frontend\\StudentInformation.txt"));
    }
}
