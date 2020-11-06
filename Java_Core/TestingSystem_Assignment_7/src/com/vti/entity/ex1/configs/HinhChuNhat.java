package com.vti.entity.ex1.configs;

public class HinhChuNhat extends HinhHoc {
    private float a;
    private float b;

    // test exception
    public HinhChuNhat(float a, float b) throws Exception{
        this.a = a;
        this.b = b;
    }

    @Override
    public float chuVi() {
        return 2 * (a + b);
    }

    @Override
    public float dienTich() {
        return a * b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
}
