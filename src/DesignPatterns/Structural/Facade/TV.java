package DesignPatterns.Structural.Facade;

public class TV {
	
	public void turnOn() {
		System.out.println("TV is turned on");
	}
	
	public void setInputChannel(String channel) {
		System.out.println("TV input set to : "+ channel);
	}

}
