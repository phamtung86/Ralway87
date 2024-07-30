package com.vti.utils;

import java.util.ArrayList;

import com.vti.entity.Account;


public class AccountUtils {
	// Check trung username
	public static boolean checkSameUsername (String userName, ArrayList<Account> listAccounts) {
		for (int i = 0; i < listAccounts.size(); i++) {
			if(listAccounts.get(i).getUserName().equals(userName)) {
				return true;
			}
		}
		return false;
	}
	
	// Generate ID
	public static int generateIdAccount(ArrayList<Account> listAccount) {
		return listAccount.size() + 1;
	}
	
	// Lay account tu userName;
	
	public static Account getAccFromID (String userName, ArrayList<Account> listAccounts) {
		Account acc = null;
		for (int i = 0; i < listAccounts.size(); i++) {
			if(listAccounts.get(i).getUserName().equals(userName)) {
				acc = new Account(listAccounts.get(i).getId(), listAccounts.get(i).getUserName(), listAccounts.get(i).getPassWord(), listAccounts.get(i).getUser());
			}
		}
		return acc;
	}
	
	
}
