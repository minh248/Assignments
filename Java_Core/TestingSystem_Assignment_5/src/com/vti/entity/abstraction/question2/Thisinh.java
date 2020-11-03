package com.vti.entity.abstraction.question2;

public class Thisinh {
    private String sbd;
    private String ten;
    private String diaChi;
    private int uuTien;
    private Khoi khoi;

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getUuTien() {
        return uuTien;
    }

    public void setUuTien(int uuTien) {
        this.uuTien = uuTien;
    }

    public Khoi getKhoi() {
        return khoi;
    }

    public void setKhoi(Khoi khoi) {
        this.khoi = khoi;
    }

    @Override
    public String toString() {
        return "Thisinh{" +
                "sbd=" + sbd +
                ", ten='" + ten + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", uuTien=" + uuTien +
                ", khoi=" + khoi.getTen() +
                '}';
    }
}
