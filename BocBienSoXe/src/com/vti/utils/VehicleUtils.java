package com.vti.utils;

import java.util.ArrayList;

import com.vti.modal.User;
import com.vti.modal.Vehicle;

public class VehicleUtils {
	public static int findIndexFromID(String id,ArrayList<User> listUser) {
		for (int i = 0; i < listUser.size(); i++) {
			if (listUser.get(i).getID().equalsIgnoreCase(id)) {
				return i;
			}
		}
		return -1;
	}
	//Check là xe máy
		public static boolean isXeMay(String id,ArrayList<User> listUser) {
				if (listUser.get(findIndexFromID(id, listUser)).getVehicle().getType().equalsIgnoreCase("XE MAY")) {
					return true;
				}
		
			return false;
		}

		// Check ô tô
		public static boolean isOTo(String id,ArrayList<User> listUser) {
				if (listUser.get(findIndexFromID(id, listUser)).getVehicle().getType().equalsIgnoreCase("O TO")) {
					return true;
				}
			
			return false;
		}
		

		// Tìm phương tiện bằng ID User
		public static Vehicle findVehicleFromIdUser(String id,ArrayList<User> listUser) {
			Vehicle v = null;
			for (int i = 0; i < listUser.size(); i++) {
				if(id.equals(listUser.get(i).getID())) {
					v = listUser.get(i).getVehicle();
				}
			}
			return v;
		}
}
