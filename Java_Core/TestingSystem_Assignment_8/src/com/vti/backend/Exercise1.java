package com.vti.backend;

import com.vti.entity.ex1.Student;
import com.vti.utils.ScannerUtils;

import java.util.*;

public class Exercise1 {
    static List<Student> students = new ArrayList<>();
    static private final Scanner scanner = new Scanner(System.in);

    public void question1(){
        for (int i = 0; i < 5; i++) {
            students.add(new Student(i + 1, "A"));
        }
        printAllStudents(students);

        Student student = new Student(2,"input");

        // a)
        System.out.println(students.size());

        // b)
        System.out.println(students.get(3));

        // c)
        System.out.println(students.get(0));
        System.out.println(students.get(students.size() - 1));

        // d)
        students.add(0, new Student(0, "minh"));
        System.out.println(students.get(0));

        // e)
        students.add(0, new Student(students.size() - 1, "minh"));
        System.out.println(students.get(students.size() - 1));

        // f)
        Collections.reverse(students);
        printAllStudents(students);

        // g)
        searchStudentByID();

        // h)
        searchStudentbyName();

        //  i)
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getName().equals(students.get(j).getName())) {
                    System.out.println("Duplicate student's name: ");
                    System.out.println(students.get(i).toString());
                    System.out.println(students.get(j).toString());
                }
            }
        }

        // j)
        for (Student s : students) {
            if (s.getId() == 2) {
                s.setName(null);
            }
        }
        printAllStudents(students);

        // k)
        students.removeIf(s -> (s.getId() == 5));
        printAllStudents(students);

        // l
        ArrayList<Student> studentCopies = new ArrayList<>();
        studentCopies.addAll(students);
        printAllStudents(studentCopies);
    }

    private void printAllStudents(List<Student> students) {
        for(Student s : students){
            System.out.println(s.toString());
        }
    }

    public static void searchStudentByID(){
        System.out.println("Input ID: ");
        int id = ScannerUtils.inputInt(scanner, "Wrong input type!");

        for (Student student: students) {
            if(student.getId() == id){
                System.out.println(student.toString());
            }
        }
    }

    public static void searchStudentbyName(){
        System.out.println("Input name: ");
        String name = ScannerUtils.inputString(scanner, "Wrong input type!");


        for (Student student: students) {
            if(student.getName().equals(name)){
                System.out.println(student.toString());
            }
        }
    }

    public void question6(){
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Đăng");
        students.put(2, "Quý");
        students.put(3, "Kiên");
        students.put(4, "Duy");
        students.put(5, "Bích");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " / " + "Name: " + entry.getValue());
        }
    }

}
