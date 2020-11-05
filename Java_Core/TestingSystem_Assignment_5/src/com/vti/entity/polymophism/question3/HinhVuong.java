package com.vti.entity.polymophism.question3;

public class HinhVuong extends HinhChuNhat{
    public float tinhDienTich(float a) {
        return super.tinhDienTich(a, a);
    }

    public float tinhChuVi(float a) {
        return super.tinhChuVi(a, a);
    }
}
