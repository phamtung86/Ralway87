package com.vti.view;

import com.vti.modal.Card;

public class CardView {
	public static void displayCardDetail(String plate, Card card) {
		System.out.println("Chuc mung ban da boc duoc bien");
		System.out.println(plate);
		System.out.println("******************THÔNG TIN********************");
		card.printData();
		System.out.println("***********************************************");
	}
}
