package com.company;

import java.time.LocalDate;

public class Ex6 {
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
        print1();

        // Question 2
        Account[] accounts = {account1, account2, account3};
        print2(accounts);

        // Question 3
        print3();
    }

    private static void print1() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    private static void print2(Account[] accounts) {
        for (Account a: accounts) {
            System.out.println(a.toString());
        }
    }

    private static void print3() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
