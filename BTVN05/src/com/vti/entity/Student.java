package com.vti.entity;

import java.util.ArrayList;

import com.vti.ultils.ScannerUtils;

public class Student extends Person {
	
	public static ArrayList<Student> listStudents = new ArrayList<Student>();
	
	private String id;
	private float avgMark;
	private String email;
	
	
	public Student() {
		super();
	}



	public Student(String id, float avgMark, String email) {
		super();
		this.id = id;
		this.avgMark = avgMark;
		this.email = email;
	}
	
	

	public Student(String name, String gender, String dob, String address, String id, float avgMark, String email) {
		super(name, gender, dob, address);
		this.id = id;
		this.avgMark = avgMark;
		this.email = email;
	}



	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public float getAvgMark() {
		return avgMark;
	}


	public void setAvgMark(float avgMark) {
		this.avgMark = avgMark;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public void inputInfor() {
		System.out.println("Nhap vao so hoc sinh them");
		int quantity = ScannerUtils.inputInt();
		for (int i = 0; i < quantity; i++) {
			System.out.println("Nhap vao ten");
			String name = ScannerUtils.inputString("Ban khong duoc bo trong");
			System.out.println("Nhap vao gioi tinh");
			String gender = ScannerUtils.inputString("Ban khong duoc bo trong");
			System.out.println("Nhap vao ngay sinh");
			String dob = ScannerUtils.inputString("Ban khong duoc bo trong");
			System.out.println("Nhap vao dia chi");
			String address = ScannerUtils.inputString("Ban khong duoc bo trong");
			System.out.println("Nhap vao id ");
			String id = ScannerUtils.inputString("Ban khong duoc bo trong");
			System.out.println("Nhap vao diem TB");
			float avgMark = ScannerUtils.inputFloat("Ban khong duoc bo trong");
			System.out.println("Nhap vao email");
			String email = ScannerUtils.inputString("Ban khong duoc bo trong");
			Student student = new Student(name, gender, dob, address, id, avgMark, email);
			listStudents.add(student);
		}
	}

	@Override
	public void showInfor() {
		for (Student student : listStudents) {
			System.out.println(student.toString());
		}	
	}
	
	public boolean checkScholaship() {
		if(this.avgMark >= 8.0) {
			return true;
		} 
		return false;
	}


	@Override
	public String toString() {
		return super.toString() +  " Student [id=" + id + ", avgMark=" + avgMark + ", email=" + email + "]";
	}

}
