package com.vti.utils;

import java.util.ArrayList;

import com.vti.entity.User;

public class UserUltils {
	// Generate ID
	public static int generateIdUser(ArrayList<User> listUsers) {
		return listUsers.size() + 1;
	}
}
