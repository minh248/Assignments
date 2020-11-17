package com.vti.frontend;

import com.vti.utils.ScannerUtils;

public class Program {
    public static void main(String[] args) throws Exception {
        Function function = new Function();
        System.out.println("Menu:");
        System.out.println("1. Show all user in project through id which you input");
        System.out.println("2. Show all manager");
        System.out.println("3. Login");
        System.out.println("4. Close the program");

        while (true) {
            System.out.print("Choose function: ");
            int choose = ScannerUtils.inputFunction(1, 4, "You have to input value from 1 to 4! \nPlease reinput!");

            switch (choose) {
                case 1:
                    function.showUserByProjectId();
                    break;
                case 2:
                    function.showAllManger();
                    break;
                case 3:
                    function.login();
                    break;
                case 4:
                    System.out.println("Program closed!");
                    return;
            }
        }
    }
}
