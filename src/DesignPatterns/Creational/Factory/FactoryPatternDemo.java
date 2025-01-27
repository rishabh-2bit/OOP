package DesignPatterns.Creational.Factory;

public class FactoryPatternDemo {

    /*
     * The Factory Design Pattern is a creational design pattern that provides an interface or method for creating objects in a superclass,
     * but allows subclasses to alter the type of objects that will be created.
     * It abstracts the instantiation process and makes the code more maintainable and scalable.

    Key Features of Factory Design Pattern
        Encapsulation of Object Creation: Centralizes object creation logic in a factory class or method.
        Loose Coupling: Clients only depend on an interface or abstract class, not on concrete classes.
        Scalability: Adding new types of objects becomes easier without modifying existing code.
    Real-World Analogy
        Consider a car manufacturing company that produces various types of cars: SUVs, Sedans, and Hatchbacks.
        Instead of each department directly creating cars, there’s a Car Factory that takes a request for the type of car and produces it.

    Implementation Steps
        Define a Common Interface or Abstract Class: Represent the product that the factory will create.
        mplement Concrete Classes: Define different implementations of the interface or abstract class.
        Create a Factory Class: Encapsulate the logic of object creation.
        Use the Factory: Clients use the factory to create objects without directly instantiating concrete classes.

     */

     /*
      * Advantages
            Encapsulation: Object creation logic is centralized in one place.
            Loose Coupling: The client code depends only on the interface, not the concrete implementations.
            Scalability: Adding new product types is straightforward without modifying client code.
            Abstraction: The client doesn't need to know how objects are created or instantiated.
        Disadvantages
            Complexity: Introduces an additional layer, which may increase the complexity for small applications.
            Limited Flexibility: The factory might need modification if there are significant changes to object creation logic.
        When to Use Factory Pattern
            When the exact type of object required is determined at runtime.
            When you want to centralize and abstract object creation logic.
            When creating objects directly involves complex logic that should be hidden from the client.
      */

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get a Circle and call its draw method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get a Rectangle and call its draw method
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        // Get a Square and call its draw method
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        // Get a Square and call its draw method
        Shape shape4 = shapeFactory.getShape("TRIANGLE");
        shape4.draw();
    }
    
}
