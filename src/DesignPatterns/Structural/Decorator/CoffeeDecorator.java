package DesignPatterns.Structural.Decorator;

// this class wraps a Coffee object and implements Coffee interface
public abstract class CoffeeDecorator implements Coffee {
	 protected Coffee coffee; // Composition: reference to a Coffee object
	 
	 public CoffeeDecorator(Coffee coffee) {
		 this.coffee = coffee;
	 }

	@Override
	public String getDescription() {
		return coffee.getDescription();
	}

	@Override
	public double getCost() {
		return coffee.getCost();
	}

}
