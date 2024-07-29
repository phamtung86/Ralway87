package com.vti.view;

import java.util.ArrayList;

import com.vti.modal.Vehicle;

public class VehicleView {
	public static void displayVehicle (ArrayList<Vehicle> listVehicle) {
		for (Vehicle vehicle : listVehicle) {
			System.out.println(vehicle.toString());
		}
	}
}
