package com.vti.frontend;

import java.util.ArrayList;

import com.vti.backend.ITuyenSinh;
import com.vti.entity.ThiSinh;
import com.vti.entity.ThiSinhKhoiA;
import com.vti.entity.ThiSinhKhoiB;
import com.vti.entity.ThiSinhKhoiC;
import com.vti.ultils.ScannerUtils;

public class TuyenSinh implements ITuyenSinh {
	private ArrayList<ThiSinh> listThiSinhs = new ArrayList<ThiSinh>();

	@Override
	public void addTS() {
		System.out.println("Nhap vao so bao danh");
		String id = ScannerUtils.inputString("Ban khong duoc bo trong");
		System.out.println("Nhap vao ho ten");
		String name = ScannerUtils.inputString("Ban khong duoc bo trong");
		System.out.println("Nhap vao dia chi");
		String address = ScannerUtils.inputString("Ban khong duoc bo trong");
		System.out.println("Nhap vao muc uu tien");
		int priorityLevel = ScannerUtils.inputInt();
		System.out.print("Nhập khối thi (A/B/C): ");
		String khoiThi = ScannerUtils.inputString("Ban khong duoc bo trong");

		ThiSinh thiSinh = null;
		switch (khoiThi.toUpperCase()) {
		case "A":
			thiSinh = new ThiSinhKhoiA(id, name, address, priorityLevel);
			listThiSinhs.add(thiSinh);
			break;
		case "B":
			thiSinh = new ThiSinhKhoiB(id, name, address, priorityLevel);
			listThiSinhs.add(thiSinh);
			break;
		case "C":
			thiSinh = new ThiSinhKhoiC(id, name, address, priorityLevel);
			listThiSinhs.add(thiSinh);
			break;
		default:
			System.out.println("Khối thi không hợp lệ!");
			return;
		}

	}

	@Override
	public void displayTS() {
		for (ThiSinh thiSinh : listThiSinhs) {
			System.out.println(thiSinh.toString());
		}

	}

	@Override
	public void searchTS(String id) {
		boolean check = false;
		for (ThiSinh thiSinh : listThiSinhs) {
			if (id.equals(thiSinh.getID())) {
				System.out.println("Tim thay");
				System.out.println(thiSinh.toString());
				check = true;
			}
		}
		if (check == false) {
			System.out.println("Khong tim thay");
		}
	}

	@Override
	public void exits() {
		System.out.println("Thoát chương trình.");
		System.exit(0);

	}

	public static void main(String[] args) {
		TuyenSinh tuyenSinh = new TuyenSinh();
		while (true) {
			System.out.println("Chọn chức năng:");
			System.out.println("1. Thêm mới thí sinh");
			System.out.println("2. Hiện thị thông tin thí sinh");
			System.out.println("3. Tìm kiếm theo số báo danh");
			System.out.println("4. Thoát");
			System.out.print("Lựa chọn của bạn: ");
			int chucNang = ScannerUtils.inputInt();
			switch (chucNang) {
			case 1:
				tuyenSinh.addTS();
				break;
			case 2:
				tuyenSinh.displayTS();
				break;
                case 3:
                	System.out.println("Nhap vao id muon tim");
                	String id = ScannerUtils.inputString("Ban khong duoc de trong");
                    tuyenSinh.searchTS(id);
                    break;
                case 4:
                    tuyenSinh.exits();
                    break;
			default:
				System.out.println("Chức năng không hợp lệ.");
			}
		}
	}

}
