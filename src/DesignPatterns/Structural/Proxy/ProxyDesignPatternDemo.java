package DesignPatterns.Structural.Proxy;

public class ProxyDesignPatternDemo {
	
	/*
	 * The Proxy Design Pattern is a structural design pattern that provides a surrogate or placeholder for another object to control access to it.
	 * The proxy can act as an intermediary, managing resource access,
	 * providing additional functionality, or delaying expensive object creation until needed.
	 * 
	 *  Key Features of the Proxy Pattern
			Access Control: The proxy controls access to the real object, ensuring that only authorized clients can use it.
			Lazy Initialization: Expensive operations, such as creating or loading an object, can be deferred until they are truly required.
			Additional Functionality: Proxies can introduce extra functionality, such as logging, caching, or performance monitoring.
			Same Interface: The proxy and the real object implement the same interface, making them interchangeable.
			
		Types of Proxy
			Remote Proxy: Manages interaction between a client and a remote object (e.g., RMI in Java).
			Virtual Proxy: Creates expensive objects on demand and delays instantiation.
			Protection Proxy: Controls access based on permissions.
			Caching Proxy: Adds caching to reduce expensive operations.
			Smart Proxy: Provides additional behavior like logging, reference counting, or locking.
			
		Real-World Analogy
			Consider an ATM machine as a proxy for your bank account.
			The ATM (proxy) acts as an intermediary, handling requests to withdraw money, check balance, etc.
			It enforces security checks like PIN authentication and provides access to your account without directly exposing the bank's core systems.
			
		Participants in the Proxy Pattern
			Subject:
				Defines the common interface for the RealSubject and Proxy.
			RealSubject:
				The actual object that the proxy represents.
			Proxy:
				The intermediary that controls access to the RealSubject. It can add functionality such as access control, logging, or lazy initialization.
			Client:
				Interacts with the proxy as if it were the RealSubject.
				
				Advantages
					Controlled Access: Proxies add access control or restrict functionality for the RealSubject.
					Improved Performance: Expensive operations (e.g., loading or creation) are deferred until needed.
					Enhanced Functionality: Proxies can add extra features like caching, logging, or security checks without modifying the RealSubject.
					Encapsulation: The proxy encapsulates additional behavior and separates it from the RealSubject.
					
				Disadvantages
					Increased Complexity: Introduces additional layers, making the system more complex.
					Potential Overhead: May introduce latency due to proxy operations, especially if overused.
					
				When to Use the Proxy Pattern
					Expensive Object Initialization: When the real object is resource-intensive and not always needed (e.g., loading large files or database connections).
					Access Control: When you want to restrict or manage access to an object (e.g., authentication, security).
					Logging/Monitoring: When you need to log or monitor the operations performed on an object.
					Remote Access: When the real object resides in a different address space (e.g., distributed systems, RMI).
					
				Real-World Applications
					Virtual Proxies in UI Frameworks: Delaying the loading of images or data-heavy UI components.
					Security Proxies: Enforcing access control for secure operations.
					Database Connections: Managing connections to a database using a proxy.
					Smart Pointers in C++: Reference counting and automatic memory management.
					Remote Method Invocation (RMI) in Java: Provides a proxy for objects in remote systems.s
	 * 
	 * */

	public static void main(String[] args) {
		
		Image image = new ProxyImage("test_image.jpg");

        // Image will be loaded and displayed for the first time
        System.out.println("Displaying image for the first time:");
        image.display();

        // Image is already loaded, so it will just be displayed
        System.out.println("\nDisplaying image again:");
        image.display();

	}

}
