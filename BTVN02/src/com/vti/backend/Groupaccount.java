package com.vti.backend;
import java.util.Date;

public class Groupaccount {
	Group group;
	Account account;
	Date joinDate;
	public Groupaccount(Group group, Account account, Date joinDate) {
		this.group = group;
		this.account = account;
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "Groupaccount [group=" + group.toString() + ", account=" + account.toString() + ", joinDate=" + joinDate + "]";
	}
	
}
