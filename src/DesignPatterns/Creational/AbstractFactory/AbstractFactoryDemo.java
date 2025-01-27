package DesignPatterns.Creational.AbstractFactory;

public class AbstractFactoryDemo {

    /*
     * The Abstract Factory Design Pattern is a creational design pattern that provides an interface for creating
     * families of related or dependent objects without specifying their concrete classes. It is often referred to as
     * a "factory of factories" because it deals with multiple factory methods that are used to create related objects.

    Key Features of the Abstract Factory Pattern
        Encapsulation of Families of Objects: It creates a family of related objects without exposing the underlying logic.
        Loose Coupling: The client depends on abstract interfaces rather than concrete implementations.
        Extensibility: Adding new product families is easier without modifying existing client code.
    Real-World Analogy
        Imagine a furniture store that manufactures different styles of furniture, such as Modern and Victorian.
        Each style consists of multiple related items like Chair and Table. The Furniture Factory serves as the abstract factory, and the concrete factories produce objects specific to their style.

    Advantages
        Encapsulation of Families: Groups related products together, ensuring compatibility.
        Flexibility: Makes it easy to introduce new product families without modifying client code.
        Consistency: Ensures that objects in a family match (e.g., Light Button with Light Checkbox).
    Disadvantages
        Complexity: Adds an additional layer of abstraction, which may be unnecessary for simple systems.
        Extensibility Challenge: Adding a new product to all families requires changes in the abstract factory and all concrete factories.
    When to Use Abstract Factory Pattern
        When your system requires a set of related objects that must be used together.
        When you want to ensure that a family of objects is consistent.
        When the exact types of objects to be created need to be determined at runtime.
    Real-World Applications
        GUI Toolkits: Creating cross-platform UI components (e.g., Windows, macOS, Linux).
        Database Drivers: Providing consistent interfaces for different databases (e.g., MySQL, PostgreSQL).
        Themed Applications: Implementing consistent themes across an application.

     */

    public static void main(String[] args) {
        // Choose the theme dynamically (e.g., based on user preference)
        GUIFactory factory = new LightThemeFactory(); // Or new DarkThemeFactory();

        // Pass the factory to the application
        Application app = new Application(factory);
        app.renderUI();

        // Switch to Dark Theme
        System.out.println("\nSwitching to Dark Theme...");
        factory = new DarkThemeFactory();
        app = new Application(factory);
        app.renderUI();
    }
    
}
