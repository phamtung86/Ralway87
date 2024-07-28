package com.vti.backend;

import java.util.ArrayList;
import java.util.PrimitiveIterator.OfInt;
import java.util.Scanner;

import com.vti.utils.ScannerUtils;

public class Exercise4 {

	// Question 1
	static Scanner sc = new Scanner(System.in);

	public static int countLength(String input) {
		String replaceString = input.replaceAll(" ", "");
		return replaceString.trim().length();
	}

	public static void interString() {
		System.out.println("******************** QUESTION 1 *********************");
		System.out.println("Nhập vào 1 chuỗi bất kì");
		String input = sc.nextLine();
		System.out.println("Số lượng kí tự là: " + countLength(input));
	}

	// Question 2
	public static void concatenationString() {
		System.out.println("******************** QUESTION 2 *********************");
		System.out.println("Nhập vào chuỗi s1");
		String s1 = sc.nextLine();
		System.out.println("Nhập vào chuỗi s2");
		String s2 = sc.nextLine();
		System.out.println("s2 nối với s1 là: " + s2.concat(s1));
	}

	// Question 3
	public static boolean checkUpperCase(String input) {
		if (input.substring(0, 1).equals(input.substring(0, 1).toUpperCase())) {
			return true;
		}
		return false;
	}

	public static String toUpperString(String input) {
		String subString1 = input.substring(0, 1);
		String subString2 = input.substring(1, input.length());
		return subString1.toUpperCase() + subString2;
	}

	public static void enterName() {
		System.out.println("******************** QUESTION 3 *********************");
		System.out.println("Nhập vào tên");
		String name = sc.nextLine();
		if (checkUpperCase(name)) {
			System.out.println("Tên vừa nhập là: " + name);
		} else {
			System.out.println("Tên vừa nhập chưa viết hoa chữ cái đầu");
			System.out.println("Tên sửa lại là: " + toUpperString(name));
		}
	}

	// Question 4
	public static void printCharUser() {
		System.out.println("******************** QUESTION 4 *********************");
		System.out.println("Nhập vào tên người dùng");
		String name = sc.nextLine();
		for (int i = 0; i < name.length(); i++) {
			System.out.println("Kí tự " + (i + 1) + " là: " + name.substring(i, i + 1));
		}
	}

	// Question 5
	public static void enterFullName() {
		System.out.println("******************** QUESTION 5 *********************");
		System.out.println("Nhập vào họ");
		String surName = ScannerUtils.inputString("Họ không được bỏ trống");
		System.out.println("Nhập vào tên");
		String name = ScannerUtils.inputString("Tên không được bỏ trống");
		System.out.println("Họ tên vừa nhập là: " + surName + " - " + name);
	}

	// Question 6
	public static void enterFullNameToSplit() {
		System.out.println("******************** QUESTION 6 *********************");
		System.out.println("Nhập vào đầy đủ họ tên");
		String fullName = ScannerUtils.inputString("Bạn không được bỏ trống");
		String arr[] = fullName.split(" ");
		System.out.println("Họ: " + arr[0]);
		System.out.println("Tên đệm: " + arr[1]);
		System.out.println("Tên: " + arr[2]);
	}

	// Question 7

	public static void standardizedName() {
		System.out.println("******************** QUESTION 7 *********************");
		System.out.println("Nhập vào tên");
		String name = ScannerUtils.inputString("Bạn không được để trống");
		System.out.println("Xóa khoảng trắng ở đầu và cuối và giữa: " + name.trim());
		String arrSplit[] = name.split(" ");
		boolean checkFN = false, checkMN = false, checkLN = false;
		;
		String firstName = "", midleName = "", lastName = "";
		if (checkUpperCase(arrSplit[0])) {
			firstName = arrSplit[0];
			checkFN = true;
		} else {
			firstName = toUpperString(arrSplit[0]);
		}
		if (checkUpperCase(arrSplit[1])) {
			midleName = arrSplit[1];
			checkMN = true;
		} else {
			midleName = toUpperString(arrSplit[1]);
		}
		if (checkUpperCase(arrSplit[2])) {
			lastName = arrSplit[2];
			checkLN = true;
		} else {
			lastName = toUpperString(arrSplit[2]);
		}

		System.out.println("Viết hóa chữ cái đầu mỗi từ");
		if (checkFN == true && checkMN == true && checkLN == true) {
			System.out.println(name + " không cần chuẩn hóa");
		} else {
			System.out.println(name + " sau khi chuẩn hóa là: " + firstName + " " + midleName + " " + lastName);
		}
	}

	// Question 10
	public static boolean checkReverse(String s1, String s2) {
		String stringReverse = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			stringReverse += s1.charAt(i);
		}
		if (stringReverse.equals(s2)) {
			return true;
		}
		return false;
	}

	public static void s1ReverseS2() {
		System.out.println("******************** QUESTION 10 *********************");
		System.out.println("Nhập vào chuỗi s1");
		String s1 = sc.nextLine();
		System.out.println("Nhập vào chuỗi s2");
		String s2 = sc.nextLine();
		if (checkReverse(s1, s2)) {
			System.out.println("OK");
		} else {
			System.out.println("KO");
		}
	}

	// Question 11
	public static void countCharA() {
		System.out.println("******************** QUESTION 11 *********************");
		System.out.println("Nhập vào chuỗi bất kì");
		String input = ScannerUtils.inputString("Bạn không được bỏ trống");
		int count = 0;
		String arr[] = input.split("");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("a")) {
				count++;
			}
		}
		System.out.println("Số lần xuất hiện của a trong chuỗi là: " + count);
	}

	// Question 12

	public static void reverseStringUseLoop() {
		System.out.println("******************** QUESTION 12 *********************");
		System.out.println("Nhập vào 1 chuỗi bất kì");
		String s1 = ScannerUtils.inputString("Bạn không được bỏ trống");
		String stringReverse = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			stringReverse += s1.charAt(i);
		}
		System.out.println(s1 + " sau khi đảo ngược là: " + stringReverse);
	}

	// Question 13

	public static boolean checkNumberInString(String input) {

		for (char c : input.toCharArray()) {
			if (Character.isDigit(c)) {
				return true;
			}
		}
		if (input.equals(null)) {
			return false;
		}
		return false;
	}

	public static void numberInString() {
		System.out.println("******************** QUESTION 13 *********************");
		System.out.println("Nhập vào 1 chuỗi bất kì");
		String input = ScannerUtils.inputString("Bạn không được bỏ trống");
		if (checkNumberInString(input)) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}

	// Question 14

	public static boolean checkInString(String a, String input) {
		for (int i = 0; i < input.length(); i++) {
			if (input.contains(a)) {
				return true;
			}
		}
		return false;
	}

	public static void convertString() {
		System.out.println("******************** QUESTION 14 *********************");
		System.out.println("Nhập vào 1 chuỗi bất kì");
		String input = ScannerUtils.inputString("Bạn không được bỏ trống");
		System.out.println("Nhập vào kí tự bạn muốn chuyển");
		String a = ScannerUtils.inputString("Bạn không được bỏ trống");
		String c = " ";
		if (checkInString(a, input)) {
			System.out.println("Nhập vào kí tự bạn muốn chuyển thành để thay thế cho " + a);
			c = ScannerUtils.inputString("Bạn không được bỏ trống");
		} else {
			System.out.println(a + " không có trong " + input);
		}
		System.out.println("Sau khi chuyển");
		System.out.println(input.replace(a, c));
	}

	// Question 15
	public static void splitStringToReverse() {
		System.out.println("******************** QUESTION 15 *********************");
		System.out.println("Nhập vào 1 chuỗi bất kì");
		String input = ScannerUtils.inputString("Bạn không được bỏ trống");
		String arr[] = input.split(" ");
		String stringAfterReverse = "";
		for (int i = arr.length -1; i >=0 ; i--) {
			stringAfterReverse += arr[i] + " ";
		}
		System.out.println("Chuỗi đảo ngược: " + stringAfterReverse);
	}
	
	// Question 16
	
	public static void perString () {
		System.out.println("******************** QUESTION 16 *********************");
		System.out.println("Nhập vào 1 chuỗi bất kì");
		String input = ScannerUtils.inputString("Bạn không được bỏ trống");
		System.out.println("Nhập vào số lượng kí tự trong chuỗi thành phần");
		int n = ScannerUtils.inputInt();
		String arr[] = null;
		ArrayList<String> listS = new ArrayList<String>();
		int count = 0;
		int i = 0;
		int currentSize = 0;
		try {
			while (true) {
				currentSize += n;
				if(input.length() - currentSize < n) {
					listS.add(input.substring(i, input.length() -1)) ;
					count ++;
					break;
				} else {
					listS.add(input.substring(i, i +n)) ;
					count ++;		
					i += n;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if(count %2 != 0) {
			System.out.println("KO");
		} else {
			System.out.println("CO");
		}
	}
	public static void main(String[] args) {
		interString();
		concatenationString();
		enterName();
		printCharUser();
		enterFullName();
		enterFullNameToSplit();
		standardizedName();
		s1ReverseS2();
		countCharA();
		reverseStringUseLoop();
		numberInString();
		convertString();
		splitStringToReverse();
		perString();
	}
}
