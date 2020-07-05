package ru.dfr8938.carmanager;

public class Bus extends Car {

	public Bus(int yearOfProduction, int price, String color, int weight, String name) {
		super(yearOfProduction, price, color, weight, name);
		
	}

	public boolean isReadyToService() {
		if(this.distanceOnService > 10000) {
			return true;
		} else {
			return false;
		}
	}

}
