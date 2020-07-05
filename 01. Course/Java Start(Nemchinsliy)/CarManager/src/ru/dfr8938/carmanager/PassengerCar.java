package ru.dfr8938.carmanager;

public class PassengerCar extends Car {

	public PassengerCar(int yearOfProduction, int price, String color, int weight, String name) {
		super(yearOfProduction, price, color, weight, name);
		
	}

	@Override
	public boolean isReadyToService() {
		if(this.distanceOnService > 50000) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
