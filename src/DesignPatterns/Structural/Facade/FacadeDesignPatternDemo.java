package DesignPatterns.Structural.Facade;

public class FacadeDesignPatternDemo {
	
	/*The Facade Design Pattern is a structural design pattern that provides a simplified interface to a larger and more complex subsystem.
	 *It hides the complexities of the system and exposes only what is necessary to the client.

	Key Features of the Facade Pattern
		Simplifies Usage: Provides a unified, easy-to-use interface to a complex subsystem.
		Encapsulation: Hides the complexity of subsystems and exposes only the functionality that is needed.
		Loosely Coupled: Reduces the dependency of the client on the subsystem.
	Real-World Analogy
		Imagine you go to a restaurant. You interact only with the waiter to place your order.
		The waiter acts as a facade and communicates with the kitchen, cashier, and other staff to fulfill your request.
		You don't need to know the internal processes of how the food is prepared or how payments are processed.
		
	Participants in the Facade Pattern
		Facade: A simplified interface to access the subsystem.
		Subsystems: The complex components or classes that perform the actual operations.
		Client: Uses the Facade to interact with the subsystem.
		
	Advantages
		Simplifies Client Interaction: Provides a single, easy-to-use interface.
		Loose Coupling: The client is decoupled from the complex subsystem.
		Improved Readability: The system is easier to understand and maintain.
		Encapsulation: Hides the implementation details of the subsystem.
		
	Disadvantages
		Reduced Flexibility: The facade restricts access to some subsystem functionalities.
		Extra Layer: Adds an additional layer, which may introduce slight overhead.
		When to Use the Facade Pattern
		When you want to provide a simplified interface to a complex subsystem.
		When you want to reduce dependencies between clients and subsystems.
		When you want to layer a system and ensure that higher-level components are independent of lower-level components.
		
	Real-World Applications
		Java's javax.faces.context.FacesContext: Provides a facade for managing web application requests in JavaServer Faces (JSF).
		Spring Framework: Spring's JdbcTemplate acts as a facade for simplifying database interactions.
		Logging Frameworks: Facades like SLF4J provide a unified API for various logging frameworks.
	
	*/
	
	public static void main(String[] args) {
		// Create subsystem components
        TV tv = new TV();
        SoundSystem soundSystem = new SoundSystem();
        StreamingDevice streamingDevice = new StreamingDevice();

        // Create the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, soundSystem, streamingDevice);

        // Use the facade to watch a movie
        homeTheater.watchMovie("Inception");

        System.out.println();

        // Use the facade to stop the movie
        homeTheater.stopMovie();
	}

}
