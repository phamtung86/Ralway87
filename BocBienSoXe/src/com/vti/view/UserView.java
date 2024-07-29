package com.vti.view;

import java.util.ArrayList;

import com.vti.modal.User;

public class UserView {
	public static void displayUser (ArrayList<User> listUser) {
		for (User user : listUser) {
			System.out.println(user.toString());
		}
	}
}
