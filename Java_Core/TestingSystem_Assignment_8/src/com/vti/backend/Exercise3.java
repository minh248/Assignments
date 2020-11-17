package com.vti.backend;

import com.vti.entity.ex3.*;

import java.util.ArrayList;

public class Exercise3 {
    public void question1(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student<Integer>(1, "A"));
        students.add(new Student<Float>(2.0f, "B"));
        students.add(new Student<Double>(3.0, "C"));
    }

    // question 2 3
    public void question2_3(){
        print(10);
        print(1.2);
        print(new Student<Integer>(1, "A"));
    }

    public <T> void print (T value){
        System.out.println(value);
    }

    // question4
    public void question4(){
        Double[] double_array = {1.0,2.0,2.5};
        print(double_array);
    }

    public <E> void printArray(E[] arr){
        for (E value : arr) {
            System.out.println(value);
        }
    }


    // question5
    public void question5(){
        Employee<Integer> employee1 = new Employee<>(1,"A", 1001);
        Employee<Double> employee2 = new Employee<>(2,"B", 10.1);
        Employee<Float> employee3 = new Employee<>(3,"C", 1.1f);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
    }

    public void question6(){
        MyMap<Integer, String> student = new MyMap<>(1,"A");
        System.out.println(student.toString());
    }

    public void question7(){
        Phone<Integer, String> phone1 = new Phone<>(1, "0123456789");
        System.out.println(phone1.toString());
        Phone<String, String> phone2 = new Phone<>("A@gmail.com", "0123456789");
        System.out.println(phone2.toString());
        Phone<String, String> phone3 = new Phone<>("A", "0123456789");
        System.out.println(phone3.toString());
    }

    public void question8(){
        Staff<Integer, String> staff = new Staff<>(1, "A");
        System.out.println(staff.getKey());
    }
}
