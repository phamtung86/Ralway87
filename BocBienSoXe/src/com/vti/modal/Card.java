package com.vti.modal;

import java.time.LocalDate;

public class Card {
	private String id;
	private User user;
	private Vehicle vehicle;
	private String bienSoXe;
	private LocalDate ngayDangKi;
	
	public Card(String id, User user, Vehicle vehicle, String bienSoXe) {
		super();
		this.id = id;
		this.user = user;
		this.vehicle = vehicle;
		this.bienSoXe = bienSoXe;
		this.ngayDangKi = LocalDate.now();
		
		
	}

	public void printData () {
		System.out.printf("%-30s %n", "Tên chủ xe: " + user.getName());
		System.out.printf("%-50s %n" , "Địa chỉ: " + user.getAddress());
		System.out.printf("%-20s %n", "Nhãn hiệu: " + vehicle.getBrand());
		System.out.printf("%10s %n", "Loại xe: " + vehicle.getType());
		System.out.printf("%-30s %n", "Số loại: " + vehicle.getModelCode());
		System.out.printf("%-50s %n" , "Số máy: " + vehicle.getEngineNumber());
		System.out.printf("%-50s %n" , "Số khung: " + vehicle.getChassiNumber());
		System.out.printf("%-15s %n" , "Màu sơn: " + vehicle.getColor());
		System.out.printf("%-20s %n" , "Biển số xe đăng kí: " + bienSoXe);
		System.out.printf("%-30s %n" , "Ngày đăng kí: " + ngayDangKi);
	}
	
	@Override
	public String toString() {
		return "Card [id=" + id + ", user=" + user + ", vehicle=" + vehicle + ", bienSoXe=" + bienSoXe + ", ngayDangKi="
				+ ngayDangKi + "]";
	}
	
	
	
}
