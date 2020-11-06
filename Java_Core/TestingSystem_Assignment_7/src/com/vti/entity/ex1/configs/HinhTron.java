package com.vti.entity.ex1.configs;

public class HinhTron extends HinhHoc{
    private float r;

    // test exception
    public HinhTron(float r) throws Exception {
        this.r = r;
    }

    @Override
    public float chuVi() {
        return (float) (2 * Math.PI * r);
    }

    @Override
    public float dienTich() {
        return (float) (Math.PI * Math.sqrt(r));
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
}
