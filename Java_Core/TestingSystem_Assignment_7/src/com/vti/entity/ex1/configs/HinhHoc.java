package com.vti.entity.ex1.configs;

abstract class HinhHoc{
    static int count = 0;

    public HinhHoc() throws Exception {
        if(count >= 5){
            throw new Exception("Số lượng hình tối đa là: " + Configs.SO_LUONG_HINH_TOI_DA);
        }

        count++;
    }

    abstract float chuVi();
    abstract float dienTich();
}
