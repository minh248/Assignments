package com.vti.entity.ex1;

public class PrimaryStudent extends Student{
    private static int amount = 0;

    public PrimaryStudent(int id, String name) throws Exception {
        super(id, name);
        amount++ ;
    }

    public static int getAmount() {
        return amount;
    }
}
