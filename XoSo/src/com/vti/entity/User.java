package com.vti.entity;

public class User {
	private String id;
	private String fullName;
	private int yob;
	private String teleNumber;
	private String address;
	public User(String id, String fullName, int yob, String teleNumber, String address) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.yob = yob;
		this.teleNumber = teleNumber;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public String getFullName() {
		return fullName;
	}
	
	public int getYob() {
		return yob;
	}
	public String getTeleNumber() {
		return teleNumber;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", yob=" + yob + ", teleNumber=" + teleNumber
				+ ", address=" + address + "]";
	}
	
}
