package com.vti.utils;

import java.util.ArrayList;

import com.vti.entity.Bet;

public class BetUltils {
	// Generate ID
	public static int generateIdBet(ArrayList<Bet> listBets) {
		return listBets.size() + 1;
	}
}
