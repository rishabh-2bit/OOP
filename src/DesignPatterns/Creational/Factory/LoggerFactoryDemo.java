package DesignPatterns.Creational.Factory;

public class LoggerFactoryDemo {

    public static void main(String[] args) {
        LoggerFactory loggerFactory = new LoggerFactory();

        // Get a FileLogger and log a message
        Logger fileLogger = loggerFactory.getLogger("FILE");
        fileLogger.log("File logger message");

        // Get a ConsoleLogger and log a message
        Logger consoleLogger = loggerFactory.getLogger("CONSOLE");
        consoleLogger.log("Console logger message");
    }
    
}
