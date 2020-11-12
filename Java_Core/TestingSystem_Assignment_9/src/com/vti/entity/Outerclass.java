package com.vti.entity;

public class Outerclass {
    public void show(){
        InnerClass innerClass = new InnerClass();
        innerClass.show();
    }

    public class InnerClass {
        public void show(){
            System.out.println("This is inner class");
        }
    }
}
