package DesignPatterns.Structural.Decorator;

public class DecoratorPatternDemo {
	
	/*
	 * The Decorator Design Pattern is a structural design pattern that allows behavior to be added to an individual object,
	 * dynamically, without affecting the behavior of other objects from the same class. It provides an alternative to subclassing for extending functionality.
	 * 
	 * Key Features of the Decorator Pattern
			Dynamically Add Behavior: Add or override functionality of objects at runtime.
			Flexible Alternative to Inheritance: Avoids creating a large number of subclasses by combining decorators.
			Open/Closed Principle: You can extend functionality without modifying the existing code.
			
	   Real-World Analogy
			Consider a coffee shop where you can order a basic coffee. Customers can add extras like milk, sugar, or whipped cream.
			Instead of creating separate classes for each coffee combination (e.g., "CoffeeWithMilk", "CoffeeWithMilkAndSugar"),
			you start with a basic coffee object and dynamically "decorate" it with extras.
			

	 * Advantages
			Dynamic Behavior: Add new functionality at runtime without modifying existing code.
			Flexibility: Combine multiple decorators to create unique behaviors.
			Open/Closed Principle: Extend functionality without altering existing code.
			Reusable Components: Decorators can be reused with different components.
	   Disadvantages
			Complexity: Too many decorators can make the system harder to understand and debug.
			Overhead: Increases the number of objects due to multiple layers of wrapping.
			When to Use the Decorator Pattern
			When you need to add responsibilities to objects dynamically and transparently.
			When subclassing would result in a large number of subclasses for every possible combination of behaviors.
			When extending an object's functionality without affecting other instances of the same class is essential.
	  Real-World Applications
			Java I/O Streams: Classes like BufferedReader, FileReader, and InputStream use decorators to add functionality.
			UI Frameworks: Wrapping components to add borders, scrollbars, or other visual features.
			Logging Libraries: Adding behavior to loggers dynamically, such as timestamping or filtering logs.
	 * 
	 * */

	public static void main(String[] args) {
		//simple coffee
		Coffee coffee = new SimpleCoffee();
		System.out.println(coffee.getDescription() + " => $" + coffee.getCost());
		//add milk
		coffee = new MilkDecorator(coffee);
		System.out.println(coffee.getDescription() + " => $" + coffee.getCost());
		//add sugar
		coffee = new SugarDecorator(coffee);
		System.out.println(coffee.getDescription() + " => $" + coffee.getCost());
		//add cream
		coffee = new WhippedCreamDecorator(coffee);
		System.out.println(coffee.getDescription() + " => $" + coffee.getCost());
	}

}
