package com.vti.utils;

import java.util.ArrayList;
import com.vti.entity.UserBet;

public class UserBetUtils {
	// Generate ID
	public static int generateIdUser(ArrayList<UserBet> listUserBets) {
		return listUserBets.size() + 1;
	}
}
