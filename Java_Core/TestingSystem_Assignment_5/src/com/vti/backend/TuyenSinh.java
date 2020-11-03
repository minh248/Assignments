package com.vti.backend;

import com.vti.entity.abstraction.question2.Khoi;
import com.vti.entity.abstraction.question2.Thisinh;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh{
    private Scanner scanner;

    private ArrayList<Thisinh> candidates;

    public TuyenSinh() {
        candidates = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    @Override
    public void themThiSinh() {
        Thisinh thisinh = new Thisinh();

        System.out.println("Số báo danh: ");
        thisinh.setSbd(scanner.nextLine());

        System.out.println("Ten: ");
        thisinh.setTen(scanner.nextLine());

        System.out.println("Địa chỉ: ");
        thisinh.setDiaChi(scanner.nextLine());

        System.out.println("Ưu tiên: ");
        thisinh.setUuTien(scanner.nextInt());

        Khoi khoi = null;
        System.out.println("Khối (1. A | 2. B | 3. C): ");
        int k = scanner.nextInt();
        switch (k){
            case 1:
                khoi = new Khoi("A");
                break;
            case 2:
                khoi = new Khoi("B");
                break;
            case 3:
                khoi = new Khoi("C");
                break;
            default:
                System.out.println("Không có sẵn khối này");
                break;
        }
        thisinh.setKhoi(khoi);

        candidates.add(thisinh);
    }

    @Override
    public void hienThiThongTinThiSinh() {
        for (Thisinh c: candidates) {
            System.out.println(c.toString());
        }
    }

    @Override
    public void timKiemThiSinh() {
        System.out.println("Số báo danh: ");
        String sbd = scanner.nextLine();

        for (Thisinh c: candidates) {
            if(c.getSbd().equals(sbd)){
                System.out.println(c.toString());
            }
        }
    }
}
