package com.vti.ultils;

import java.time.LocalDate;
import java.util.Scanner;

public class ScannerUtils {

	private static Scanner scanner = new Scanner(System.in);

	public static int inputId(String msg) {
		while (true) {
			System.out.println(msg);
			int id = inputInt("Please input a id as int, please input again.");
			if (id > 0) {
				return id;
			}
			// else
			System.out.println("Please input a id as int which must be greater than > 0, please input again.");
		}
	}

	public static String inputName(String msg) {
		System.out.println(msg);
		return inputString("Nhập vào 1 tên. Nhập lại");
	}

	public static int inputInt() {
		return inputInt("Phải nhập vào 1 số kiểu int. Nhập lại");
	}

	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static float inputFloat(String errorMessage) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static double inputDouble(String errorMessage) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static String inputString(String errorMessage) {
		while (true) {
			String input = scanner.nextLine().trim();
			if (!input.isEmpty()) {
				return input;
			} else {
				System.err.println(errorMessage);
			}
		}
	}

	public static int inputAge() {
		while (true) {
			int age = inputInt("Wrong inputing! Please input an age as int, input again.");

			if (age <= 0) {
				System.err.println("Wrong inputing! The age must be greater than 0, please input again.");

			} else {
				return age;
			}
		}
	}

	public static int inputAgeGreaterThan18() {
		while (true) {
			int age = inputAge();

			if (age >= 18) {
				return age;

			} else {
				System.out.println("Wrong inputing! The age must be greater than 18, please input again.");
			}
		}
	}
	
	public static int inputYearOfBirth() {
		while (true) {
			int year = inputInt("Nhập dữ liệu chưa đúng. Nhập lại");

			if (year <= 0) {
				System.err.println("Tuổi phải lớn hơn không");

			} else if(year < 1910 || LocalDate.now().getYear() - year < 18  ){
				System.err.println("Bạn chưa đủ 18 tuổi");
				break;
			}else {
				return year;
			}
		}
		return -1;
	}
	
	public static String inputTelePhone() {
		while (true) {
			String teleNumber = inputString("Bạn không được bỏ trống");
			if(teleNumber.length() < 10 || teleNumber.length()  >= 11) {
				System.out.println("Độ dài số điện thoại không hợp lệ. Nhập lại");
			} else if (!teleNumber.startsWith("0")) {
				System.out.println("Định dạng số điện thoại chưa đúng. Nhập lại");
			} else {
				return teleNumber;
			}
		}
	}
}
