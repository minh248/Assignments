package com.vti.utils;

import java.util.Scanner;

import com.vti.backend.exception.InvalidAgeInputingException;

public class ScannerUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt(String errorMessage) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (Exception e) {
                System.err.println(errorMessage);
            }
        }
    }

    public static float inputFloat(String errorMessage) {
        while (true) {
            try {
                return Float.parseFloat(scanner.nextLine().trim());
            } catch (Exception e) {
                System.err.println(errorMessage);
            }
        }
    }

    public static double inputDouble(String errorMessage) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (Exception e) {
                System.err.println(errorMessage);
            }
        }
    }

    public static String inputString(String errorMessage) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            } else {
                System.err.println(errorMessage);
            }
        }
    }

    public static int inputAge() throws InvalidAgeInputingException {
        while (true) {
            int age = inputInt("Wrong inputing! Please input an age as int, input again.");

            if (age < 1) {
//                System.err.println("Wrong inputing! The age must be greater than 0, please input again.");
                throw new InvalidAgeInputingException("The age must be greater than 0");
            } else {
                return age;
            }
        }
    }
}
