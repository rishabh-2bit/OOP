package DesignPatterns.Singleton;

public class LazySingleton {
    // Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java Virtual Machine.
    // Hashcode will be same for every instnce you will request
    // Singleton class  provides a global access point to get the instance of the class.

    // Private constructor to restrict instantiation of the class from other classes.
    // Private static variable of the same class that is the only instance of the class.
    // Public static method that returns the instance of the class.

    // Lazy Initialisation
    // in Lazy, The instance is created only when it is requested.
    // Not thread-safe.
    private static LazySingleton INSTANCE;

    private LazySingleton(){}

    public static LazySingleton getInstace(){
        if(INSTANCE == null){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
    
}
