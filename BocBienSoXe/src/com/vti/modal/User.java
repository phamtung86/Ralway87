package com.vti.modal;

public class User {
	private String ID;
	private String name;
	private int yob;
	private String address;
	private Vehicle vehicle;
	public User(String iD, String name, int yob, String address, Vehicle vehicle) {
		super();
		ID = iD;
		this.name = name;
		this.yob = yob;
		this.address = address;
		this.vehicle = vehicle;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	@Override
	public String toString() {
		return "User [ID=" + ID + ", name=" + name + ", yob=" + yob + ", address=" + address + ", vehicle=" + vehicle
				+ "]";
	}
	
	
}
