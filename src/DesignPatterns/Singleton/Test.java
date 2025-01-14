package DesignPatterns.Singleton;

import javax.security.auth.login.Configuration;

public class Test {

    //Examples of sigleton

     // Logger: Manages logging operations across a system.
    // Configuration Manager: Centralizes application settings and properties.
    // Cache Manager: Handles caching operations to improve performance.
    // Thread Pool: Manages thread creation and execution in concurrent programming.
    
    public static void main(String[] str){

        // Eager eg = Eager.getInstace();
        // System.out.println(eg.hashCode());
        // Eager eg0 = Eager.getInstace();
        // System.out.println(eg0.hashCode());

        LazySingleton eg = LazySingleton.getInstace();
        System.out.println(eg.hashCode());
        LazySingleton eg0 = LazySingleton.getInstace();
        System.out.println(eg0.hashCode());

    }
    
}
