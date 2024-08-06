package com.vti.entity;

public abstract class User {
	protected String name;
	protected double salaryRatio;
	public User(String name, double salaryRatio) {
		super();
		this.name = name;
		this.salaryRatio = salaryRatio;
	}
	
	public abstract double calculatePay();

	@Override
	public String toString() {
		return "User [name=" + name + ", salaryRatio=" + salaryRatio + "]" + calculatePay();
	}
	
}
