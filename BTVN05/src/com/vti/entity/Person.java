package com.vti.entity;

public abstract class Person {
	protected String name;
	protected String gender;
	protected String dob;
	protected String address;
	public Person() {
		super();
	}
	public Person(String name, String gender, String dob, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public abstract void inputInfor();
	public abstract void showInfor();
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", dob=" + dob + ", address=" + address + "]";
	}
	
}
