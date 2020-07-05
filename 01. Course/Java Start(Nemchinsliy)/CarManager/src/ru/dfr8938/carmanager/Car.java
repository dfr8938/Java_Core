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
	
	// getters
	public int getYearOfProduction() {
		return this.yearOfProduction;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getName() {
		return this.name;
	}
	
	//setters
	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight=" + weight + ", color="
				+ color + ", name=" + name + "]";
	}
	
	
	
}
