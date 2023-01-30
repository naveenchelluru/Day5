package com.zensar.travels;

public class VehicleLoanInsurance {

	public static void main(String[] args) {
		Vehicle car=new Vehicle("dfsd", "nuxcsdll", "4 wheeler", 55770);
		System.out.println(car.issueLoan());
		System.out.println(car.takeInsurance());
		
	}

}
