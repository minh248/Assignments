package com.vti.entity.inheritance.Ex1_2;

import java.util.Scanner;

public class CanBo {
    private String name;
    private int age;
    private Gender gender;
    private String address;

    public CanBo() {}

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập họ tên: ");
        name = scanner.nextLine();

        System.out.println("Nhập tuổi: ");
        age = scanner.nextByte();

        System.out.println("Nhập giới tính (0:Nam, 1:Nữ, khác: Unknown): ");
        setGender(scanner.nextInt());

        System.out.println("Nhập địa chỉ: ");
        address = scanner.nextLine();

        System.out.println("finish!!");
        scanner.close();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(int gender) {
        if (gender == 0) {
            this.gender = Gender.MALE;
        } else if (gender == 1) {
            this.gender = Gender.FEMALE;
        } else {
            this.gender = Gender.UNKNOW;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }
}
