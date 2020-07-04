package ru.dfr8938.carmanager;

public class Car {
	
	private int yearOfProduction;
	private int price;
	private int weight;
	private String color;
	private String name;
	
	public Car(int yearOfProduction, int price, String color, int weight, String name) {
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.color = color;
		this.weight = weight;
		this.name = name;
	}
}
