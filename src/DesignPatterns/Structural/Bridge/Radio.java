package DesignPatterns.Structural.Bridge;

public class Radio implements Device {

	private boolean enabled = false;
    private int volume = 5;

    @Override
    public void turnOn() {
        enabled = true;
        System.out.println("Radio is now ON");
    }

    @Override
    public void turnOff() {
        enabled = false;
        System.out.println("Radio is now OFF");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume set to: " + volume);
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

}
