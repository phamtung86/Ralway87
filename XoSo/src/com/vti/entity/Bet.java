package com.vti.entity;

public class Bet {
	private String id;
	private String type;
	private String numberBet;
	private int pointBet;
	private double priceBet;
	public Bet(String id, String type, String numberBet, int pointBet, double priceBet) {
		super();
		this.id = id;
		this.type = type;
		this.numberBet = numberBet;
		this.pointBet = pointBet;
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
	public int getPointBet() {
		return pointBet;
	}
	public double getPriceBet() {
		return priceBet;
	}
	@Override
	public String toString() {
		return "Bet [id=" + id + ", type=" + type + ", numberBet=" + numberBet + ", pointBet=" + pointBet
				+ ", priceBet=" + priceBet + "]";
	}
	
	
}
