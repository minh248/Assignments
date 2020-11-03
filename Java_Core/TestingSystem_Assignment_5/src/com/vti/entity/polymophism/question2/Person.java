package com.vti.entity.polymophism.question2;

import java.util.Scanner;

public class Person {
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;

    public Person() {
    }

    public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên: ");
        ten = scanner.nextLine();

        System.out.println("Nhập giới tính: ");
        gioiTinh = scanner.nextLine();

        System.out.println("Nhập ngày sinh: ");
        ngaySinh = scanner.nextLine();

        System.out.println("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
    }

    public void showInfo() {
        System.out.println("| Tên: " + ten +
                " | Giới tính: " + gioiTinh +
                " | Ngày Sinh: " + ngaySinh +
                " | Địa chỉ: " + diaChi);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
