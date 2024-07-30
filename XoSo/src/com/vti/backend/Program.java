package com.vti.backend;

import java.util.ArrayList;

import com.vti.entity.Account;
import com.vti.entity.Bet;
import com.vti.entity.LotertResult;
import com.vti.entity.User;
import com.vti.entity.UserBet;
import com.vti.utils.AccountUtils;
import com.vti.utils.BetUltils;
import com.vti.utils.RandomUtils;
import com.vti.utils.ScannerUtils;
import com.vti.utils.UserBetUtils;
import com.vti.utils.UserUltils;

public class Program {
	static ArrayList<User> listUsers = new ArrayList<User>();
	static ArrayList<Bet> listBets = new ArrayList<Bet>();
	static ArrayList<UserBet> listUserBets = new ArrayList<UserBet>();
	static ArrayList<LotertResult> listLoteryResult = new ArrayList<LotertResult>();
	static ArrayList<Account> listAccounts = new ArrayList<Account>();

	public static boolean checkLogin(String userName, String passWord) {
		for (int i = 0; i < listAccounts.size(); i++) {
			if (listAccounts.get(i).getUserName().equals(userName)
					&& listAccounts.get(i).getPassWord().equals(passWord)) {
				return true;
			}
		}
		return false;
	}

	public static void createAccount() {
		boolean checkSame = false;
		System.out.println("Nhập vào tên đăng nhập");
		String userName = "";
		while (!checkSame) {
			String input = ScannerUtils.inputString("Bạn không được để trống");
			if (!AccountUtils.checkSameUsername(input, listAccounts)) {
				userName = input;
				checkSame = true;
			} else {
				System.out.println(input + " Đã tồn tại");
				checkSame = false;
			}

		}
		System.out.println("Nhập vào mật khẩu");
		String passWord = ScannerUtils.inputString("Bạn không được để trống");
		System.out.println("Nhập vào họ tên");
		String fullName = ScannerUtils.inputString("Bạn không được để trống");
		System.out.println("Nhập vào năm sinh");
		int yob = ScannerUtils.inputYearOfBirth();
		System.out.println("Nhập vào số điện thoại");
		String teleNumber = ScannerUtils.inputTelePhone();
		System.out.println("Nhập vào địa chỉ");
		String address = ScannerUtils.inputString("Bạn không được bỏ trống");
		User user = new User(String.valueOf(UserUltils.generateIdUser(listUsers)), fullName, yob, teleNumber, address);
		Account acc = new Account(String.valueOf(AccountUtils.generateIdAccount(listAccounts)), userName, passWord,
				user);
		listUsers.add(user);
		listAccounts.add(acc);
	}

	public static boolean isContinue() {
		System.out.println("Bạn có muốn tiếp tục đặt không: 1-Có | 2-Không");
		int valeContinue = ScannerUtils.inputInt();
		if (valeContinue == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void login() {
		System.out.println("Nhập vào tài khoản");
		String userName = ScannerUtils.inputString("Bạn không được để trống");
		System.out.println("Nhập vào mật khẩu");
		String passWord = ScannerUtils.inputString("Bạn không được để trống");
		if (checkLogin(userName, passWord)) {
			int value = 0;
			do {
				System.out.println("Nhấn 1 để bắt đầu đặt cược");
				value = ScannerUtils.inputInt();
				switch (value) {
				case 1: {
					System.out.println("Bạn đã đăng nhập thành công");
					boolean check = false;
					System.out.println("Nhập vào kiểu đặt 1: Đề | 2: Lô");
					String type = "";
					int pointBet = 0;
					while (!check) {
						int typeValue = ScannerUtils.inputInt();
						if (typeValue == 1) {
							type = "ĐỀ";
							pointBet = 0;
							check = true;
						} else if (typeValue == 2) {
							type = "LÔ";
							System.out.println("Nhập vào số điểm đặt cược");
							pointBet = ScannerUtils.inputInt();
							check = true;
						} else {
							System.out.println("Nhập chưa đúng. Nhập lại");
							check = false;
						}
					}
					System.out.println("Nhập vào số cược");
					String numberBet = ScannerUtils.inputString("Bạn không được bỏ trống");
					System.out.println("Nhập vào số tiền cược");
					double priceBet = ScannerUtils.inputDouble("Phải nhập vào 1 số kiêu double");
					Bet bet = new Bet(String.valueOf(BetUltils.generateIdBet(listBets)), type, numberBet, pointBet,
							priceBet);
					listBets.add(bet);
					UserBet userBet = new UserBet(String.valueOf(UserBetUtils.generateIdUser(listUserBets)),
							AccountUtils.getAccFromID(userName, listAccounts), bet);
					listUserBets.add(userBet);
					System.out.println("Đặt cược thành công");
					break;
				}
				default:
					System.out.println("Đã thoát thành công");
				}
			} while (value < 3 && isContinue());
		} else {
			System.out.println("Thất bại. Đăng nhập lại");
		}
	}

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

	public static void displayResultSpin(String stt, ArrayList<String> listPrize) {
		System.out.print("Kết quả giải " + stt + ": ");
		for (int i = 0; i < listPrize.size(); i++) {
			System.out.print(listPrize.get(i) + " ");

		}
		System.out.println();
	}

	public static void SpinNumber() {
		ArrayList<String> listSeventhPrize = new ArrayList<String>();
		ArrayList<String> listSixthPrize = new ArrayList<String>();
		ArrayList<String> listFifthPrize = new ArrayList<String>();
		ArrayList<String> listFourthPrize = new ArrayList<String>();
		ArrayList<String> listThirdthPrize = new ArrayList<String>();
		ArrayList<String> listSecondPrize = new ArrayList<String>();
		ArrayList<String> listFristPrize = new ArrayList<String>();
		ArrayList<String> listSpecialPrize = new ArrayList<String>();
//		System.out.println("Quay giải 7");
		for (int i = 0; i < 4; i++) {
			String randomNumber7 = RandomUtils.randomNumber(0, 99);
			listSeventhPrize.add(addNumberLack(randomNumber7).substring(addNumberLack(randomNumber7).length() - 2));
		}
//		displayResultSpin("7", listSeventhPrize);

//		System.out.println("Quay giải 6");
		for (int i = 0; i < 3; i++) {
			String randomNumber6 = RandomUtils.randomNumber(0, 999);
			listSixthPrize.add(addNumberLack(randomNumber6).substring(addNumberLack(randomNumber6).length() - 3));
		}
//		displayResultSpin("6", listSixthPrize);

//		System.out.println("Quay giải 5");
		for (int i = 0; i < 6; i++) {
			String randomNumber5 = RandomUtils.randomNumber(0, 9999);
			listFifthPrize.add(addNumberLack(randomNumber5).substring(addNumberLack(randomNumber5).length() - 4));
		}
//		displayResultSpin("5", listFifthPrize);

//		System.out.println("Quay giải 4");
		for (int i = 0; i < 4; i++) {
			String randomNumber4 = RandomUtils.randomNumber(0, 9999);
			listFourthPrize.add(addNumberLack(randomNumber4).substring(addNumberLack(randomNumber4).length() - 4));
		}
//		displayResultSpin("4", listFourthPrize);

//		System.out.println("Quay giải 3");
		for (int i = 0; i < 6; i++) {
			String randomNumber3 = RandomUtils.randomNumber(0, 99999);
			listThirdthPrize.add(addNumberLack(randomNumber3).substring(addNumberLack(randomNumber3).length() - 5));
		}
//		displayResultSpin("3", listThirdthPrize);
//		System.out.println("Quay giải 2");
		for (int i = 0; i < 2; i++) {
			String randomNumber2 = RandomUtils.randomNumber(0, 99999);
			listSecondPrize.add(addNumberLack(randomNumber2).substring(addNumberLack(randomNumber2).length() - 5));
		}
//		displayResultSpin("2", listSecondPrize);

//		System.out.println("Quay giải 1");
		for (int i = 0; i < 1; i++) {
			String randomNumber1 = RandomUtils.randomNumber(0, 99999);
			listFristPrize.add(addNumberLack(randomNumber1).substring(addNumberLack(randomNumber1).length() - 5));
		}
//		displayResultSpin("1", listFristPrize);

//		System.out.println("Quay giải đặc biệt");
		for (int i = 0; i < 1; i++) {
			String randomNumberdb = RandomUtils.randomNumber(0, 99999);
			listSpecialPrize.add(addNumberLack(randomNumberdb).substring(addNumberLack(randomNumberdb).length() - 5));
		}
//		displayResultSpin("Đặc biệt", listSpecialPrize);
		LotertResult lotertResult = new LotertResult(listSpecialPrize, listFristPrize, listSecondPrize,
				listThirdthPrize, listFourthPrize, listFifthPrize, listSixthPrize, listSeventhPrize);
		listLoteryResult.add(lotertResult);
		System.out.println("Kết quả xổ số hôm nay");
		System.out.println(listLoteryResult.getLast().toString());
	}


	// thêm tất cả các giải vào list String
	public static ArrayList<String> addAllPrizeToList() {
		ArrayList<String> listAllPrize = new ArrayList<String>();
		// add giai DB
		listAllPrize.add(listLoteryResult.getLast().getListSpecialPrize().toString().substring(4, 6));
		// add giai 1
		listAllPrize.add(listLoteryResult.getLast().getListFirstPrize().toString().substring(4, 6));
		// add giai 2
		for (int i = 0; i < listLoteryResult.getLast().getListSecondPrize().size(); i++) {
			listAllPrize.add(listLoteryResult.getLast().getListSecondPrize().get(i).toString().substring(3, 5));
		}
		// add giai 3
		for (int i = 0; i < listLoteryResult.getLast().getListThirdPrize().size(); i++) {
			listAllPrize.add(listLoteryResult.getLast().getListThirdPrize().get(i).toString().substring(3, 5));
		}
		// add giai 4
		for (int i = 0; i < listLoteryResult.getLast().getListFourthPrize().size(); i++) {
			listAllPrize.add(listLoteryResult.getLast().getListFourthPrize().get(i).toString().substring(2, 4));
		}
		// add giai 5
		for (int i = 0; i < listLoteryResult.getLast().getListFifthPrize().size(); i++) {
			listAllPrize.add(listLoteryResult.getLast().getListFifthPrize().get(i).toString().substring(2, 4));
		}

		// add giai 6
		for (int i = 0; i < listLoteryResult.getLast().getListSixthPrize().size(); i++) {
			listAllPrize.add(listLoteryResult.getLast().getListSixthPrize().get(i).toString().substring(1, 3));
		}

		// add giai 7
		for (int i = 0; i < listLoteryResult.getLast().getListSeventhPrize().size(); i++) {
			listAllPrize.add(listLoteryResult.getLast().getListSeventhPrize().get(i).toString());
		}

		return listAllPrize;
	}

	
	public static void listDe() {
		System.out.println("Danh sách trúng đề hôm nay");
		for (int i = 0; i < listUserBets.size(); i++) {
			for (int j = 0; j < listLoteryResult.getLast().getListSpecialPrize().size(); j++) {
				if (listUserBets.get(i).getBet().getNumberBet().equals(listLoteryResult.getLast().getListSpecialPrize().get(j).substring(3,5)) && listUserBets.get(i).getBet().getType().equals("Đề")) {
					System.out.println(listUserBets.get(i).toString());
					System.out.println("Số tiền " + listUserBets.get(i).getAcc().getUser().getFullName() + " trúng: "
							+ listUserBets.get(i).getBet().getPriceBet() * 70);
				}
			}
		}
		
	}
	
	public static void listLo() {
		ArrayList<String> listAllPrize = new ArrayList<String>();
		listAllPrize = addAllPrizeToList();
		System.out.println("Danh sách trúng lô");
		for (int i = 0; i < listUserBets.size(); i++) {
			for (int j = 0; j < listAllPrize.size(); j++) {
				if (listUserBets.get(i).getBet().getNumberBet().equals(listAllPrize.get(j)) && listUserBets.get(i).getBet().getType().equals("Lô")) {
					System.out.println(listUserBets.get(i));
					System.out.println("Số tiền " + listUserBets.get(i).getAcc().getUser().getFullName() + " trúng: "
							+ listUserBets.get(i).getBet().getPriceBet() * 3.5*listUserBets.get(i).getBet().getPointBet());
				}
			}
		}
	}

	public static void fakeData() {
		listUsers.add(new User("1", "Nguyen Van A", 1990, "0123456789", "Ha Noi"));
		listUsers.add(new User("2", "Tran Thi B", 1991, "0987654321", "Ho Chi Minh"));
		listUsers.add(new User("3", "Le Van C", 1992, "0123451234", "Da Nang"));
		listUsers.add(new User("4", "Pham Thi D", 1993, "0987655678", "Hai Phong"));
		listUsers.add(new User("5", "Hoang Van E", 1994, "0123456780", "Can Tho"));
		listUsers.add(new User("6", "Do Thi F", 1995, "0987651234", "Nha Trang"));
		listUsers.add(new User("7", "Ngo Van G", 1996, "0123454321", "Hue"));
		listUsers.add(new User("8", "Bui Thi H", 1997, "0987654320", "Vung Tau"));
		listUsers.add(new User("9", "Vu Van I", 1998, "0123456788", "Da Lat"));
		listUsers.add(new User("10", "Tran Thi K", 1999, "0987656789", "Quang Ninh"));
		listUsers.add(new User("11", "Nguyen Van L", 2000, "0123456790", "Ha Noi"));
		listUsers.add(new User("12", "Tran Thi M", 2001, "0987656790", "Ho Chi Minh"));
		listUsers.add(new User("13", "Le Van N", 2002, "0123456791", "Da Nang"));
		listUsers.add(new User("14", "Pham Thi O", 2003, "0987656791", "Hai Phong"));
		listUsers.add(new User("15", "Hoang Van P", 1994, "0123456792", "Can Tho"));
		listUsers.add(new User("16", "Do Thi Q", 1995, "0987656792", "Nha Trang"));
		listUsers.add(new User("17", "Ngo Van R", 1996, "0123456793", "Hue"));
		listUsers.add(new User("18", "Bui Thi S", 1997, "0987656793", "Vung Tau"));
		listUsers.add(new User("19", "Vu Van T", 1998, "0123456794", "Da Lat"));
		listUsers.add(new User("20", "Tran Thi U", 1999, "0987656794", "Quang Ninh"));
		listUsers.add(new User("21", "Nguyen Van V", 1990, "0123456795", "Ha Noi"));
		listUsers.add(new User("22", "Tran Thi W", 1991, "0987656795", "Ho Chi Minh"));
		listUsers.add(new User("23", "Le Van X", 1992, "0123456796", "Da Nang"));
		listUsers.add(new User("24", "Pham Thi Y", 1993, "0987656796", "Hai Phong"));
		listUsers.add(new User("25", "Hoang Van Z", 1994, "0123456797", "Can Tho"));
		listUsers.add(new User("26", "Do Thi AA", 1995, "0987656797", "Nha Trang"));
		listUsers.add(new User("27", "Ngo Van AB", 1996, "0123456798", "Hue"));
		listUsers.add(new User("28", "Bui Thi AC", 1997, "0987656798", "Vung Tau"));
		listUsers.add(new User("29", "Vu Van AD", 1998, "0123456799", "Da Lat"));
		listUsers.add(new User("30", "Tran Thi AE", 1999, "0987656799", "Quang Ninh"));

		listAccounts.add(new Account("1", "user1", "pass1", listUsers.get(0)));
		listAccounts.add(new Account("2", "user2", "pass2", listUsers.get(1)));
		listAccounts.add(new Account("3", "user3", "pass3", listUsers.get(2)));
		listAccounts.add(new Account("4", "user4", "pass4", listUsers.get(3)));
		listAccounts.add(new Account("5", "user5", "pass5", listUsers.get(4)));
		listAccounts.add(new Account("6", "user6", "pass6", listUsers.get(5)));
		listAccounts.add(new Account("7", "user7", "pass7", listUsers.get(6)));
		listAccounts.add(new Account("8", "user8", "pass8", listUsers.get(7)));
		listAccounts.add(new Account("9", "user9", "pass9", listUsers.get(8)));
		listAccounts.add(new Account("10", "user10", "pass10", listUsers.get(9)));
		listAccounts.add(new Account("11", "user11", "pass11", listUsers.get(10)));
		listAccounts.add(new Account("12", "user12", "pass12", listUsers.get(11)));
		listAccounts.add(new Account("13", "user13", "pass13", listUsers.get(12)));
		listAccounts.add(new Account("14", "user14", "pass14", listUsers.get(13)));
		listAccounts.add(new Account("15", "user15", "pass15", listUsers.get(14)));
		listAccounts.add(new Account("16", "user16", "pass16", listUsers.get(15)));
		listAccounts.add(new Account("17", "user17", "pass17", listUsers.get(16)));
		listAccounts.add(new Account("18", "user18", "pass18", listUsers.get(17)));
		listAccounts.add(new Account("19", "user19", "pass19", listUsers.get(18)));
		listAccounts.add(new Account("20", "user20", "pass20", listUsers.get(19)));
		listAccounts.add(new Account("21", "user21", "pass21", listUsers.get(20)));
		listAccounts.add(new Account("22", "user22", "pass22", listUsers.get(21)));
		listAccounts.add(new Account("23", "user23", "pass23", listUsers.get(22)));
		listAccounts.add(new Account("24", "user24", "pass24", listUsers.get(23)));
		listAccounts.add(new Account("25", "user25", "pass25", listUsers.get(24)));
		listAccounts.add(new Account("26", "user26", "pass26", listUsers.get(25)));
		listAccounts.add(new Account("27", "user27", "pass27", listUsers.get(26)));
		listAccounts.add(new Account("28", "user28", "pass28", listUsers.get(27)));
		listAccounts.add(new Account("29", "user29", "pass29", listUsers.get(28)));
		listAccounts.add(new Account("30", "user30", "pass30", listUsers.get(29)));

		listBets.add(new Bet("1", "Đề", "73", 0, 100.0));
		listBets.add(new Bet("2", "Lô", "34", 15, 200.0));
		listBets.add(new Bet("3", "Lô", "45", 20, 150.0));
		listBets.add(new Bet("4", "Đề", "56", 0, 120.0));
		listBets.add(new Bet("5", "Lô", "57", 5, 300.0));
		listBets.add(new Bet("6", "Đề", "68", 0, 80.0));
		listBets.add(new Bet("7", "Đề", "78", 0, 220.0));
		listBets.add(new Bet("8", "Đề", "90", 0, 190.0));
		listBets.add(new Bet("9", "Lô", "91", 10, 210.0));
		listBets.add(new Bet("10", "Lô", "02", 20, 130.0));
		listBets.add(new Bet("11", "Đề", "11", 0, 140.0));
		listBets.add(new Bet("12", "Lô", "23", 25, 170.0));
		listBets.add(new Bet("13", "Lô", "34", 18, 160.0));
		listBets.add(new Bet("14", "Đề", "45", 0, 180.0));
		listBets.add(new Bet("15", "Lô", "46", 50, 250.0));
		listBets.add(new Bet("16", "Đề", "67", 0, 100.0));
		listBets.add(new Bet("17", "Đề", "89", 0, 240.0));
		listBets.add(new Bet("18", "Đề", "91", 0, 200.0));
		listBets.add(new Bet("19", "Lô", "13", 100, 220.0));
		listBets.add(new Bet("20", "Lô", "24", 20, 150.0));
		listBets.add(new Bet("21", "Đề", "13", 0, 190.0));
		listBets.add(new Bet("22", "Lô", "35", 70, 300.0));
		listBets.add(new Bet("23", "Lô", "46", 100, 170.0));
		listBets.add(new Bet("24", "Đề", "79", 0, 210.0));
		listBets.add(new Bet("25", "Lô", "67", 200, 260.0));
		listBets.add(new Bet("26", "Đề", "80", 0, 110.0));
		listBets.add(new Bet("27", "Đề", "92", 0, 230.0));
		listBets.add(new Bet("28", "Đề", "94", 0, 180.0));
		listBets.add(new Bet("29", "Lô", "68", 5, 200.0));
		listBets.add(new Bet("30", "Lô", "79", 5, 150.0));

		listUserBets.add(new UserBet("1", listAccounts.get(0), listBets.get(0)));
		listUserBets.add(new UserBet("2", listAccounts.get(1), listBets.get(1)));
		listUserBets.add(new UserBet("3", listAccounts.get(2), listBets.get(2)));
		listUserBets.add(new UserBet("4", listAccounts.get(3), listBets.get(3)));
		listUserBets.add(new UserBet("5", listAccounts.get(4), listBets.get(4)));
		listUserBets.add(new UserBet("6", listAccounts.get(5), listBets.get(5)));
		listUserBets.add(new UserBet("7", listAccounts.get(6), listBets.get(6)));
		listUserBets.add(new UserBet("8", listAccounts.get(7), listBets.get(7)));
		listUserBets.add(new UserBet("9", listAccounts.get(8), listBets.get(8)));
		listUserBets.add(new UserBet("10", listAccounts.get(9), listBets.get(9)));
		listUserBets.add(new UserBet("11", listAccounts.get(10), listBets.get(10)));
		listUserBets.add(new UserBet("12", listAccounts.get(11), listBets.get(11)));
		listUserBets.add(new UserBet("13", listAccounts.get(12), listBets.get(12)));
		listUserBets.add(new UserBet("14", listAccounts.get(13), listBets.get(13)));
		listUserBets.add(new UserBet("15", listAccounts.get(14), listBets.get(14)));
		listUserBets.add(new UserBet("16", listAccounts.get(15), listBets.get(15)));
		listUserBets.add(new UserBet("17", listAccounts.get(16), listBets.get(16)));
		listUserBets.add(new UserBet("18", listAccounts.get(17), listBets.get(17)));
		listUserBets.add(new UserBet("19", listAccounts.get(18), listBets.get(18)));
		listUserBets.add(new UserBet("20", listAccounts.get(19), listBets.get(19)));
		listUserBets.add(new UserBet("21", listAccounts.get(20), listBets.get(20)));
		listUserBets.add(new UserBet("22", listAccounts.get(21), listBets.get(21)));
		listUserBets.add(new UserBet("23", listAccounts.get(22), listBets.get(22)));
		listUserBets.add(new UserBet("24", listAccounts.get(23), listBets.get(23)));
		listUserBets.add(new UserBet("25", listAccounts.get(24), listBets.get(24)));
		listUserBets.add(new UserBet("26", listAccounts.get(25), listBets.get(25)));
		listUserBets.add(new UserBet("27", listAccounts.get(26), listBets.get(26)));
		listUserBets.add(new UserBet("28", listAccounts.get(27), listBets.get(27)));
		listUserBets.add(new UserBet("29", listAccounts.get(28), listBets.get(28)));
		listUserBets.add(new UserBet("30", listAccounts.get(29), listBets.get(29)));

	}

	public static void menuLogin() {
		System.out.println("-----------------------------------------");
		System.out.println("1: Đăng nhập");
		System.out.println("2: Tạo tài khoản");
		System.out.println("3: Xem Quay số");
		System.out.println("4: Xem danh sách người trúng đề");
		System.out.println("5: Xem danh sách người trúng lô");
		System.out.println("------------------------------------------");
		System.out.println("Mời bạn nhập vào lựa chọn");
	}

	public static void menuOptionLogin() {
		int selectValue = 0;
		do {
			menuLogin();
			selectValue = ScannerUtils.inputInt();
			switch (selectValue) {
			case 1: {
				login();
				break;
			}
			case 2: {
				createAccount();
				break;
			}
			case 3: {
				SpinNumber();
				break;
			}
			case 4: {
				if (listLoteryResult.isEmpty()) {
					System.out.println("Chưa quay số");
				} else {
					listDe();
				}
				break;
			}
			case 5 : {
				if (listLoteryResult.isEmpty()) {
					System.out.println("Chưa quay số");
				} else {
					listLo();
				}
				break;
			}
			default:
				System.out.println("Đã thoát thành công !");
			}
		} while (selectValue > 0 && selectValue < 6);
	}

	public static void main(String[] args) {
		fakeData();
		menuOptionLogin();
//		SpinNumber();
//		listDe();
//		listLo();

}
}