package com.vti.modal;

import java.util.Objects;

public class Department {
	
	String id;
	String departmentName;
	
	
	public Department() {

	}


	public Department(String id, String departmentName) {
		this.id = id;
		this.departmentName = departmentName;
	}


	
	
	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(departmentName, id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(departmentName, other.departmentName) ;
	}
	
	
}
