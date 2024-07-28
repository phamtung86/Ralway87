package com.vti.modal;

import java.util.Date;

public class Account {
	int accountId;
	String email;
	String userName;
	String fullName;
	Date createDate;
	public Account(int accountId, String email, String userName, String fullName, Date createDate) {
		super();
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + ", createDate=" + createDate + "]";
	}
	
	
}
