package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Ex5 {
    public static void main(String[] args) {
        // Question 1
        // Create Deparment
        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Sale";

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Marketting";

        Department department3 = new Department();
        department3.id = 3;
        department3.name = "HR";

        Department[] departments = {department1, department2, department3};

        System.out.println(department1.toString());

        // Question 2
        for (Department d: departments) {
            System.out.println(d.toString());
        }

        // Question 3
        System.out.println(department1.hashCode());

        // Question 4
        if (department1.name.equals("Phòng A")){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // Question 5
        if (department1.equals(department2)) {
            System.out.println("Có bằng nhau !");
        } else {
            System.out.println("Không bằng nhau !");
        }

        // Question 6
        // Create array list
        ArrayList<Department> depts = new ArrayList<>();
        depts.add(department1);
        depts.add(department2);
        depts.add(department3);

        Collections.sort(depts, new Department());
        for (Department d : depts) {
            System.out.println(d.name);
        }

        // Question 7
        Collections.sort(depts, new SortDepartment());
        for (Department d: depts){
            System.out.println(d.name);
        }
    }
}
