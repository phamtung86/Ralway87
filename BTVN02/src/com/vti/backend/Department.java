package com.vti.backend;

public class Department {
	
	String id;
	String departmentName;
	
	
	public Department() {

	}


	public Department(String id, String departmentName) {
		this.id = id;
		this.departmentName = departmentName;
	}


	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}
	
	
}
