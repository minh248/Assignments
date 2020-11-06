package com.vti.backend;

import com.vti.entity.ex1.*;
import com.vti.entity.ex1.configs.HinhChuNhat;

import java.util.ArrayList;

public class Exercise1 {
    // Question 1
    public void question1() throws Exception {
        // Create students
        Student[] students = new Student[3];
        students[0] = new Student(0, "A");
        students[1] = new Student(1, "B");
        students[2] = new Student(2, "C");

        Student.setCollege("Đại học công nghệ");

        for (Student s: students) {
            System.out.println(s.toString());
        }
    }

    // Question 2
    public void question2 () throws Exception {
        // Create students
        Student[] students = new Student[3];
        students[0] = new Student(0, "A");
        students[1] = new Student(1, "B");
        students[2] = new Student(2, "C");

        // Initial amount
        System.out.println("Số tiền của nhóm bây giờ là: " + Student.getGroupMoney());

        // Contribute to the fund 100k per student
        for (Student s: students) {
            s.contributeToTheFund(100);
        }

        // Buy some goods
        for (Student s: students) {
            if(s.getId() == 0){
                s.useMoney(50, "đi mua bim bim, kẹo về liên hoan");
                System.out.println("Số tiền của nhóm bây giờ là: " + Student.getGroupMoney());
            }

            if(s.getId() == 1){
                s.useMoney(20, "đi mua bánh mì");
                System.out.println("Số tiền của nhóm bây giờ là: " + Student.getGroupMoney());
            }

            if(s.getId() == 2){
                s.useMoney(150, "đi mua đồ dùng học tập cho nhóm");
                System.out.println("Số tiền của nhóm bây giờ là: " + Student.getGroupMoney());
            }
        }

        // Contribute to the fund 50k per student
        for (Student s: students) {
            s.contributeToTheFund(50);
        }

        // Final money
        System.out.println("Số tiền của nhóm bây giờ là: " + Student.getGroupMoney());
    }

    // Question 3
    public void question3(){
        System.out.println("10 + 11 = " + MyMath.sum(10,11));
        System.out.println(MyMath.min(1,2));
    }

    // Question 4
    public void question4() {
        Student.setCollege("NEU");
        System.out.println(Student.getCollege());
    }

    // Question 5
    public void question5() {
        System.out.println("Tổng số học sinh: " + Student.getTotal());
    }

    // Question 6
    public void question6() throws Exception {
        PrimaryStudent[] primaryStudents = new PrimaryStudent[2];
        primaryStudents[0] = new PrimaryStudent(0, "P1");
        primaryStudents[1] = new PrimaryStudent(1, "P2");
        System.out.println("Số lượng primary students: " + PrimaryStudent.getAmount());

        SecondaryStudent[] secondaryStudents = new SecondaryStudent[4];
        secondaryStudents[0] = new SecondaryStudent(0, "S1");
        secondaryStudents[1] = new SecondaryStudent(1, "S2");
        secondaryStudents[2] = new SecondaryStudent(2, "S3");
        secondaryStudents[3] = new SecondaryStudent(3, "S4");
        System.out.println("Số lượng secondary students: " + SecondaryStudent.getAmount());
    }

    // Question 7
    public void question7() throws Exception {
        Student student1 = new Student(1,"A");
        Student student2 = new Student(2,"B");
        Student student3 = new Student(3,"C");
        Student student4 = new Student(4,"D");
        Student student5 = new Student(5,"E");
        Student student6 = new Student(6,"F");
        Student student7 = new Student(7,"G");
        Student student8 = new Student(8,"H");
    }

    public void question8() throws Exception {
        HinhChuNhat hinhChuNhat1 = new HinhChuNhat(1,1);
        HinhChuNhat hinhChuNhat2 = new HinhChuNhat(1,1);
        HinhChuNhat hinhChuNhat3 = new HinhChuNhat(1,1);
        HinhChuNhat hinhChuNhat4 = new HinhChuNhat(1,1);
        HinhChuNhat hinhChuNhat5 = new HinhChuNhat(1,1);
        HinhChuNhat hinhChuNhat6 = new HinhChuNhat(1,1);
    }
}
