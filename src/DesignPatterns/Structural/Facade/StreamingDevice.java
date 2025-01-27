package DesignPatterns.Structural.Facade;

public class StreamingDevice {
	
	public void turnOn() {
        System.out.println("Streaming Device is turned ON");
    }

    public void play(String content) {
        System.out.println("Playing: " + content);
    }
}
