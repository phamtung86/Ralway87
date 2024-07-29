package com.vti.controller;

import java.util.ArrayList;
import com.vti.modal.Card;
import com.vti.modal.User;
import com.vti.modal.Vehicle;
import com.vti.utils.ScannerUtils;
import com.vti.utils.UserUtils;
import com.vti.utils.VehicleUtils;
import com.vti.utils.RandomUtils;
import com.vti.view.*;

public class main {
	static ArrayList<User> listUser = new ArrayList<User>();
	static ArrayList<Vehicle> listVehicles = new ArrayList<Vehicle>();
	static ArrayList<Card> listCard = new ArrayList<Card>();

	public static void createUserAndVihicle() {
		boolean checkType = false;
		System.out.println("Nhập vào mã phương tiện");
		String id = ScannerUtils.inputString("Mã phương tiện không được bỏ trống");

		System.out.println("Nhập vào loại xe: 1-Xe máy | 2-Ô tô");
		String type = "";
		while (!checkType) {
			int typeSelectValue = ScannerUtils.inputInt();
			if (typeSelectValue == 1) {
				type = "XE MAY";
				checkType = true;
			} else if (typeSelectValue == 2) {
				type = "O TO";
				checkType = true;
			} else {
				System.out.println("Nhập chưa đúng nhập lại");
				checkType = false;
			}
		}
		System.out.println("Nhập vào nhãn hiệu");
		String brand = ScannerUtils.inputString("Nhãn hiệu không được bỏ trống");

		System.out.println("Nhập vào số máy");
		String engineNumber = ScannerUtils.inputString("Số máy không được bỏ trống");

		System.out.println("Nhập vào số khung");
		String chassiNumber = ScannerUtils.inputString("Số khung không được bỏ trống");

		System.out.println("Nhập vào màu xe");
		String color = ScannerUtils.inputString("Màu không được bỏ trống");

		System.out.println("Nhập vào số loại");
		String modelCode = ScannerUtils.inputString("Số loại không được bỏ trống");

		Vehicle vehicle = new Vehicle(id, type, brand, engineNumber, chassiNumber, color, modelCode, modelCode);
		listVehicles.add(vehicle);
		System.out.println("Nhập vào số CCCD");
		String userID = ScannerUtils.inputString("CCCD không được để trống");
		String userName = ScannerUtils.inputName("Nhập vào tên chủ xe");
		System.out.println("Nhập vào năm sinh");
		int useryob = ScannerUtils.inputInt();
		System.out.println("Nhập vào địa chỉ");
		String userAddress = ScannerUtils.inputString("Địa chỉ không được bỏ trống");
		User user = new User(userID, userName, useryob, userAddress, vehicle);
		listUser.add(user);
		UserView.displayUser(listUser);
		VehicleView.displayVehicle(listVehicles);
	}

	// Tao thong tin
	public static void createRegistrationDoc() {
		System.out.println("Nhập vào số hồ sơ muốn tạo");
		int quantity = ScannerUtils.inputInt();
		for (int i = 0; i < quantity; i++) {
			System.out.println("Hồ sơ số " + (i + 1));
			createUserAndVihicle();
		}
	}

	// check do dai cua 1 chuoi
	public static int checkLength(String plateNumber) {
		int numberLength = plateNumber.length();
		return numberLength;
	}

	// Điền thêm số 0 nếu hàm random trả ra chưa đủ 5 số
	public static String addNumberLack(String plateLack) {
		String numberLack = "";
		if (checkLength(plateLack) == 5) {
			numberLack = plateLack;
		} else if (checkLength(plateLack) == 4) {
			numberLack = "0" + plateLack;
		} else if (checkLength(plateLack) == 3) {
			numberLack = "00" + plateLack;
		} else if (checkLength(plateLack) == 2) {
			numberLack = "000" + plateLack;
		} else if (checkLength(plateLack) == 1) {
			numberLack = "0000" + plateLack;
		}
		return numberLack;
	}

	public static void pickUpNumber() {
		boolean check = false;
		System.out.println("Nhập vào CCCD");
		String ID = ScannerUtils.inputString("Bạn phải nhập CCCD để bốc biển");
		String numberProvince = "";
		String plateNumber = "";
		char charProvince;
		if (UserUtils.checkIDInUser(ID, listUser)) {
			if (VehicleUtils.isXeMay(ID, listUser)) {
				numberProvince = "29";
				charProvince = RandomUtils.randomChar();
				String numberRandom = RandomUtils.randomNumber(1, 99999);
				plateNumber = addNumberLack(numberRandom);
				String plate = numberProvince + charProvince + RandomUtils.randomNumber(1, 10) + " - " + plateNumber;
				Card card = new Card(ID, UserUtils.findUserFromID(ID, listUser),
						VehicleUtils.findVehicleFromIdUser(ID, listUser), plate);
				CardView.displayCardDetail(plate, card);
			} else if (VehicleUtils.isOTo(ID, listUser)) {
				numberProvince = "30";
				charProvince = RandomUtils.randomChar();
				String numberRandom = RandomUtils.randomNumber(1, 99999);
				plateNumber = addNumberLack(numberRandom);
				String plate = numberProvince + charProvince + " - " + plateNumber;
				Card card = new Card(ID, UserUtils.findUserFromID(ID, listUser),
						VehicleUtils.findVehicleFromIdUser(ID, listUser), plate);
				CardView.displayCardDetail(plate, card);
			}
		} else {
			System.out.println("Số CCCD không đúng");
		}
	}

	public static void menu() {
		System.out.println("--------------------MENU--------------------");
		System.out.println("1. Tạo hồ sơ");
		System.out.println("2. Bốc biển");
		System.out.println("3. Thoát");
		System.out.println("--------------------------------------------");
		System.out.println("Nhập vào lựa chọn của bạn");
	}

	public static void menuOption() {
		int valueSelect = 0;
		do {
			menu();
			valueSelect = ScannerUtils.inputInt();
			switch (valueSelect) {
			case 1: {
				createRegistrationDoc();
				break;
			}
			case 2: {
				pickUpNumber();
				break;
			}
			default:
				System.out.println("Đã thoát !");
				return;
			}
		} while (valueSelect > 0 && valueSelect < 3);
	}

	public static void main(String[] args) {
		menuOption();

	}
}
