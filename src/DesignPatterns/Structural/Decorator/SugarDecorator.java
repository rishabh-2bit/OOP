package DesignPatterns.Structural.Decorator;

//add sugar to the coffee
public class SugarDecorator extends CoffeeDecorator {

	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return coffee.getDescription() + ", Sugar";
	}

	@Override
	public double getCost() {
		return coffee.getCost() + 1.0; // sugar cost 1.0
	}

}
