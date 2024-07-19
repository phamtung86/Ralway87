package com.vti.backend;

import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		Department department1 = new Department();
		department1.id = 1;
		department1.departmentName = "Phong IT";
		
		Department department2 = new Department();
		department2.id = 2;
		department2.departmentName = "Phong HR";
		
		Position pos1 = new Position();
		pos1.positionId = 1;
		pos1.positionName = "Giám đốc";
		
		Position pos2 = new Position();
		pos2.positionId = 2;
		pos2.positionName = "Trợ lí";
			
		User user1 = new User();
		user1.id = 1;
		user1.userName = "Phạm Văn Tùng";
		user1.passWord = "123456";
		user1.department = department1;
		user1.gender = Gender.MALE;
		user1.dob = new Date ("2024/07/19");
		
		User user2 = new User();
		user2.id = 2;
		user2.userName = "Nguyễn Hoàng";
		user2.passWord = "999999a";
		user2.department = department2;
		user2.gender = Gender.MALE;
		user1.dob = new Date ("2004/09/14");
		
		System.out.println("Phòng ban 1: " + department1.id + " - " + department1.departmentName );
		System.out.println("Phòng ban 2: " + department2.id + " - " + department2.departmentName );
		System.out.println("Vị trí 1: " + pos1.positionId +" - " + pos1.positionName);
		System.out.println("Vị trí 2: " + pos2.positionId +" - " + pos2.positionName);
		System.out.println("Thông tin của user1: " + user1.id + " - " + user1.userName + " - " + user1.passWord +
							user1.department.id +" - " + user1.department.departmentName +" - " +user1.gender + " - " + user1.dob);
		
		
	}
	
}
