package ru.dfr8938.carmanager;

public class CarManager {
	
	public static void main(String[] args) {
		
		Car toyotaPrius = new Car(2008, 15000, "green", 1200, "Toyota Prius");
		Car renaultLaguna = new Car(2000, 9700, "white", 1600, "Renault Laguna");
		
		System.out.println(toyotaPrius.toString());
		System.out.println(renaultLaguna.toString());
		
	}
}
