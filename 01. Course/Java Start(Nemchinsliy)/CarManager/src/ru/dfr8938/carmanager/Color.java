package ru.dfr8938.carmanager;

public enum Color {
	BLACK("black"),
	WHITE("white"),
	GREEN("green"),
	RED("red"),
	BLUE("blue"),
	ORANGE("orange");
	
	private String strColor;
	
	Color(String strColor) {
		this.strColor = strColor;
	}
	
	public String getStrColor() {
		return strColor;
	}
	
}
