package com.vti.entity.polymophism.question5;

public class DienThoaiDiDong implements ITanCong{
    public void nghe(){
        System.out.println("Đang nghe điện thoại");
    }

    public void goi(){
        System.out.println("Đang gọi ...");
    }

    public void guiTinNhan(){
        System.out.println("Đang gửi tin nhắn ...");
    }

    @Override
    public void tanCong() {
        System.out.println("Ném ......");
    }
}
