package com.vti.entity;

import java.time.LocalDate;

public class UserBet {
	private String id;
	private Account acc;
	private Bet bet;
	private LocalDate dayBet;
	public UserBet(String id, Account acc, Bet bet) {
		super();
		this.id = id;
		this.acc = acc;
		this.bet = bet;
		this.dayBet = LocalDate.now();
	}
	public String getId() {
		return id;
	}
	public Account getAcc() {
		return acc;
	}
	public Bet getBet() {
		return bet;
	}
	public LocalDate getDayBet() {
		return dayBet;
	}
	@Override
	public String toString() {
		return "UserBet [id=" + id + ", acc=" + acc + ", bet=" + bet + ", dayBet=" + dayBet + "]";
	}
	
	
	
}
