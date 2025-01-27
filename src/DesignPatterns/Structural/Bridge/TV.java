package DesignPatterns.Structural.Bridge;

public class TV implements Device {
	
	private boolean enabled = false;
	private int volume = 10;

	@Override
	public void turnOn() {
		enabled = true;
		System.out.println("TV is now ON");

	}

	@Override
	public void turnOff() {
		enabled = false;
		System.out.println("TV is now OFF");

	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("TV volume set to: " + volume);

	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

}
