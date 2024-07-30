package com.vti.entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class LotertResult {
	private ArrayList<String> listSpecialPrize;
	private ArrayList<String> listFirstPrize;
	private ArrayList<String> listSecondPrize;
	private ArrayList<String> listThirdPrize;
	private ArrayList<String> listFourthPrize;
	private ArrayList<String> listFifthPrize;
	private ArrayList<String> listSixthPrize;
	private ArrayList<String> listSeventhPrize;
	private LocalDate spinDay;
	public LotertResult(ArrayList<String> listSpecialPrize, ArrayList<String> listFirstPrize, ArrayList<String> listSecondPrize,
			ArrayList<String> listThirdPrize, ArrayList<String> listFourthPrize, ArrayList<String> listFifthPrize,
			ArrayList<String> listSixthPrize, ArrayList<String> listSeventhPrize) {
		super();
		this.listSpecialPrize = listSpecialPrize;
		this.listFirstPrize = listFirstPrize;
		this.listSecondPrize = listSecondPrize;
		this.listThirdPrize = listThirdPrize;
		this.listFourthPrize = listFourthPrize;
		this.listFifthPrize = listFifthPrize;
		this.listSixthPrize = listSixthPrize;
		this.listSeventhPrize = listSeventhPrize;
		this.spinDay = LocalDate.now();
	}
	public ArrayList<String> getListSpecialPrize() {
		return listSpecialPrize;
	}
	public ArrayList<String> getListFirstPrize() {
		return listFirstPrize;
	}
	public ArrayList<String> getListSecondPrize() {
		return listSecondPrize;
	}
	public ArrayList<String> getListThirdPrize() {
		return listThirdPrize;
	}
	public ArrayList<String> getListFourthPrize() {
		return listFourthPrize;
	}
	public ArrayList<String> getListFifthPrize() {
		return listFifthPrize;
	}
	public ArrayList<String> getListSixthPrize() {
		return listSixthPrize;
	}
	public ArrayList<String> getListSeventhPrize() {
		return listSeventhPrize;
	}
	public LocalDate getSpinDay() {
		return spinDay;
	}
	public void toStringPeize (ArrayList<String> prize) {
		for (int i = 0; i < prize.size(); i++) {
			System.out.println(prize.get(i) + " ");
		}
		System.out.println();
	}
	@Override
	public String toString() {
		return "Giải đặc biệt: " + listSpecialPrize + "\nGiải 1: " + listFirstPrize+ "\nGiải 2: "
				+ listSecondPrize + "\nGiải 3: " + listThirdPrize + "\nGiải 4: " + listFourthPrize
				+ "\nGiải 5: " + listFifthPrize + "\nGiải 6: " + listSixthPrize + "\nGiải 7: "
				+ listSeventhPrize + "\nQuay ngày: " + spinDay +"\n";
	}
	
	
}
