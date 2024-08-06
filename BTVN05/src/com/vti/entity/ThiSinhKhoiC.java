package com.vti.entity;

public class ThiSinhKhoiC extends ThiSinh {

	public ThiSinhKhoiC(String iD, String name, String address, int prioriryLevel) {
		super(iD, name, address, prioriryLevel);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Khoi C: Van, Su, Dia";
	}
}
