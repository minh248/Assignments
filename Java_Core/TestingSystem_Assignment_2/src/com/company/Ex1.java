package com.company;

import java.time.LocalDate;

public class Ex1 {
	public static void main(String[] args) {
		// Create group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Java Fresher";
		group1.createDate = LocalDate.now();

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "DB Fresher";
		group2.createDate = LocalDate.now();

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "C++ Fresher";
		group3.createDate = LocalDate.now();

		// Create Deparment
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketting";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "HR";

		// Create Position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = "Manager";

		Position position2 = new Position();
		position2.id = 2;
		position2.name = "Team Leader";

		Position position3 = new Position();
		position3.id = 3;
		position3.name = "Trainee";

		// Create account
		Account account1 = new Account();
		account1.id = 1;
		account1.createDate = LocalDate.now();
		account1.department = department1;
		account1.email = "benj@gmail.com";
		account1.fullname = "Benjamin";
		account1.position = position1;
		account1.username = "benjamin";

		Account account2 = new Account();
		account2.id = 2;
		account2.createDate = LocalDate.now();
		account2.department = department1;
		account2.email = "jack@gmail.com";
		account2.fullname = "Jack";
		account2.position = position3;
		account2.username = "jack";

		Account account3 = new Account();
		account3.id = 3;
		account3.createDate = LocalDate.now();
		account3.department = department2;
		account3.email = "minh@gmail.com";
		account3.fullname = "Minh";
		account3.position = position1;
		account3.username = "minh";

		// add group to account
		Group[] groupOfAccount1 = {group1};
		account1.groups = groupOfAccount1;

		Group[] groupOfAccount2 = {group3};
		account2.groups = groupOfAccount2;

		Group[] groupOfAccount3 = {group1};
		account3.groups = groupOfAccount3;

		// add account to group
		Account[] accountOfGroups1 = {account1, account2, account3};
		group1.accounts = accountOfGroups1;

		// Create type of question
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.id = 1;
		typeQuestion1.name = "Essay";

		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.id = 2;
		typeQuestion2.name = "Multiple-choice";

		// Create category of question
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.id = 1;
		categoryQuestion1.name = "Java";

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.id = 2;
		categoryQuestion2.name = "C#";

		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.id = 3;
		categoryQuestion3.name = "Javascript";

		// Create question
		Question question1 = new Question();
		question1.id = 1;
		question1.content = "What is Java?";
		question1.categoryQuestion = categoryQuestion1;
		question1.typeQuestion = typeQuestion1;
		question1.creator = account1;
		question1.createDate = LocalDate.now();

		Question question2 = new Question();
		question2.id = 2;
		question2.content = "What is C#?";
		question2.categoryQuestion = categoryQuestion2;
		question2.typeQuestion = typeQuestion1;
		question2.creator = account2;
		question2.createDate = LocalDate.now();

		Question question3 = new Question();
		question3.id = 3;
		question3.content = "What is Javascript?";
		question3.categoryQuestion = categoryQuestion3;
		question3.typeQuestion = typeQuestion1;
		question3.creator = account3;
		question3.createDate = LocalDate.now();

		// Create answer
		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = "Java";
		answer1.question = question1;
		answer1.isCorrect = true;

		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = "C3";
		answer2.question = question2;
		answer2.isCorrect = true;

		Answer answer3 = new Answer();
		answer3.id = 3;
		answer3.content = "Javascript";
		answer3.question = question3;
		answer3.isCorrect = true;

		// Create exam
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = "1";
		exam1.title = "Exam 1";
		// catogory
		exam1.duration = Duration.MINUTE_15;
		exam1.creator = account1;
		exam1.createDate= LocalDate.now();

		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = "2";
		exam2.title = "Exam 2";
		// catogory
		exam2.duration = Duration.MINUTE_45;
		exam2.creator = account2;
		exam2.createDate= LocalDate.now();

		Exam exam3 = new Exam();
		exam3.id = 3;
		exam3.code = "3";
		exam3.title = "Exam 3";
		// catogory
		exam3.duration = Duration.MINUTE_60;
		exam3.creator = account3;
		exam3.createDate= LocalDate.now();

		// add question to exam
		Question[] questionsOfExam1 = {question1};
		exam1.questions = questionsOfExam1;

		Question[] questionsOfExam2 = {question2};
		exam2.questions = questionsOfExam2;

		Question[] questionsOfExam3 = {question3};
		exam3.questions = questionsOfExam3;

		// add exam to question
		Exam[] examsOfQuestion1 = {exam1};
		question1.exam = examsOfQuestion1;

		Exam[] examsOfQuestion2 = {exam1};
		question1.exam = examsOfQuestion2;

		Exam[] examsOfQuestion3 = {exam1};
		question1.exam = examsOfQuestion3;


		// Question 1
		if (account2.department == null){
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là " + account2.department.name);
		}

		// Question 2
		if (account2.groups == null){
			System.out.println("Nhân viên này chưa có group");
		} else if (account2.groups.length <= 2){
			System.out.println("Group của nhân viên	này là Java Fresher, C# Fresher");
		} else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}

		// Question 3
		String m1 = account2.department == null ?  "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là " + account2.department.name;
		System.out.println(m1);

		// Question 4
		String m2 = account1.position.name.contains("Dev") ?  "Đây là Developer" :  "Người này không phải là Developer";
		System.out.println(m2);

		// Question 5
		switch (group1.accounts.length){
			case 1:
				System.out.println("Nhóm có một thành viên");
				break;
			case 2:
				System.out.println("Nhóm có hai thành viên");
				break;
			case 3:
				System.out.println("Nhóm có ba thành viên");
				break;
		}

		// Question 6
		switch (account2.groups.length){
			case 0:
				System.out.println("Nhân viên này chưa có group");
				break;
			case 1:
			case 2:
				System.out.println("Group của nhân viên	này là Java Fresher, C# Fresher");
				break;
			case 3:
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				break;
		}

		// Question 7
		switch (account1.position.name){
			case "Dev":
				System.out.println("Đây là Developer");
				break;
			default:
				System.out.println("Người này không phải là Developer");
				break;
		}

		// Quesion 8
		Account[] accounts = {account1, account2, account3};
		for (Account a : accounts) {
			System.out.println("Email: " + a.email + " | " + "Full name: "+ a.fullname + " | " + "Department: " + a.department.name);
		}

		// Question 9
		Department[] departments = {department1, department2, department3};
		for (Department d : departments) {
			System.out.println("Department: " + d.name + " | " + "ID: " + d.id);
		}

		// Question 10
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là :");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullname);
			System.out.println("Department: " + accounts[i].department.name);
		}

		// Question 11
		for (int i = 0; i < departments.length; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là :");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
		}

		// Question 12
		for (int i = 0; i < 2; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là :");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
		}

		// Question 13
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].id != 2){
				System.out.println(accounts[i].toString());
			}
		}

		// Question 14
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].id < 4){
				System.out.println(accounts[i].toString());
			}
		}

		// Question 15
		for (int i = 0; i < 21 ; i++) {
			System.out.println(i);
		}

		// Question 16-10
		int i = 0;
		while (i < accounts.length){
			System.out.println("Thông tin account thứ " + (i + 1) + " là :");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullname);
			System.out.println("Department: " + accounts[i].department.name);
			i++;
		}

		// Question 16-11
		i = 0;
		while (i < departments.length){
			System.out.println("Thông tin department thứ " + (i + 1) + " là :");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			i++;
		}

		// Question 16-12
		i = 0;
		while (i < departments.length){
			System.out.println("Thông tin department thứ " + (i + 1) + " là :");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			i++;
		}

		// Question 16-13
		i = 0;
		while (i < accounts.length && accounts[i].id != 2){
			System.out.println(accounts[i].toString());
			i++;
		}

		// Question 16-14
		i = 0;
		while (i < accounts.length && accounts[i].id < 4){
			System.out.println(accounts[i].toString());
			i++;
		}

		// Question 16-15
		i = 0;
		while (i < 21){
			System.out.println(i);
			i++;
		}

		// Question 17-10
		i = 0;
		do {
			System.out.println("Thông tin account thứ " + (i + 1) + " là :");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullname);
			System.out.println("Department: " + accounts[i].department.name);
			i++;
		} while (i < accounts.length);

		// Question 17-11
		i = 0;
		do {
			System.out.println("Thông tin department thứ " + (i + 1) + " là :");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			i++;
		} while (i < departments.length);

		// Question 17-12
		i = 0;
		do {
			System.out.println("Thông tin department thứ " + (i + 1) + " là :");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			i++;
		} while (i < departments.length);

		// Question 171-13
		i = 0;
		do {
			System.out.println(accounts[i].toString());
			i++;
		} while (i < accounts.length && accounts[i].id != 2);

		// Question 17-14
		i = 0;
		do {
			System.out.println(accounts[i].toString());
			i++;
		} while (i < accounts.length && accounts[i].id < 4);

		// Question 17-15
		i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 21);
	}
}
