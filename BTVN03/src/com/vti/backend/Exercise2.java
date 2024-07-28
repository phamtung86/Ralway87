package com.vti.backend;

import java.util.Date;
import java.util.Iterator;

import com.vti.modal.Account;

public class Exercise2 {
	public static void insertAuto() {
		Account[] acc = new Account[5]; 
		for (int i = 0; i < 5; i++) {
			int id = i + 1;
			String email = "email " + String.valueOf(i + 1); 
			String userName = "username " + String.valueOf(i + 1);
			String fullName = "fullName " + String.valueOf(i+ 1);
			Date createDate = new Date();
			acc[i] = new Account(id, email, userName, fullName, createDate);
		}
		
		System.out.println("Account sau khi them la");
		for (int i = 0; i < acc.length; i++) {
			System.out.println(acc[i].toString());
		}
	}
	
	public static void main(String[] args) {
		insertAuto();
	}
}
