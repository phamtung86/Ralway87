package com.vti.entity;

public class KySu extends CanBo {
	private String major;

	public KySu(String name, int old, String gender, String address, String major) {
		super(name, old, gender, address);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString() + "KySu [major=" + major + "]";
	}
	
}
