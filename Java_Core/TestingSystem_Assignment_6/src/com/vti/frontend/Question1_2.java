package com.vti.frontend;

import java.util.Arrays;

public class Question1_2 {
    public static void main(String[] args) {
        try {
            float r = divide(7, 0);
            System.out.println(r);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("divide completed!");
        }
    }

    private static float divide(int a, int b) {
        return a / b;
    }
}
