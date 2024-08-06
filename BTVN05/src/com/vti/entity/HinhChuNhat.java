package com.vti.entity;

public class HinhChuNhat {
	private double length;
	private double width;
	public HinhChuNhat() {
		super();
	}
	public HinhChuNhat(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double tinhChuVi(String hinh) {
		System.out.println("Tinh chu vi theo " + hinh);
		return (length + width) *2;
	}
	public double tinhDienTich(String hinh) {
		System.out.println("Tinh dien tich theo " + hinh);
		return length * width;
	}
}
