package ru.dfr8938.carmanager;

public class CarManager {
	
	public static void main(String[] args) {
		
		Color green = Color.GREEN;
		Color black = Color.BLACK;
		Color white = Color.WHITE;
		
		Car toyotaPrius = new PassengerCar(2008, 15000, green.getStrColor(), 1200, "Toyota Prius");
		Car renaultLaguna = new PassengerCar(2000, 9700, white.getStrColor(), 1600, "Renault Laguna");
		
		System.out.println(toyotaPrius.toString());
		System.out.println(renaultLaguna.toString());
		
		Car toyotaPrius2 = new PassengerCar(2008, 15000, black.getStrColor(), 1200, "Toyota Prius");
		Car toyotaPrius3 = new PassengerCar(2008, 15000, green.getStrColor(), 1200, "Toyota Prius");
		
		boolean equals;
		equals = toyotaPrius.equals(toyotaPrius2);
		System.out.println(equals);
		
		equals= toyotaPrius.equals(toyotaPrius3);
		System.out.println(equals);
		
		toyotaPrius.addDistance(1205);
		System.out.println(toyotaPrius);
		
		toyotaPrius.addDistance(1205);
		System.out.println(toyotaPrius);
		
		toyotaPrius.addDistance(1200);
		System.out.println(toyotaPrius);
		
		toyotaPrius.addDistance(20.45);
		System.out.println(toyotaPrius);
		
		Car mercedesBenzSprinter = new Bus(2006, 50000, black.getStrColor(), 5000, "Mercedes Benz-Sprinter");
		mercedesBenzSprinter.addDistance(2300);
		System.out.println(mercedesBenzSprinter);
		
		System.out.println(mercedesBenzSprinter.isReadyToService());
		
		mercedesBenzSprinter.addDistance(100000);
		System.out.println(mercedesBenzSprinter.isReadyToService());
		
		mercedesBenzSprinter.service();
		System.out.println(mercedesBenzSprinter.isReadyToService());
		System.out.println(mercedesBenzSprinter);
		
		mercedesBenzSprinter.addDistance(40000);
		System.out.println(mercedesBenzSprinter);
		System.out.println(mercedesBenzSprinter.isReadyToService());
	}
}
