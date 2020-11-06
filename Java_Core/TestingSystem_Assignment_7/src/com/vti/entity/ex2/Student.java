package com.vti.entity.ex2;

public class Student {
    private static final String id = "ID";

    public Student() {
    }

    public static void study(){
        System.out.println("Đang học bài");
    }

    public static String getId() {
        return id;
    }
}
