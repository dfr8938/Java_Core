package ru.dfr8938.carmanager;

public abstract class AgriculturalCar implements Serviceable {
	
	private int yearOfProduction;
	private int price;
	private int weight;
	private int distance;
	protected int distanceOnService;
	private String color;
	private String name;
	
	public AgriculturalCar(int yearOfProduction, int price, int weight, String color, String name) {
	
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.distance = 0;
		this.distanceOnService = 0;
		this.color = color;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + distance;
		result = prime * result + distanceOnService;
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
		AgriculturalCar other = (AgriculturalCar) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (distance != other.distance)
			return false;
		if (distanceOnService != other.distanceOnService)
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

	@Override
	public String toString() {
		return "AgriculturalCar [yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight=" + weight
				+ ", distance=" + distance + ", distanceOnService=" + distanceOnService + ", color=" + color + ", name="
				+ name + "]";
	}
	
	public abstract boolean isReadyToService();

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getDistanceOnService() {
		return distanceOnService;
	};
	
	public void addDistance(int additionalDistance) {
		if(additionalDistance < 0) {
			this.distance = 0;
		} else {
			this.distance += additionalDistance;
		}
		this.distanceOnService += additionalDistance;
	};
	
	public void addDistance(double additionalDistance) {
		if(additionalDistance < 0) {
			this.distance = 0;
		} else {
			this.distance += additionalDistance;
		}
		this.distanceOnService += additionalDistance;
	};

}
