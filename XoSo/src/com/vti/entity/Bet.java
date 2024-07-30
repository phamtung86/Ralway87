package com.vti.entity;

public class Bet {
	private String id;
	private String type;
	private String numberBet;
	private double priceBet;
	public Bet(String id, String type, String numberBet, double priceBet) {
		super();
		this.id = id;
		this.type = type;
		this.numberBet = numberBet;
		this.priceBet = priceBet;
	}
	public String getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	public String getNumberBet() {
		return numberBet;
	}
	public double getPriceBet() {
		return priceBet;
	}
	@Override
	public String toString() {
		return "Bet [id=" + id + ", type=" + type + ", numberBet=" + numberBet + ", priceBet=" + priceBet + "]";
	}
	
}
