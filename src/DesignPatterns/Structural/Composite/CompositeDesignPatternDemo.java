package DesignPatterns.Structural.Composite;

//client code
public class CompositeDesignPatternDemo {
	
	/*
	   The Composite Design Pattern is a structural design pattern that is used to compose objects into tree-like structures to represent part-whole hierarchies.
	   It lets clients treat individual objects and compositions of objects uniformly. This pattern is especially useful when dealing with hierarchies of objects,
	   such as file systems, organizational structures, or graphical user interfaces.

	Key Features of the Composite Pattern
		Part-Whole Hierarchy: Handles groups of objects and individual objects in a unified way.
		Tree Structure: Organizes objects into a tree structure where nodes can be leaves (individual objects) or composites (groups of objects).
		Recursive Composition: A composite object can contain other composite objects, enabling recursive structures.
		Client Transparency: Clients interact with the objects without needing to know whether they are dealing with an individual object or a composite.
		
	Real-World Analogy
		Consider a file system.
		A folder can contain files as well as other folders.
		Both files and folders have common operations like "open" or "get size".
		A folder is a composite because it can contain other components (files or folders), while a file is a leaf.
		
	Participants in the Composite Pattern
		Component:
			Declares the interface for objects in the composition.
			Defines default behaviors (if needed).
		Leaf:
			Represents the individual (non-divisible) objects in the composition.
			Implements the component interface.
		Composite:
			Represents a group of components (both individual and other composites).
			Implements the component interface and delegates tasks to child components.
		Client:
			Interacts with objects in the composition through the component interface.
	  
	   Advantages
			Unified Interface: Treats individual and composite objects uniformly.
			Flexibility: Easily extendable to add new types of components.
			Recursive Structure: Allows hierarchical structures like trees.
			Simplifies Client Code: The client does not need to know whether it is working with a composite or a leaf.
			
	   Disadvantages
			Overhead: Can introduce complexity if the structure is overly simple.
			Type-Safety: The client might need to handle type-checking when interacting with the structure (e.g., distinguishing between leaf and composite).
			When to Use the Composite Pattern
			When you need to represent part-whole hierarchies (e.g., file systems, organization charts).
			When you want to treat individual objects and groups of objects uniformly.
			When you need to create a tree structure where components can contain other components.
			
	   Real-World Applications
			File Systems: Folders and files in an operating system.
			Graphics Applications: Shapes (circles, rectangles) that can group into more complex shapes.
			Organization Structures: Employees and departments in a company hierarchy.
			GUI Frameworks: Widgets and containers in user interfaces.
	  
	 */
	
	
	
	public static void main(String[] args) {
		File file1 = new File("File1.txt", 10);
        File file2 = new File("File2.txt", 20);
        File file3 = new File("File3.txt", 30);

        // Create folders and add files to them
        Folder folder1 = new Folder("Folder1");
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        Folder folder2 = new Folder("Folder2");
        folder2.addComponent(file3);

        // Create the root folder and add other folders
        Folder rootFolder = new Folder("RootFolder");
        rootFolder.addComponent(folder1);
        rootFolder.addComponent(folder2);

        // Show details of the root folder
        rootFolder.showDetails();

        // Get the total size of the root folder
        System.out.println("Total size of RootFolder: " + rootFolder.getSize() + "KB");

	}

}
