package com.vti.entity.polymophism.question2;

import java.util.Scanner;

public class Student extends Person{
    private String msv;
    private float dtb;
    private String email;

    public Student() {
    }

    public Student(String msv, float dtb, String email) {
        this.msv = msv;
        this.dtb = dtb;
        this.email = email;
    }

    public Student(String ten, String gioiTinh, String ngaySinh, String diaChi, String msv, float dtb, String email) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.msv = msv;
        this.dtb = dtb;
        this.email = email;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập mã sinh viên: ");
        msv = scanner.nextLine();

        System.out.println("Nhập điểm trung bình: ");
        dtb = scanner.nextFloat();

        System.out.println("Nhập email: ");
        email = scanner.nextLine();
    }

    @Override
    public void showInfo() {
        System.out.println("| Tên: " + super.getTen() +
                " | Giới tính: " + super.getGioiTinh() +
                " | Ngày Sinh: " + super.getNgaySinh() +
                " | Địa chỉ: " + super.getDiaChi() +
                " | Mã sinh viên: " + msv +
                " | Điểm trung bình: " + dtb +
                " | Email: " + email);
    }

    public boolean kiemTraHocBong(){
        return dtb >= 8;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
