package com.vti.entity;

public class CanBo {
	private String name;
	private int old;
	private String gender;
	private String address;
	public CanBo(String name, int old, String gender, String address) {
		super();
		this.name = name;
		this.old = old;
		this.gender = gender;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CanBo [name=" + name + ", old=" + old + ", gender=" + gender + ", address=" + address + "]";
	}

	
	
	
}
