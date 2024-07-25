package com.vti.backend;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Exercise5 {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Account> listAccount = new ArrayList<Account>();

	// Question 1
	public static void nhapSoNguyen() throws Exception {
		boolean checka = false, checkb = false, checkc = false;
		System.out.println("-------------------QUESTION 1-----------------");
		while (!checka) {
			try {
				System.out.println("Nhap vao so nguyen thu nhat");
				int a = sc.nextInt();
				sc.nextLine();
				checka = true;
				System.out.println("So nguyen thu 2 la: " + a);
			} catch (Exception e) {
				System.out.println("Nhap sai nhap lai");
				sc.next();
			}
		}
		while (!checkb) {
			try {
				System.out.println("Nhap vao so nguyen thu hai");
				int b = sc.nextInt();
				checkb = true;
				System.out.println("So nguyen thu 2 la: " + b);
			} catch (Exception e) {
				System.out.println("Nhap sai nhap lai");
				sc.next();
			}
		}
		while (!checkc) {
			try {
				System.out.println("Nhap vao so nguyen thu 3");
				int c = sc.nextInt();
				checkc = true;
				System.out.println("So nguyen thu 3 la: " + c);
			} catch (Exception e) {
				System.out.println("Nhap sai nhap lai");
				sc.next();
			}
		}

	}

	// Question 2
	public static void nhapSoThuc() {
		boolean checka = false, checkb = false, checkc = false;
		System.out.println("-------------------QUESTION 2-----------------");
		while (!checka) {
			System.out.print("Nhap so thuc thu 1");
			try {
				double a = sc.nextDouble();
				checka = true;
				System.out.println("Ban da nhap: " + a);
			} catch (InputMismatchException e) {
				System.out.println("Day khong phai so thuc. Nhap lai ");
				sc.next();
			}
		}
		while (!checkb) {
			System.out.print("Nhap so thuc thu 2");
			try {
				double b = sc.nextDouble();
				checkb = true;
				System.out.println("Ban da nhap: " + b);
			} catch (InputMismatchException e) {
				System.out.println("Day khong phai so thuc. Nhap lai");
				sc.next();
			}
		}
		while (!checkc) {
			System.out.print("Nhap so thuc thu 3");
			try {
				double c = sc.nextDouble();
				checkc = true;
				System.out.println("Ban da nhap: " + c);
			} catch (InputMismatchException e) {
				System.out.println("Day khong phai so thuc.Nhap lai");
				sc.next();
			}
		}
	}

	// Question 3
	public static void nhapHoTen() {
		boolean checkHo = false, checkTen = false;
		System.out.println("-------------------QUESTION 3-----------------");
		while (!checkHo) {
			System.out.println("Nhap vao ho");
			String ho = sc.nextLine();
			if (ho.equalsIgnoreCase("")) {
				System.out.println("Ho khong duoc bo trong. Nhap lai");
				checkHo = false;
			} else {
				checkHo = true;
				System.out.println("Ho vua nhap la: " + ho);
			}
		}
		while (!checkTen) {
			System.out.println("Nhap vao ten");
			String ten = sc.nextLine();
			if (ten.equalsIgnoreCase("")) {
				System.out.println("Ten khong duoc bo trong. Nhap lai");
				checkTen = false;
			} else {
				checkTen = true;
				System.out.println("Ten vua nhap la: " + ten);
			}
		}
	}

	// Question 4
	public static boolean checkNamNhuan(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	public static int tinhNgayThangHai(int nam) {
		if (checkNamNhuan(nam)) {
			return 29;
		} else {
			return 28;
		}
	}

	public static int layNgayTrongThang(int nam, int thang) {
		YearMonth yearMonth = YearMonth.of(nam, thang);
		return yearMonth.lengthOfMonth();
	}

	public static int checkDoDai(int input) {
		String numberStr = Integer.toString(input);
		if (input < 0) {
			return numberStr.length() - 1;
		} else {
			return numberStr.length();
		}
	}

	public static void nhapNgaySinhNhat() {
		boolean check = false, checkNgay = false, checkThang = false, checkNam = false;
		System.out.println("-------------------QUESTION 4-----------------");
		int ngay = 0, thang = 0, nam = 0;
		while (!checkNam) {
			try {
				System.out.println("Nhap vao nam sinh");
				nam = sc.nextInt();
				checkNam = true;
				LocalDate localDate = LocalDate.now();
				if (nam > localDate.getYear()) {
					System.out.println("Nam khong duoc lon hon nam " + localDate.getYear());
					checkNam = false;
				} else if (checkDoDai(nam) != 4) {
					System.out.println("Nam khong hop le. Nhap lai");
					checkNam = false;
				}

			} catch (Exception e) {
				System.out.println("Nam chua dung. Nhap lai");
				sc.next();
				check = false;
			}
		}
		while (!checkThang) {
			try {
				System.out.println("Nhap vao thang sinh");
				thang = sc.nextInt();
				checkThang = true;
				if (thang < 1 || thang > 13) {
					System.out.println("Thang khong hop hop le. Nhap lai");
					checkThang = false;
				} else if (checkDoDai(thang) > 2) {
					System.out.println("Thang khong hop le. Nhap lai");
					checkThang = false;
				}
			} catch (Exception e) {
				System.out.println("Thang chua dung. Nhap lai");
				sc.next();
				check = false;
			}
		}
		while (!checkNgay) {
			try {
				System.out.println("Nhap vao ngay sinh");
				ngay = sc.nextInt();
				checkNgay = true;
				if (thang == 2) {
					if (ngay > tinhNgayThangHai(nam)) {
						System.out.println("Ngay khong duoc lon hon " + tinhNgayThangHai(nam));
						checkNgay = false;
					}
				} else {
					if (ngay < 0 || ngay > layNgayTrongThang(nam, thang)) {
						System.out.println("Ngay khong hop le");
						checkNgay = false;
					}
				}
			} catch (Exception e) {
				System.out.println("Thang chua dung. Nhap lai");
				sc.next();
				check = false;
			}
		}
		if (!check) {

			System.out.println("Ngay thang nam sinh cua ban la: " + ngay + "/" + thang + "/" + nam);
		}
	}

	// Question 5

	public static void displayListAccount() {
		System.out.println("Cac account vua tao la ");
		for (Account a : listAccount) {
			System.out.println(a.toString());
		}
	}

	public static void createAcocunt() {
		Position pos[] = new Position[4];
		pos[0] = new Position(1, "DEV");
		pos[1] = new Position(2, "TEST");
		pos[2] = new Position(3, "ScumMaster");
		pos[3] = new Position(4, "PM");
		System.out.println("-------------------QUESTION 5-----------------");
		Position p = null;
		String id = null, email = null, userName = null, fullName = null;
		System.out.println("Nhap vao so account muon tao");
		int soLuong = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < soLuong; i++) {
			boolean checkID = false, checkUserName = false, checkEmail = false, checkFullName = false,
					checkPosition = false;
			System.out.println("account thu " + (i + 1));
			while (!checkID) {
				try {
					System.out.println("Nhap vao ID");
					id = sc.nextLine();
					if (id.equalsIgnoreCase("")) {
						System.out.println("ID khong duoc bo trong. Nhap lai");
						checkID = false;
					} else {
						checkID = true;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					sc.next();

				}
			}
			while (!checkUserName) {
				try {
					System.out.println("Nhap vao username");
					userName = sc.nextLine();
					if (userName.equalsIgnoreCase("")) {
						System.out.println("Username khong duoc bo trong. Nhap lai");
						checkUserName = false;
					} else {
						checkUserName = true;

					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					sc.next();
				}
			}
			while (!checkEmail) {
				try {
					System.out.println("Nhap vao email");
					email = sc.nextLine();
					if (email.equalsIgnoreCase("")) {
						System.out.println("Email khong duoc bo trong. Nhap lai");
						checkEmail = false;
					} else {
						checkEmail = true;

					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					sc.next();

				}
			}
			while (!checkFullName) {
				try {
					System.out.println("Nhap vao fullname");
					fullName = sc.nextLine();
					if (fullName.equalsIgnoreCase("")) {
						System.out.println("fullname khong duoc bo trong. Nhap lai");
						checkFullName = false;
					} else {
						checkFullName = true;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					sc.next();
				}
			}
			while (!checkPosition) {
				try {
					System.out.println("Nhap vao vi tri: 1:DEV - 2:TEST - 3:ScrumMaster - 4:PM");
					int inputPosition = sc.nextInt();
					sc.nextLine();
					if (inputPosition < 0 || inputPosition > 4) {
						System.out.println("Lua chon khong hop le. Nhap lai");
						checkPosition = false;
					} else {
						checkPosition = true;
						p = new Position(pos[inputPosition - 1].positionId, pos[inputPosition - 1].positionName);
					}
				} catch (Exception e) {
					System.out.println("Nhap sai. Nhap lai");
					sc.next();
				}
			}

			if (checkID = true && checkUserName == true && checkEmail == true && checkFullName == true
					&& checkPosition == true) {
				Date d = new Date();
				Account acc = new Account(id, email, userName, fullName, p, d);
				listAccount.add(acc);
			}
		}
		displayListAccount();
	}

	// Question 6
	public static void createDepartment() {
		boolean checkID = false, checkDepartmentName = false;
		String id = null, departmentName = null;
		System.out.println("-------------------QUESTION 6-----------------");
		while (!checkID) {
			try {
				System.out.println("Nhap vao ID");
				id = sc.nextLine();
				if (id.equalsIgnoreCase("")) {
					System.out.println("ID khong duoc bo trong. Nhap lai");
					checkID = false;
				} else {
					checkID = true;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				sc.next();
			}
		}
		while (!checkDepartmentName) {
			try {
				System.out.println("Nhap vao ten phong");
				departmentName = sc.nextLine();
				if (departmentName.equalsIgnoreCase("")) {
					System.out.println("ten phong khong duoc bo trong. Nhap lai");
					checkDepartmentName = false;
				} else {
					checkDepartmentName = true;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				sc.next();

			}
		}
		if (checkID == true && checkDepartmentName == true) {
			Department d = new Department(id, departmentName);
			System.out.println("Department vua tao la: " + d.toString());
		}
	}

	// Question 7
	public static void inputValueFromConsole() {
		System.out.println("-------------------QUESTION 7-----------------");
		boolean check = false;
		while (!check) {
			try {
				System.out.println("Nhap vao so");
				int number = sc.nextInt();
				if (number % 2 != 0) {
					System.out.println("Khong phai so chan. Nhap lai");
					check = false;
				} else {
					check = true;
				}
			} catch (Exception e) {
				System.out.println("Khong hop le. Nhap lai");
				sc.next();
			}
		}
	}

	// Question 8

	public static void menu() {
		System.out.println("--------------------------------------------");
		System.out.println("Moi ban nhap vao cac chuc nang muon su dung");
		System.out.println("1. Tao account");
		System.out.println("2. Tao department");
		System.out.println("3. Them group vao account");
		System.out.println("4. Them random");
		System.out.println("5. Thoat");
		System.out.println("---------------------------------------------");
		System.out.println("Lua chon cua ban la:");
	}

	public static boolean isContinue() {
		boolean checkInput = false;
		try {
			while (!checkInput) {
				System.out.println("Ban co muon thuc hien chuc nang khac khong: 1:Co - 0:Khong");
				int checkContinue = sc.nextInt();
				checkInput = true;
				if (checkContinue == 1) {
					return true;
				} else if (checkContinue == 0) {
					return false;
				} else {
					System.out.println("Lua chon khong hop le. Nhap lai");
					return false;
				}
			}
		} catch (Exception e) {
			System.out.println("Lua chon khong hop le. Nhap lai");
			sc.next();
		}
		return false;
	}

	public static void menuOption() {
		System.out.println("-------------------QUESTION 8-----------------");
		boolean check = false;
		boolean isContinue = true;
		;
		while (!check && isContinue == true) {
			try {
				int valueSelect;
				do {
					menu();
					valueSelect = sc.nextInt();
					sc.nextLine();
					check = true;
					switch (valueSelect) {
					case 1: {
						createAcocunt();
						check = isContinue();
						if (check == false) {
							System.out.println("Da thoat");
							return;
						}
						break;
					}
					case 2: {
						createDepartment();
						check = isContinue();
						if (check == false) {
							System.out.println("Da thoat");
							return;
						}
						break;
					}
					case 3: {
						addGroupIntoAccount();
						check = isContinue();
						if (check == false) {
							System.out.println("Da thoat");
							return;
						}
						break;
					}
					case 4: {
						addGroupIntoAccountRandom();
						check = isContinue();
						if (check == false) {
							System.out.println("Da thoat");
							return;
						}
						break;
					}
					default:
						System.out.println("Da thoat");
						return;
					}
				} while (valueSelect >= 1 && valueSelect <= 4);
			} catch (Exception e) {
				System.out.println("Khong hop le. Nhap lai");
				sc.next();
			}
		}
	}

	// Question 9
	public static void displayUserName() {
		System.out.println("Cac usernamela ");
		for (Account a : listAccount) {
			System.out.println(a.getUserName());
		}
	}

	public static boolean checkUserNameInAccount(String userNameAccount) {
		for (Account account : listAccount) {
			if (account.getUserName().equals(userNameAccount)) {
				return true;
			}
		}
		return false;
	}

	public static Account getDataAcount(String userNameAccount) {
		Account acc = null;
		for (Account account : listAccount) {
			if (account.getUserName().equals(userNameAccount)) {
				acc = new Account(account.getAccountId(), account.getEmail(), account.getUserName(),
						account.getFullName(), account.getPosition(), account.getCreateDate());
			}
		}
		return acc;
	}

	public static ArrayList<Group> fakeDataGroup() {
		ArrayList<Group> listGroup = new ArrayList<Group>();
		listGroup.add(new Group("1", "Java Fresher", "1", new Date()));
		listGroup.add(new Group("2", "C# Fresher", "2", new Date()));
		listGroup.add(new Group("3", "React Js Intern", "3", new Date()));
		listGroup.add(new Group("4", "Senior Leader", "3", new Date()));
		listGroup.add(new Group("5", "Project Manager", "1", new Date()));
		return listGroup;
	}

	public static void displayNameGroup() {
		ArrayList<Group> listGroup = new ArrayList<Group>();
		listGroup = fakeDataGroup();
		System.out.println("Cac ten group la:");
		for (Group group : listGroup) {
			System.out.println(group.getGroupName());
		}
	}

	public static boolean checkGroupNameInGroup(String groupName) {
		ArrayList<Group> listGroup = new ArrayList<Group>();
		listGroup = fakeDataGroup();
		for (Group group : listGroup) {
			if (groupName.equalsIgnoreCase(group.getGroupName())) {
				return true;
			}
		}
		return false;
	}

	public static Group getDataGroup(String groupName) {
		Group g = null;
		ArrayList<Group> listGroup = new ArrayList<Group>();
		listGroup = fakeDataGroup();
		for (Group group : listGroup) {
			if (groupName.equalsIgnoreCase(group.getGroupName())) {
				g = new Group(group.getGroupId(), group.getGroupName(), group.getCreatorId(), new Date());
			}
		}
		return g;
	}

	public static void addGroupIntoAccount() {
		System.out.println("-------------------QUESTION 9-----------------");
		ArrayList<Group> listGroup = new ArrayList<Group>();
		listGroup = fakeDataGroup();
		boolean checkUserName = false;
		String usernameAccount = "";
		if(listAccount.size() > 0) {
			displayUserName();
			while (!checkUserName) {
				System.out.println("Nhap username cua account");
				usernameAccount = sc.nextLine();
				if (checkUserNameInAccount(usernameAccount)) {
					checkUserName = true;
				} else {
					checkUserName = false;
					System.out.println("Username khong ton tai. Nhap lai");
				}
			}
			displayNameGroup();
			boolean checkGroupName = false;
			String groupName = "";
			while (!checkGroupName) {
				System.out.println("Nhap groupname cua group");
				groupName = sc.nextLine();
				if (checkGroupNameInGroup(groupName)) {
					checkGroupName = true;
				} else {
					checkGroupName = false;
					System.out.println("Groupname khong ton tai. Nhap lai");
				}
			}
			if (checkUserName == true && checkGroupName == true) {
				Groupaccount groupaccount = new Groupaccount(getDataGroup(groupName), getDataAcount(usernameAccount),
						new Date());
				System.out.println("Vua them la");
				System.out.println(groupaccount.toString());
			}
		} else {
			createAcocunt();
			while (!checkUserName) {
				System.out.println("Nhap username cua account");
				usernameAccount = sc.nextLine();
				if (checkUserNameInAccount(usernameAccount)) {
					checkUserName = true;
				} else {
					checkUserName = false;
					System.out.println("Username khong ton tai. Nhap lai");
				}
			}
			displayNameGroup();
			boolean checkGroupName = false;
			String groupName = "";
			while (!checkGroupName) {
				System.out.println("Nhap groupname cua group");
				groupName = sc.nextLine();
				if (checkGroupNameInGroup(groupName)) {
					checkGroupName = true;
				} else {
					checkGroupName = false;
					System.out.println("Groupname khong ton tai. Nhap lai");
				}
			}
			if (checkUserName == true && checkGroupName == true) {
				Groupaccount groupaccount = new Groupaccount(getDataGroup(groupName), getDataAcount(usernameAccount),
						new Date());
				System.out.println("Vua them la");
				System.out.println(groupaccount.toString());
			}
		}
	}

	// Question 11

	public static void addGroupIntoAccountRandom() {
		System.out.println("-------------------QUESTION 11-----------------");
		ArrayList<Group> listGroup = new ArrayList<Group>();
		listGroup = fakeDataGroup();
		boolean checkUserName = false;
		String usernameAccount = "";
		if (listAccount.size() > 0) {
			displayUserName();
			while (!checkUserName) {
				System.out.println("Nhap username cua account");
				usernameAccount = sc.nextLine();
				if (checkUserNameInAccount(usernameAccount)) {
					checkUserName = true;
				} else {
					checkUserName = false;
					System.out.println("Username khong ton tai. Nhap lai");
				}
			}
		} else {
			createAcocunt();
			while (!checkUserName) {
				System.out.println("Nhap username cua account");
				usernameAccount = sc.nextLine();
				if (checkUserNameInAccount(usernameAccount)) {
					checkUserName = true;
				} else {
					checkUserName = false;
					System.out.println("Username khong ton tai. Nhap lai");
				}
			}
		}
		displayNameGroup();
		Random random = new Random();
		int minIndex = Integer.parseInt(listGroup.getFirst().getGroupId());
		int maxIndex = Integer.parseInt(listGroup.getLast().getGroupId());
		int indexRandom = random.nextInt(minIndex, maxIndex);
		if (checkUserName == true) {
			Groupaccount groupaccount = new Groupaccount(listGroup.get(indexRandom), getDataAcount(usernameAccount),
					new Date());
			System.out.println("Vua them la");
			System.out.println(groupaccount.toString());
		}
	}

	public static void menuMain() {
		System.out.println("----------------------MENU--------------------");
		System.out.println("1.Question 1: Nhap so nguyen");
		System.out.println("2.Question 2: Nhap so thuc");
		System.out.println("3.Question 3: Nhap ho ten");
		System.out.println("4.Question 4: Nhap ngay sinh nhat");
		System.out.println("5.Question 5: Tao account");
		System.out.println("6.Question 6: Tao department");
		System.out.println("7.Question 7: Nhap so chan tu console");
		System.out.println("8.Question 8");
		System.out.println("9.Question 9");
		System.out.println("10.Question 10");
		System.out.println("11.Question 11");
		System.out.println("12. Thoat");
		System.out.println("----------------------------------------------");
		System.out.println("Lua chon cua ban");
	}

	public static void menuOptionMain() {
		System.out.println("------------------------------------------");
		boolean check = false;
		while (!check) {
			try {
				int valueSelect;
				do {
					menuMain();
					valueSelect = sc.nextInt();
					sc.nextLine();
					check = true;
					switch (valueSelect) {
					case 1: {
						nhapSoNguyen();
						break;
					}
					case 2: {
						nhapSoThuc();
						break;
					}
					case 3: {
						nhapHoTen();
						break;
					}
					case 4: {
						nhapNgaySinhNhat();
						break;
					}
					case 5: {
						createAcocunt();
						break;
					}
					case 6: {
						createDepartment();
						break;
					}
					case 7: {
						inputValueFromConsole();
						break;
					}
					case 8: {
						menuOption();
						break;
					}
					case 9: {
						addGroupIntoAccount();
						break;
					}
					case 10: {
						menuOption();
						break;
					}
					case 11: {
						menuOption();
						break;
					}
					default:
						System.out.println("Da thoat");
						return;
					}
				} while (valueSelect >= 1 && valueSelect <= 11);
			} catch (Exception e) {
				System.out.println("Khong hop le. Nhap lai");
				sc.next();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		menuOptionMain();
	}
}
