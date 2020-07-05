package ru.dfr8938.carmanager;

public class Car {
	
	private int yearOfProduction;
	private int price;
	private int weight;
	private int distance;
	private String color;
	private String name;
	
	public Car(int yearOfProduction, int price, String color, int weight, String name) {
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.color = color;
		this.weight = weight;
		this.distance = 0;
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
	
	public int getDistance() {
		return this.distance;
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
		return "Car [yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight=" + weight + ", distance="
				+ distance + ", color=" + color + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + distance;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + weight;
		result = prime * result + yearOfProduction;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (distance != other.distance)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (weight != other.weight)
			return false;
		if (yearOfProduction != other.yearOfProduction)
			return false;
		return true;
	}
	
	public void addDistance(int additionalDistance) {
		if(additionalDistance < 0) {
			this.distance = 0;
		} else {
			this.distance += additionalDistance;
		}
	}
	
	public void addDistance(double additionalDistance) {
		if(additionalDistance < 0) {
			this.distance = 0;
		} else {
			this.distance += additionalDistance;
		}
	}
	
}
