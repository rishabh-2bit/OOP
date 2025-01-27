package DesignPatterns.Structural.Decorator;

//add whipped cream to the coffee
public class WhippedCreamDecorator extends CoffeeDecorator {

	public WhippedCreamDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return coffee.getDescription() + ", Whipped Cream";
	}

	@Override
	public double getCost() {
		return coffee.getCost() + 2.5; // whipped cream cost 2.5
	}

}
