package com.vti.backend;

import java.util.ArrayList;
import java.util.Comparator;

import com.vti.modal.Department;
import com.vti.utils.ScannerUtils;

public class Exercise5 {
	
	static ArrayList<Department> listDepartments = new ArrayList<Department>();

	public static void fakeData() {
		listDepartments.add(new Department("D01", "Human Resources"));
		listDepartments.add(new Department("D02", "Finance"));
		listDepartments.add(new Department("D03", "IT"));
		listDepartments.add(new Department("D04", "Marketing"));
		listDepartments.add(new Department("D05", "Sales"));
	}
	
	// Question 1
	public static void printDataDepartment1() {
		System.out.println("------------------------QUESTION 1------------------------");
		System.out.println(listDepartments.get(0).toString());
	}
	
	
	//Question 2
	
	public static void printData() {
		System.out.println("------------------------QUESTION 2------------------------");
		for (Department department : listDepartments) {
			System.out.println(department.toString());
		}
	}
	
	// Question 4 
	public static void checkName() {
		System.out.println("------------------------QUESTION 4------------------------");
		System.out.println("Nhập tên phòng");
		String departmentName = ScannerUtils.inputString("Bạn không được để trống");
		if(departmentName.equals(listDepartments.get(0).getDepartmentName())) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	// Question 5
	public static void compareDepartment () {
		System.out.println("------------------------QUESTION 5------------------------");
		Department department1 = listDepartments.get(0);
		Department department2 = listDepartments.get(1);
		if(department1.equals(department2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	// Question 6
	public static void sortByDepartmentname() {
	    listDepartments.sort(new Comparator<Department>() {

	        @Override
	        public int compare(Department o1, Department o2) {
	            return o1.getDepartmentName().compareTo(o2.getDepartmentName());
	        }
	    });
	}

	public static void main(String[] args) {
		fakeData();
		printDataDepartment1();
		printData();
		checkName();
		compareDepartment();
		sortByDepartmentname();
		System.out.println("Sau khi sap xep");
		printData();
	}
}
