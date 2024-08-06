package com.vti.entity;

public class ThiSinhKhoiA extends ThiSinh {

	public ThiSinhKhoiA(String iD, String name, String address, int prioriryLevel) {
		super(iD, name, address, prioriryLevel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() +  " Khoi A: Toan, Ly, Hoa";
	}

}
