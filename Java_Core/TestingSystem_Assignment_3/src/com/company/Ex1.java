package com.company;

import java.util.Random;

public class Ex1 {
	public static void main(String[] args) {
		// Question 1
		double s1 = 5240.5;
		float s2 = 10970.055f;
		System.out.println("roundSalary1: " + (int) s1 + " ||  roundSalary2: " + (int) s2);

		// Question 2
		Random random = new Random();
		int a = random.nextInt(100000);
		System.out.printf("%05.0f \n", (float) a);

		// Question 3
		System.out.println(a % 100);

		// Question 4
		int x = 10;
		int y = 3;
		System.out.printf("%.3f",method1(x, y));;
	}

	public static float method1(int x, int y){
		return (float) x / (float) y;
	}
}
