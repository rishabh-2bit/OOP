package DesignPatterns.Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	
	private static final Map<String, Shape> shapes = new HashMap<>();
	
	public static Shape getCircle(String color) {
		Shape circle  =  shapes.get(color);
		if(circle == null) {
			circle = new Circle(color);
			shapes.put(color, circle);
			System.out.println("Creating a new circle of color: " + color);
		}
		return circle;
	}

}
