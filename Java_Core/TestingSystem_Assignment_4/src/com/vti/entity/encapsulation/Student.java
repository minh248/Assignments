package com.vti.entity.encapsulation;

public class Student {
    private int id;
    private String name;
    private String homeTown;
    private float mark;

    public Student(String name, String homeTown) {
        this.name = name;
        this.homeTown = homeTown;
    }

    public void add(int m){
        if (mark + m <= 10 && mark + m >= 0){
            this.mark += m;
        } else{
            System.out.println("Out of range");
        }
    }

    public void info(){
        System.out.println("|      Name      | Mark | Capacity |");
        String c;
        if (this.mark <= 4){
            c = "Yếu";
        } else if (this.mark <= 6){
            c = "Trung bình";
        } else if (this.mark <= 8){
            c = "Khá";
        } else {
            c = "Giỏi";
        }
        System.out.printf("|%16s|%6.2f|%s|", this.name, this.mark, c);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public float getMarks() {
        return mark;
    }

    public void setMarks(float marks) {
        if(marks <= 10){
            this.mark = marks;
        }
    }
}
