package DesignPatterns.Creational.Prototype;

/*
 * The Prototype design pattern is a creational design pattern that enables cloning of objects,
 * allowing you to create new objects by copying an existing instance. 
 * This is useful when object creation is resource-intensive or when you need to
 * preserve the original state of an object while creating duplicates.

Key Features of the Prototype Pattern:
    Clone Objects: Instead of creating new objects from scratch, create a copy of an existing object.
    Avoid Subclassing: Helps avoid subclassing by allowing copies of objects with varied configurations.
    Efficient Object Creation: Reduces the overhead of creating objects using constructors, especially for expensive-to-create objects.
How It Works:
    Define a Prototype Interface: Includes a clone() method.
    Implement the Concrete Prototype: Provides the implementation of the cloning mechanism.
    Use Cloning: Clients create new objects by copying prototypes instead of instantiating them directly.


    Advantages
        Improved Performance: Cloning is faster than creating objects from scratch, especially for complex objects.
        Simplifies Object Creation: Eliminates the need for repetitive initialization logic.
        Runtime Flexibility: Can dynamically create objects without knowing their exact type.
    Disadvantages
        Complex Cloning: Deep copy logic can be complex, especially for objects with nested references.
        Memory Overhead: If not managed properly, cloning can lead to high memory usage.
    Real-World Applications
        Game Development: Creating clones of enemies, levels, or game objects.
        Document Editors: Copying templates for reports, invoices, etc.
        UI Frameworks: Cloning widgets or components with predefined properties.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        // Create an initial prototype
        Shape circle = new Shape("Circle", "Red");

        // Clone the prototype
        Shape clonedCircle = (Shape) circle.clone();
        clonedCircle.setColor("Blue"); // Modify the clone's properties

        // Print the objects
        System.out.println("Original Object: " + circle);
        System.out.println("Cloned Object: " + clonedCircle);

        Report invoiceTemplate = new Report("Invoice Template", "This is a template for invoices.");

        // Clone the template
        Report customInvoice = (Report) invoiceTemplate.clone();
        customInvoice.setTitle("Custom Invoice");
        customInvoice.setContent("This is a customized invoice.");

        // Print templates
        System.out.println("Base Template: " + invoiceTemplate);
        System.out.println("Custom Template: " + customInvoice);
    }
}