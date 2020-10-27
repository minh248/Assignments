package com.company;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // Question 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        String string = scanner.nextLine();

        String[] words = string.split("\\s+");
        System.out.println("Số kí tự: " + words.length);

        // Question 2
        String s1 = "He";
        String s2 = "llo";
        s1 = s1.concat(s2);

        // Question 3
        System.out.println("Nhập chuỗi: ");
        string = scanner.nextLine();
        string = string.substring(0, 1).toUpperCase() + string.substring(1); // get this
        System.out.println(string);

        // Question 4
        System.out.println("Nhập chuỗi: ");
        string = scanner.nextLine();
        String[] characters = string.toUpperCase().split("");
        for (int i = 0; i < characters.length; i++) {
            System.out.println("Ký tự thứ " + (i + 1) + " là: " + characters[i]);
        }

        // Question 5
        System.out.print("Nhập họ: ");
        String firtName = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String lastName = scanner.nextLine();
        System.out.println(firtName.concat(" " + lastName));

        // Question 6
        System.out.print("Nhập họ và tên: ");
        String fullName = scanner.nextLine();
        String[] characters1 = fullName.split("\\s+");

        String fName = characters1[0];
        String mName = "";
        String lName = characters1[characters1.length - 1];

        for (int i = 1; i < characters1.length - 1; i++) {
            mName = mName + " " + characters1[i];
        }
        System.out.println("Họ: " + fName);
        System.out.println("Tên đệm: " + mName);
        System.out.println("Tên: " + lName);

        // Question 7
        System.out.print("Nhập họ và tên: ");
        String fullName1 = scanner.nextLine();
        String[] characters2 = fullName.split("\\s+");
        String output = "";
        for (String s : characters2) {
            s = s.substring(0, 1).toUpperCase() + s.substring(1);
            output = output + s + " ";
        }

        // Question 8
        Group[] groups = {};
        for (Group g : groups) {
            if (g.name.contains("Java")) {
                System.out.println(g.name);
            }
        }

        // Question 9
        for (Group g : groups) {
            if (g.name == "Java") {
                System.out.println(g.name);
            }
        }

        scanner.close();
    }
}
