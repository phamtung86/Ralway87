package com.vti.modal;

public class Vehicle {
	private String id;
	private String type;
	private String brand;
	private String engineNumber;
	private String chassiNumber;
	private String color;
	private String modelCode;
	public Vehicle(String id, String type, String brand, String engineNumber, String chassiNumber, String color,
			String modelCode, String plate) {
		super();
		this.id = id;
		this.type = type;
		this.brand = brand;
		this.engineNumber = engineNumber;
		this.chassiNumber = chassiNumber;
		this.color = color;
		this.modelCode = modelCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getChassiNumber() {
		return chassiNumber;
	}
	public void setChassiNumber(String chassiNumber) {
		this.chassiNumber = chassiNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", type=" + type + ", brand=" + brand + ", engineNumber=" + engineNumber
				+ ", chassiNumber=" + chassiNumber + ", color=" + color + ", modelCode=" + modelCode + "]";
	}


	
	
}
