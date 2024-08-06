package com.vti.backend;

import java.util.ArrayList;

import com.vti.entity.Contacts;
import com.vti.entity.VietnamesePhone;
import com.vti.ultils.ScannerUtils;

public class ProgramE6Q1 {
	static ArrayList<Contacts> listContacts = new ArrayList<Contacts>();
	static VietnamesePhone vietnamesePhone = new VietnamesePhone(listContacts);
	public static void insert() {
		System.out.println("Nhập vào tên");
		String name = ScannerUtils.inputString("Bạn không được bỏ trống");
		System.out.println("Nhập vào số điện thoại");
		String sdt = ScannerUtils.inputString("Bạn không được bỏ trống");
		vietnamesePhone.insertContact(name, sdt);
	}
	
	public static void remove() {
		System.out.println("Nhập vào tên cần xóa");
		String name = ScannerUtils.inputString("Bạn không được bỏ trống");
		vietnamesePhone.removeContact(name);
	}
	
	public static void update () {
		System.out.println("Nhập vào tên cần update");
		String name = ScannerUtils.inputString("Bạn không được bỏ trống");
		System.out.println("Nhập vào số điện thoại update");
		String sdtNew = ScannerUtils.inputString("Bạn không được bỏ trống");
		vietnamesePhone.updateContact(name, sdtNew);
	}
	
	public static void search () {
		System.out.println("Nhập vào tên cần tìm");
		String name = ScannerUtils.inputString("Bạn không được bỏ trống");
		vietnamesePhone.searchContact(name);
	}
	
	public static void display() {
		System.out.println("Danh sách contact");
		for (Contacts contacts : listContacts) {
			System.out.println(contacts.toString());
		}
	}
	
	public static void fakeData () {
		listContacts.add(new Contacts("1", "1"));
		listContacts.add(new Contacts("2", "2"));
		listContacts.add(new Contacts("3","3"));
	}
	public static void main(String[] args) {
		fakeData();
		insert();
		remove();
		update();
		search();
		display();
		
	}
}
