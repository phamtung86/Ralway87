package com.vti.entity;

public class ThiSinh {
	protected String ID;
	protected String name;
	protected String address;
	protected int priorityLevel;
	public ThiSinh(String iD, String name, String address, int priorityLevel) {
		super();
		ID = iD;
		this.name = name;
		this.address = address;
		this.priorityLevel = priorityLevel;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPriorityLevel() {
		return priorityLevel;
	}
	public void setPriorityLevel(int priorityLevel) {
		this.priorityLevel = priorityLevel;
	}
	@Override
	public String toString() {
		return "ThiSinh [ID=" + ID + ", name=" + name + ", address=" + address + ", prioriryLevel=" + priorityLevel
				+ "]";
	}
	
}
