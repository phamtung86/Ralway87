package com.vti.entity;

public class NhanVien extends CanBo {
	private String work;

	public NhanVien(String name, int old, String gender, String address, String work) {
		super(name, old, gender, address);
		this.work = work;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return super.toString() + "NhanVien [work=" + work + "]";
	}
	
}
