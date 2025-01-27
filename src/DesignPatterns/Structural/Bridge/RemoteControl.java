package DesignPatterns.Structural.Bridge;

public class RemoteControl {
	protected Device device;
	
	public RemoteControl(Device device) {
		this.device = device;
	}
	
	public void togglePower() {
		if(device.isEnabled()) {
			device.turnOff();
		} else {
			device.turnOn();
		}
	}
	
	public void setVolume(int volume) {
		device.setVolume(volume);
	}

}
