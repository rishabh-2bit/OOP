package DesignPatterns.Structural.Facade;

public class SoundSystem {
	
	public void turnOn() {
        System.out.println("Sound System is turned ON");
    }

    public void setMode(String mode) {
        System.out.println("Sound System set to: " + mode);
    }

}
