package ru.dfr8938.carmanager;

public class Combine extends AgriculturalCar {

	public Combine(int yearOfProduction, int price, int weight, String color, String name) {
		super(yearOfProduction, price, weight, color, name);
	}

	@Override
	public boolean isReadyToService() {
		if(distanceOnService > 200000) {
			return true;
		} else {
			return false;
		}
	}
	
}
