package com.company;

public class Ex3 {
    @Deprecated
    public static void main(String[] args) {
        // Question 1
        Integer a = new Integer(5000);
        int b = a.intValue();
        System.out.printf("%.2f\n", (float)b);

        // Question 2
        String c = "123456";
        int d = Integer.parseInt(c);

        // Question 3
        Integer e = new Integer("1234567");
        int f = e.intValue();
    }
}
