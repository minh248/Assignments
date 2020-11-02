package com.vti.frontend;

import com.vti.backend.TuyenSinh;

import java.util.Scanner;

public class AbstractionProgram_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TuyenSinh tuyenSinh = new TuyenSinh();

        int c = 0;
        do{
            System.out.println("Menu");
            System.out.println("1. Insert news|2. View list news|3. Average rate| 4. Exit");
            c = scanner.nextInt();

            switch (c){
                case 1:
                    tuyenSinh.themThiSinh();
                    break;
                case 2:
                    tuyenSinh.hienThiThongTinThiSinh();
                    break;
                case 3:
                    tuyenSinh.timKiemThiSinh();
                    break;
                default:
                    System.exit(1);
                    break;
            }

        } while(c != 0);
    }
}
