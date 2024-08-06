package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Bao;
import com.vti.entity.Sach;
import com.vti.entity.TaiLieu;
import com.vti.entity.TapChi;
import com.vti.ultils.ScannerUtils;

public class QLTV {
	
	static ArrayList<TaiLieu> listTaiLieus = new ArrayList<TaiLieu>();
    static ArrayList<Sach> listSachs = new ArrayList<>();
    static ArrayList<TapChi> listTapChis = new ArrayList<>();
    static ArrayList<Bao> listBaos = new ArrayList<>();

    public static void nhapTaiLieu() {
    	System.out.println("Nhập vào số tài liệu");
    	int quantity = ScannerUtils.inputInt();
    	for (int i = 0; i < quantity; i++) {
			System.out.println("Tài liệu số " + (i + 1));
			System.out.println("Nhập vào mã tài liệu");
			String maTL = ScannerUtils.inputString("Bạn không được bỏ trống");
			System.out.println("Nhập vào tên nhà xuất bản");
			String tenNXB = ScannerUtils.inputString("Bạn không được bỏ trống");
			System.out.println("Nhập vào số bản phát hành");
			int soBanPH = ScannerUtils.inputInt();
//			TaiLieu taiLieu = new TaiLieu(maTL, tenNXB, soBanPH);
//			listTaiLieus.add(taiLieu);
			System.out.println("Nhập vào loại tài liệu: 1-Sách | 2-Tạp chí | 3-Báo");
			int typeTL = ScannerUtils.inputInt();
			boolean check = false;
			while (!check) {
				if(typeTL == 1) {
					System.out.println("Nhập vào tên tác giả");
					String tenTG = ScannerUtils.inputString("Bạn không được bỏ trống");
					System.out.println("Nhập vào số trang");
					int soStrang = ScannerUtils.inputInt();
					Sach sach = new Sach(tenTG, soStrang, maTL, tenNXB, soBanPH);
					listSachs.add(sach);
					listTaiLieus.add(sach);
					check = true;
				} else if(typeTL == 2) {
					System.out.println("Nhập vào số phát hành");
					int soPH = ScannerUtils.inputInt();
					System.out.println("Nhập vào tháng phát hành");
					int thangPH = ScannerUtils.inputInt();
					TapChi tapChi = new TapChi(soPH, thangPH, maTL, tenNXB, soBanPH);
					listTapChis.add(tapChi);
					listTaiLieus.add(tapChi);
					check = true;
				} else if (typeTL == 3) {
					System.out.println("Nhập vào ngày phát hành");
					int ngayPH = ScannerUtils.inputInt();
					Bao bao = new Bao(ngayPH, maTL, tenNXB, soBanPH);
					listBaos.add(bao);
					listTaiLieus.add(bao);
					check = true;
				} else {
					System.out.println("Nhập chưa đúng. Nhập lại");
					check = false;
				}
			}
			
		}
    }
    
    public static boolean checkIdInlistTL(String id, ArrayList<TaiLieu> listTaiLieus) {
    	for (TaiLieu taiLieu : listTaiLieus) {
			if(id.equals(taiLieu.getMaTL())) {
				return true;
			}
		}
    	return false;
    }
    
    public static void deleteTLFromID () {
    	System.out.println("Nhập vào mã TL cần xóa");
    	String maTL = ScannerUtils.inputString("Bạn không được bỏ trống");
    	if(checkIdInlistTL(maTL, listTaiLieus)) {
    		for (TaiLieu taiLieu : listTaiLieus) {
    			if(maTL.equals(taiLieu.getMaTL())) {
    				listTaiLieus.remove(taiLieu);
    				System.out.println("Xóa thành công " + taiLieu.toString());
    			}
    		}
    	}
    }

    public static void displayTL () {
    	System.out.println("Thông tin về tài liệu");
    	for (TaiLieu taiLieu : listTaiLieus) {
			System.out.println(taiLieu.toString());
		}
    }
    
    public static void search() {
    	System.out.println("Nhập ma tài liệu cần tìm");
    	String maTL = ScannerUtils.inputString("Bạn không được bỏ trống");
    	boolean check = false;
    	for (TaiLieu taiLieu : listTaiLieus) {
			if(maTL.equals(taiLieu.getMaTL())) {
				System.out.println("Tìm thấy " + maTL);
				System.out.println(taiLieu.toString());
				check = true;
			}
		}
    	if(check == false) {
    		System.out.println("Không tìm thấy !");
    	}
    }
    
    public static void main(String[] args){
      nhapTaiLieu();
      displayTL();
      deleteTLFromID();
      displayTL();
      search();
    }

}
