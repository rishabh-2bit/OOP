package DesignPatterns.Singleton;

public class StaticBlockSingleton {
    // Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java Virtual Machine.
    // Hashcode will be same for every instnce you will request
    // Singleton class  provides a global access point to get the instance of the class.

    // Private constructor to restrict instantiation of the class from other classes.
    // Private static variable of the same class that is the only instance of the class.
    // Public static method that returns the instance of the class.

    // Easy to implement, thread-safe.
    // Instance is created still when not used
    
    private static StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton(){}

    static {
        try{
            INSTANCE = new StaticBlockSingleton();
        } catch(Exception e) {
        }
    }

    public static StaticBlockSingleton getInstace(){
        return INSTANCE;
    }
    
}
