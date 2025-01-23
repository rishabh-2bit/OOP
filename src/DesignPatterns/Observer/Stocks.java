package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Stocks implements Subject{

    private String name;
    private double price;
    private final List<Observer> observers = new ArrayList<>();

    public Stocks(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
        
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(name, price);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        System.out.println("Stock price updated for " + name + ": " + price);
        notifyObservers();
    }
    
}
