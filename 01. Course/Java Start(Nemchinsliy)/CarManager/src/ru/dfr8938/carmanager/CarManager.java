package ru.dfr8938.carmanager;

public class CarManager {
	
	public static void main(String[] args) {
		
		Color green = Color.GREEN;
		Color white = Color.WHITE;
		
		Car toyotaPrius = new Car(2008, 15000, green.getStrColor(), 1200, "Toyota Prius");
		Car renaultLaguna = new Car(2000, 9700, white.getStrColor(), 1600, "Renault Laguna");
		
		System.out.println(toyotaPrius.toString());
		System.out.println(renaultLaguna.toString());
		
	}
}
