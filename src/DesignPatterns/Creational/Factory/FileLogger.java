package DesignPatterns.Creational.Factory;

public class FileLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Logging the file : "+ message);
    }
    
    
}
