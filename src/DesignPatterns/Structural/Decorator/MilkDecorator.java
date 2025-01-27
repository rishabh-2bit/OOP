package DesignPatterns.Structural.Decorator;

//Add milk to the coffee
public class MilkDecorator extends CoffeeDecorator {
	
	public MilkDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return coffee.getDescription() + ", Milk";
	}

	@Override
	public double getCost() {
		return coffee.getCost() + 1.5; // milk cost 1.5
	}
	
	

}
