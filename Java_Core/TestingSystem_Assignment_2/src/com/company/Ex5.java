package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex5 {
    public static <SimpleDateFormat> void main(String[] args) {
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
        exam1.createDate = LocalDate.now();

        Exam exam2 = new Exam();
        exam2.id = 2;
        exam2.code = "2";
        exam2.title = "Exam 2";
        // catogory
        exam2.duration = Duration.MINUTE_45;
        exam2.creator = account2;
        exam2.createDate = LocalDate.now();

        Exam exam3 = new Exam();
        exam3.id = 3;
        exam3.code = "3";
        exam3.title = "Exam 3";
        // catogory
        exam3.duration = Duration.MINUTE_60;
        exam3.creator = account3;
        exam3.createDate = LocalDate.now();

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
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3 ; i++) {
            System.out.print("\nNhập số nguyên: ");
            System.out.println("Số nguyên vừa nhập là: "+ scanner.nextInt());
        }

        // Question 2
        for (int i = 0; i < 2 ; i++) {
            System.out.print("\nNhập số thực: ");
            System.out.println("Số thực vừa nhập là: "+ scanner.nextDouble());
        }

        // Question 3
        System.out.print("\nNhập họ và tên: ");
        System.out.println("Tên của bạn là: " + scanner.nextLine());

        // Question 4
        System.out.print("\nNhập ngày sinh (yyyy-mm-dd): ");
        LocalDate dob = LocalDate.parse(scanner.next());
        System.out.println("Ngày sinh của bạn là: " + dob);


        // Question 5
        inputAccount();

        // Question 6
        inputDepartment();

        // Question 7
        int c = 0;
        while (c == 0){
            System.out.print("Nhập số chẵn: ");
            int x = scanner.nextInt();
            if(x % 2 == 0){
                System.out.println("Số chẵn vừa nhập là: " + x);
                c++;
            } else {
                System.out.println("Số vừa nhập không phải là số chẵn");
            }
        }

        // Question 8
        c = 0;
        while (c == 0){
            System.out.print("Mời bạn nhập vào chức năng muốn sử dụng: ");
            int o = scanner.nextInt();
            if (o == 1){
                inputAccount();
                c++;
            } else if (o == 2){
                inputDepartment();
                c++;
            } else {
                System.out.println("Mời bạn nhập lại");
            }
        }

        // Question 9
        // Question 10
        // Question 11

        scanner.close();
    }

    // Question 5
    private static void inputAccount() {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.print("\nNhập id: ");
        account.id = scanner.nextInt();

        System.out.print("\nNhập email: ");
        account.email = scanner.nextLine();

        System.out.print("\nNhập username: ");
        account.username = scanner.nextLine();

        System.out.print("\nNhập họ và tên: ");
        account.fullname = scanner.nextLine();

        System.out.print("\nNhập vị trí (nhập từ 1->5): ");
        int positionIndex = scanner.nextInt();
        switch (positionIndex){
            case 1:{
                account.position.name = "Dev";
                break;
            }
            case 2:{
                account.position.name = "Test";
                break;
            }
            case 3:{
                account.position.name = "ScrumMaster";
                break;
            }
            case 4:{
                account.position.name = "PM";
                break;
            }
            default:{
                account.position.name = "SA";
                break;
            }
        }

        System.out.print("\nNhập phòng ban: ");
        account.department.name = scanner.nextLine();

        account.createDate = LocalDate.now();
        scanner.close();
    }

    // Question 6
    private static void inputDepartment() {
        Scanner scanner = new Scanner(System.in);
        Department department = new Department();

        System.out.print("\nNhập id của phòng ban: ");
        department.id = scanner.nextInt();

        System.out.print("\nNhập tên của phòng ban: ");
        department.name = scanner.nextLine();
        scanner.close();
    }
}
