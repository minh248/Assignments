package com.vti.frontend.ex1;

import com.vti.entity.ex1.Department;

public class Question4 {
    private static Department[] departments = new Department[3];

    public static void main(String[] args) {
        departments[0] = new Department(1, "Sale");
        departments[1] = new Department(2, "Marketing");
        departments[2] = new Department(3, "BOD");

        // Get index
        getIndex(5);
    }

    private static void getIndex(int i) {
        try{
            System.out.println(departments[i].toString());
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
