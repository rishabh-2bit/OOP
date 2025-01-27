package DesignPatterns.Creational.Factory;

public class LoggerFactory {

    public Logger getLogger(String loggerType){
        if(loggerType == null){
            return null;
        }
        if (loggerType.equalsIgnoreCase("FILE")) {
            return new FileLogger();
        } else if (loggerType.equalsIgnoreCase("CONSOLE")) {
            return new ConsoleLogger();
        }
        return null;
    }
    
}
