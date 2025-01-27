package DesignPatterns.Structural.Decorator;

//Base implementation of Decorator Coffee interface
public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.0; // Base cost of simple coffee
    }
}