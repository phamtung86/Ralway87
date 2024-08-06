package com.vti.entity;

public class HinhVuong extends HinhChuNhat {
	public HinhVuong() {
        super();
    }

    public HinhVuong(double side) {
        super(side, side);
    }

    @Override
    public double tinhChuVi(String hinh) {
        return super.tinhChuVi(hinh);
    }

    @Override
    public double tinhDienTich(String hinh) {
        return super.tinhDienTich(hinh);
    }
}
