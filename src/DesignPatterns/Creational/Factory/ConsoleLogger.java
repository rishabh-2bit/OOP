package DesignPatterns.Creational.Factory;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Logging the console : "+ message);
    }

    
}
