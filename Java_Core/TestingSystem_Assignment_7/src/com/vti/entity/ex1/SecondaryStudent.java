package com.vti.entity.ex1;

public class SecondaryStudent extends Student{
    private static int amount = 0;

    public SecondaryStudent(int id, String name) throws Exception {
        super(id, name);
        amount++;
    }

    public static int getAmount() {
        return amount;
    }
}
