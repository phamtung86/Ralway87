package com.vti.backend;

import java.util.ArrayList;
import java.util.Iterator;

import com.vti.entity.CanBo;
import com.vti.entity.CongNhan;
import com.vti.entity.KySu;
import com.vti.entity.NhanVien;
import com.vti.ultils.ScannerUtils;

public class QLCB {

	static ArrayList<CanBo> listCBs = new ArrayList<CanBo>();
	static ArrayList<CongNhan> listCNs = new ArrayList<CongNhan>();
	static ArrayList<KySu> listKSs = new ArrayList<KySu>();
	static ArrayList<NhanVien> listNVs = new ArrayList<NhanVien>();

	public static void AddCanBo() {
		System.out.println("Nhap vao so luong can bo can them");
		int quantity = ScannerUtils.inputInt();
		for (int i = 0; i < quantity; i++) {
			System.out.println("Nhap vao ten");
			String name = ScannerUtils.inputString("Ban khong duoc bo trong");
			System.out.println("Nhap vao tuoi");
			int old = ScannerUtils.inputInt();
			System.out.println("Nhap vao gioi tinh: 1 - Nam | 0 - Nu");
			String gender = "";
			boolean checkGender = false;
			while (!checkGender) {
				int genderValue = ScannerUtils.inputInt();
				if (genderValue == 1) {
					gender = "NAM";
					checkGender = true;
				} else if (genderValue == 0) {
					gender = "NU";
					checkGender = true;
				} else {
					System.out.println("Nhap chua dung nhap lai");
					checkGender = false;
				}
			}
			System.out.println("Nhap vao dia chi");
			String address = ScannerUtils.inputString("Ban khong duoc bo trong");
			System.out.println("Nhap vao loai can bo can them: 1 - Cong nhan | 2 - Ky Su | 3 - Nhan Vien");
			boolean checkTypeCB = false;
			while (!checkTypeCB) {
				int valueCB = ScannerUtils.inputInt();
				if (valueCB == 1) {
					System.out.println("Nhap vao cap bac: 1 - 10");
					int level = ScannerUtils.inputInt();
					CongNhan congNhan = new CongNhan(name, old, gender, address, level);
					listCNs.add(congNhan);
					listCBs.add(congNhan);
					checkTypeCB = true;
				} else if (valueCB == 2) {
					System.out.println("Nhap vao nganh dao tao");
					String major = ScannerUtils.inputString("Ban khong duoc bo trong");
					KySu kySu = new KySu(name, old, gender, address, major);
					listKSs.add(kySu);
					listCBs.add(kySu);
					checkTypeCB = true;
				} else if (valueCB == 3) {
					System.out.println("Nhap vao cong viec");
					String work = ScannerUtils.inputString("Ban khong duoc bo trong");
					NhanVien nhanVien = new NhanVien(name, old, gender, address, work);
					listNVs.add(nhanVien);
					listCBs.add(nhanVien);
					checkTypeCB = true;
				} else {
					System.out.println("Nhap chua dung. Nhap lai");
					checkTypeCB = false;
				}
			}
		}
	}

	public static void searchCB() {
		System.out.println("Nhap vao ten can tim");
		String name = ScannerUtils.inputString("Ban khong duoc bo trong");
		boolean found = false;

		for (CanBo canBo : listCBs) {
			if (name.equalsIgnoreCase(canBo.getName())) {
				System.out.println(canBo.toString());
				found = true;
			}

		}
		if (!found) {
			System.out.println("Khong tim thay can bo phu hop");
		}
	}

	public static void displayCB() {
		System.out.println("Danh sach cac can bo");
		for (CanBo canBo : listCBs) {
			System.out.println(canBo.toString());
		}
	}

	public static void deleteCB() {
		System.out.println("Nhap vao ten can bo can xoa");
		String name = ScannerUtils.inputString("Ban khong duoc bo trong");
		boolean check = false;
		for (CanBo canBo : listCBs) {
			if (name.equalsIgnoreCase(canBo.getName())) {
				listCBs.remove(canBo);
				System.out.println("Xoa thanh cong " + canBo);
				check = true;
			}
		}
		if (check == false) {
			System.out.println("Khong tim thay " + name + " de xoa");
		}
	}

	public static void main(String[] args) {
		AddCanBo();
		searchCB();
		deleteCB();
		displayCB();
	}
}
