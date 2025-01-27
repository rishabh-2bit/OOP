package DesignPatterns.Structural.Flyweight;

public class Circle implements Shape {
	private String color;
	
	public Circle(String color) {
		this.color = color;
	}

	@Override
	public void draw(String position) {
		System.out.println("Drawing a " + color + " circle at " + position);
	}

}
