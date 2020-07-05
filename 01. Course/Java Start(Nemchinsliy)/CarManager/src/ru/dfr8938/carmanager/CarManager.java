package ru.dfr8938.carmanager;

public class CarManager {
	
	public static void main(String[] args) {
		
		Color green = Color.GREEN;
		Color black = Color.BLACK;
		Color white = Color.WHITE;
		
		Car toyotaPrius = new Car(2008, 15000, green.getStrColor(), 1200, "Toyota Prius");
		Car renaultLaguna = new Car(2000, 9700, white.getStrColor(), 1600, "Renault Laguna");
		
		System.out.println(toyotaPrius.toString());
		System.out.println(renaultLaguna.toString());
		
		Car toyotaPrius2 = new Car(2008, 15000, black.getStrColor(), 1200, "Toyota Prius");
		Car toyotaPrius3 = new Car(2008, 15000, green.getStrColor(), 1200, "Toyota Prius");
		
		boolean equals;
		equals = toyotaPrius.equals(toyotaPrius2);
		System.out.println(equals);
		
		equals= toyotaPrius.equals(toyotaPrius3);
		System.out.println(equals);
		
	}
}
