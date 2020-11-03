package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.polymophism.question2.Student;

public class PersonManagement {

	private ArrayList<Student> students;
	private Scanner scanner;

	public PersonManagement() {
		students = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	public void input() {
		System.out.println("Nhập số sinh viên muốn nhập : ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Nhập sinh viên thứ : " + i);
			students.add(new Student());
		}

	}

	public void showInforStudents() {
		for (Student student : students) {
			student.showInfo();
		}
	}

	public void xetHocBong() {
		System.out.println("Nhập tên sinh viên muốn xét:");
		String name = scanner.nextLine();

		for (Student student : students) {
			if (student.getTen().equals(name)) {
				if (student.kiemTraHocBong()) {
					System.out.println("Sinh viên này được học bổng !");
				} else {
					System.out.println("Không được học bổng !");
				}
				break;
			}
		}
	}
}
