package com.vti.entity;

public class CongNhan extends CanBo {
	private int level;

	public CongNhan(String name, int old, String gender, String address, int level) {
		super(name, old, gender, address);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return super.toString() +"CongNhan [level=" + level + "]";
	}
	
}
