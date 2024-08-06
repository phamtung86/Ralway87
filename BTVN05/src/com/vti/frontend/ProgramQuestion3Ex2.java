package com.vti.frontend;

import com.vti.entity.HinhChuNhat;
import com.vti.entity.HinhVuong;
import com.vti.ultils.ScannerUtils;

public class ProgramQuestion3Ex2 {
	public static void hinhChuNhat () {
		System.out.println("Nhap vao chieu dai");
		double length = ScannerUtils.inputDouble("Nhap chua dung");
		System.out.println("Nhap vao chieu rong");
		double width = ScannerUtils.inputDouble("Nhap chua dung");
		HinhChuNhat hcn = new HinhChuNhat(length, width);
		System.out.println(hcn.tinhChuVi("HCN"));
		System.out.println(hcn.tinhDienTich("HCN"));
	}
	public static void hinhVuong() {
		System.out.println("Nhap vao chieu dai canh");
		double side = ScannerUtils.inputDouble("Nhap chua dung");
		HinhVuong hv = new HinhVuong(side);
		System.out.println(hv.tinhChuVi("HV"));
		System.out.println(hv.tinhDienTich("HV"));
	}
	public static void main(String[] args) {
//		hinhChuNhat();
		hinhVuong();
	}
}
