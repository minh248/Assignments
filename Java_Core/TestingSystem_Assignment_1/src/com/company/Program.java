package com.company;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        // Create department
        Department department1 = new Department();
        department1.id = 1;
        department1.departmentName = "Dev";

        Department department2 = new Department();
        department2.id = 2;
        department2.departmentName = "Sale";

        Department department3 = new Department();
        department3.id = 3;
        department3.departmentName = "Marketing";

        // Create position
        Position position1 = new Position();
        position1.id = 1;
        position1.positionName = "Dev";

        Position position2 = new Position();
        position2.id = 2;
        position2.positionName = "Sale";

        Position position3 = new Position();
        position3.id = 3;
        position3.positionName = "Marketing";

        // Create account
        Account account1 = new Account();
        account1.accountID = 1;
        account1.email = "ducmin248@gmail.com";
        account1.username = "minh248";
        account1.fullName = "Nguyễn Hải Đăng";
        account1.department = department1;
        account1.position = position1;
        account1.createDate = LocalDate.now();

        Account account2 = new Account();
        account2.accountID = 2;
        account2.email = "benj@gmail.com";
        account2.username = "benjamin1";
        account2.fullName = "Benjamin";
        account2.department = department3;
        account2.position = position3;
        account2.createDate = LocalDate.now();

        Account account3 = new Account();
        account3.accountID = 2;
        account3.email = "ellen98@gmail.com";
        account3.username = "ellen";
        account3.fullName = "Elle Fanning";
        account3.department = department3;
        account3.position = position3;
        account3.createDate = LocalDate.now();

        // Create group
        Group group1 = new Group();
        group1.id = 1;
        group1.groupName = "Java Fresher";
        group1.creatorID = 1;
        group1.createDate = LocalDate.now();

        Group group2 = new Group();
        group2.id = 2;
        group2.groupName = "C# Fresher";
        group2.creatorID = 2;
        group2.createDate = LocalDate.now();

        Group group3 = new Group();
        group3.id = 3;
        group3.groupName = "Javascript Fresher";
        group3.creatorID = 3;
        group3.createDate = LocalDate.now();

        // Create group account
        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.id = 1;
        groupAccount1.account = account1;
        groupAccount1.joinDate = LocalDate.now();

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.id = 2;
        groupAccount2.account = account2;
        groupAccount2.joinDate = LocalDate.now();

        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.id = 3;
        groupAccount3.account = account3;
        groupAccount3.joinDate = LocalDate.now();

        // Create type of question
        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.id = 1;
        typeQuestion1.typeName = "Essay";

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.id = 2;
        typeQuestion2.typeName = "Multiple-choice";

        // Create category of question
        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.id = 1;
        categoryQuestion1.categoryName = "Java";

        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.id = 2;
        categoryQuestion2.categoryName = "C#";

        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion3.id = 3;
        categoryQuestion3.categoryName = "Javascript";

        // Create question
        Question question1 = new Question();
        question1.id = 1;
        question1.content = "What is Java?";
        question1.categoryQuestion = categoryQuestion1;
        question1.typeQuestion = typeQuestion1;
        question1.creatorID = 1;
        question1.createDate = LocalDate.now();

        Question question2 = new Question();
        question2.id = 2;
        question2.content = "What is C#?";
        question2.categoryQuestion = categoryQuestion2;
        question2.typeQuestion = typeQuestion1;
        question2.creatorID = 2;
        question2.createDate = LocalDate.now();

        Question question3 = new Question();
        question3.id = 3;
        question3.content = "What is Javascript?";
        question3.categoryQuestion = categoryQuestion3;
        question3.typeQuestion = typeQuestion1;
        question3.creatorID = 3;
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
        exam1.code = 1;
        exam1.title = "Exam 1";
        exam1.categoryQuestion = categoryQuestion1;
        exam1.duration = 1;
        exam1.creatorID = 1;
        exam1.createDate= LocalDate.now();

        Exam exam2 = new Exam();
        exam2.id = 2;
        exam2.code = 2;
        exam2.title = "Exam 2";
        exam2.categoryQuestion = categoryQuestion1;
        exam2.duration = 2;
        exam2.creatorID = 2;
        exam2.createDate= LocalDate.now();

        Exam exam3 = new Exam();
        exam3.id = 3;
        exam3.code = 3;
        exam3.title = "Exam 3";
        exam3.categoryQuestion = categoryQuestion1;
        exam3.duration = 3;
        exam3.creatorID = 3;
        exam3.createDate= LocalDate.now();

        // Create question for exam
        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.id = 1;
        examQuestion1.question = question1;

        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion2.id = 2;
        examQuestion2.question = question2;

        ExamQuestion examQuestion3 = new ExamQuestion();
        examQuestion3.id = 3;
        examQuestion3.question = question3;

        System.out.println("id: " + department1.id);
        System.out.println("departmentName: " + department1.departmentName);
    }
}
