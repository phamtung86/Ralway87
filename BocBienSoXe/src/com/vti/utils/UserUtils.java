package com.vti.utils;

import java.util.ArrayList;

import com.vti.modal.User;

public class UserUtils {
	// Tìm user bằng ID
	public static User findUserFromID(String id,ArrayList<User> listUser) {
		User u = null;
		for (int i = 0; i < listUser.size(); i++) {
			if(id.equals(listUser.get(i).getID())) {
				u = new User(listUser.get(i).getID(), listUser.get(i).getName(), listUser.get(i).getYob(), listUser.get(i).getAddress(), listUser.get(i).getVehicle());
			}
		}
		return u;
	}
	// Check ID có thuộc user không
		public static boolean checkIDInUser(String id,ArrayList<User> listUser) {
			for (int i = 0; i < listUser.size(); i++) {
				if (id.equals(listUser.get(i).getID())) {
					return true;
				}
			}
			return false;
		}

}
