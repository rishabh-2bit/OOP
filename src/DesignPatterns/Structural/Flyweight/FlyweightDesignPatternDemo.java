package DesignPatterns.Structural.Flyweight;

public class FlyweightDesignPatternDemo {
	
	/*
	 * The Flyweight Design Pattern is a structural design pattern that aims to reduce memory usage and improve performance by sharing as much data as possible
	 * with similar objects. Instead of creating multiple similar objects, the Flyweight pattern stores shared data in a central location and uses references
	 * to this data for individual instances.
	 * 
	 * 
	 * Key Features of the Flyweight Pattern
			Shared State: The pattern separates the object's state into:
			Intrinsic State: Shared data that does not change and can be reused across multiple objects.
			Extrinsic State: Data that is unique to each instance and must be supplied at runtime.
			Memory Optimization: Reduces memory usage by sharing objects instead of creating new ones.
			Object Pooling: Often used to implement object pooling mechanisms.
			Factory and Caching: Frequently paired with a factory class that manages the shared objects.
			
		Real-World Analogy
			Think of a text editor displaying large documents:
			Every character on the screen has the same intrinsic data (like the character's shape or font).
			The position of the character (extrinsic state) varies and is supplied dynamically. 
			Instead of creating a new object for each character, a Flyweight object is reused for characters of the same type.
			
		Participants in the Flyweight Pattern
			Flyweight Interface:
				Defines the operations that can be performed by flyweight objects.
				Usually uses intrinsic and extrinsic state.
			ConcreteFlyweight:
				Implements the Flyweight interface.
				Stores the intrinsic state that can be shared.
				UnsharedConcreteFlyweight (optional):
				Represents objects that cannot be shared.
			FlyweightFactory:
				Manages and provides access to shared Flyweight objects.
				Ensures that shared objects are reused instead of creating new instances.
			Client:
				Supplies the extrinsic state and interacts with Flyweight objects.
				
			Advantages
					Reduced Memory Usage:
						Sharing intrinsic state minimizes memory consumption.
						Particularly effective in applications with a large number of similar objects (e.g., GUIs, games, document editors).
					Performance Improvement:
						Less memory allocation reduces overhead and speeds up execution.
					Scalability:
						Handles large object sets efficiently.
						
			Disadvantages
					Complexity:
						Adding a Flyweight pattern introduces complexity in managing shared and unique states.
					Code Maintenance:
						Requires careful distinction between intrinsic and extrinsic states, which can complicate maintenance.
					Thread Safety:
						Shared objects must be handled carefully in multithreaded environments to avoid conflicts.
					Not Always Suitable:
						Ineffective if there is little or no opportunity to share states.
						
			When to Use the Flyweight Pattern
					When an application needs to manage a large number of similar objects efficiently.
					When shared objects can significantly reduce memory consumption.
					When objects can be split into intrinsic (shared) and extrinsic (unique) states.
			Examples:
					Text rendering (reusing character glyphs).
					Caching (e.g., icon sets in a UI).
					Game development (reusing sprites or graphical assets).
			Real-World Applications
					Text Editors:
						Sharing character glyphs in a document.
					Graphics Editors:
						Reusing graphical elements like shapes and colors.
					Game Development:
						Managing shared assets like textures, tiles, or sprites.
					Data Caching:
						Reducing memory usage in applications by caching frequently accessed data.



	 * 
	 * */

	public static void main(String[] args) {
		// Draw circles of different colors at various positions
        Shape redCircle = ShapeFactory.getCircle("Red");
        redCircle.draw("Position (10, 20)");

        Shape blueCircle = ShapeFactory.getCircle("Blue");
        blueCircle.draw("Position (30, 40)");

        Shape redCircleAgain = ShapeFactory.getCircle("Red");
        redCircleAgain.draw("Position (50, 60)");

        Shape blueCircleAgain = ShapeFactory.getCircle("Blue");
        blueCircleAgain.draw("Position (70, 80)");
	}

}



