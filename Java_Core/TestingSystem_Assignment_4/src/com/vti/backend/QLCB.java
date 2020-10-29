package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;
import com.vti.entity.inheritance.Ex1_2.*;

public class QLCB {
    private ArrayList<CanBo> canBos;

    public QLCB() {
        canBos = new ArrayList<>();
    }

    // a)
    public void addCanBo() {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số cán bộ muốn nhập:  ");
        n = scanner.nextInt();

        int c;
        CanBo canBo = new CanBo();
        for (int i = 0; i < n; i++) {
            System.out.println("Bạn muốn nhập cán bộ nào? (1:Công nhân || 2: Kỹ sư || 3: Nhân Viên) ");
            c = scanner.nextInt();

            switch (c) {
                case 1:
                    canBo = new CongNhan();
                    break;
                case 2:
                    canBo = new KySu();
                    break;
                case 3:
                    canBo = new NhanVien();
                    break;
                default:
                    System.out.println("Nhập sai !");
                    i--;
                    break;
            }

            canBo.input();
            canBos.add(canBo);
        }
        scanner.close();
    }

    // b)
    public void find() {
        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.println("Nhập họ tên cần tìm: ");
        name = scanner.nextLine();

        for (CanBo cb : canBos) {
            if (name.contains(cb.getName())) {
                System.out.println(cb.toString());
            }
        }
    }

    // c)
    public void printInforCanBo() {
        for (CanBo canBo : canBos) {
            System.out.println(canBo.toString());
        }
    }

    // d)
    public void deleteCanBo() {
        Scanner scanner = new Scanner(System.in);

        String hoTen;
        System.out.println("Nhập họ tên cần xóa: ");
        hoTen = scanner.nextLine();

        canBos.removeIf(cb -> hoTen.contains(cb.getName()));
    }
}

