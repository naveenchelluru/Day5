package com.zensar.travels;

public class Vehicle implements Loan,Insurance {
	private String vehicleNumber;

    private String modelName;

     private String vehicleType;
     private double price;
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		if(vehicleType.equals("4 wheeler")||vehicleType.equals("3 wheeler")||vehicleType.equals("2 wheeler")) {
			this.vehicleType = vehicleType;
		}
		else {
			this.vehicleType =" ";
		}
	}

	public Vehicle() {
		super();
	}

	public Vehicle(String vehicleNumber, String modelName, String vehicleType,double price) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.price=price;
		if(vehicleType.equals("4 wheeler")||vehicleType.equals("3 wheeler")||vehicleType.equals("2 wheeler")) {
			this.vehicleType = vehicleType;
		}
		else {
			this.vehicleType =" ";
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public double takeInsurance() {
		double amt=0;
		if(price<150000) {
			amt=3500;
		}
		else if(price>150000&& price<=300000) {
			amt=4000;
		}
		else if(price>300000){
			amt=5000;
		}
		return amt;
	}

	@Override
	public double issueLoan() {
		// TODO Auto-generated method stub
		double amt;
		if(vehicleType.equals("4 wheeler")) {
			amt=0.8*price;
		}
		else if(vehicleType.equals("3 wheeler")) {
			amt=0.75*price;
		}
		else if(vehicleType.equals("2 wheeler")) {
			amt=0.5*price;
		}
		else {
			amt=0;
		}
		return amt;
	}

}
