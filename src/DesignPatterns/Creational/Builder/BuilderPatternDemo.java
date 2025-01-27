package DesignPatterns.Creational.Builder;

public class BuilderPatternDemo {

    /*
     * The Builder Design Pattern is a creational design pattern that provides a way to construct complex objects step by step.
     *  It separates the construction of a complex object from its representation so that the same construction process can create differentrepresentations.

        Key Features of the Builder Pattern
            Step-by-Step Construction: Constructs an object piece by piece in a controlled manner.
            Immutability: Once built, the object is usually immutable.
            Customizable Construction: Allows you to create different representations of the object with the same construction process.
            Readable Code: Often results in code that is easier to understand when creating complex objects with multiple optional parameters.

        Advantages
            Flexibility: Allows you to construct complex objects step by step.
            Readable Code: Construction logic is encapsulated in builders, improving code readability.
            Reusability: Builders can be reused for different configurations of the product.
            Encapsulation: The client does not need to know how the product is assembled.
        Disadvantages
            Complexity: Adds additional classes and code for the builder and director.
            Not Suitable for Simple Objects: Overhead is unnecessary for objects with few fields.
            When to Use the Builder Pattern
            When an object requires multiple configurations or steps to construct.
            When the construction logic is complex or involves many optional parameters.
            When you want to ensure an object is immutable after it is built.
        Real-World Examples
            Java StringBuilder Class: Used to construct strings efficiently by appending parts step by step.
            Document Builders: For creating documents in formats like PDF, Word, or HTML.
            Configuration Builders: For setting up configurations (e.g., database connections, server configurations).
     */

    public static void main(String[] args) {
        MealBuilder vegMealBuilder = new VegMealBuilder();
        MealDirector vegMealDirector = new MealDirector(vegMealBuilder);
        Meal vegMeal = vegMealDirector.constructMeal();
        System.out.println("Veg Meal: " + vegMeal);

        // Create a Non-Veg Meal
        MealBuilder nonVegMealBuilder = new NonVegMealBuilder();
        MealDirector nonVegMealDirector = new MealDirector(nonVegMealBuilder);
        Meal nonVegMeal = nonVegMealDirector.constructMeal();
        System.out.println("Non-Veg Meal: " + nonVegMeal);
    }
    
}
