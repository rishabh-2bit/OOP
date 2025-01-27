package DesignPatterns.Structural.Bridge;

public class AdvanceRemoteControl extends RemoteControl {

	public AdvanceRemoteControl(Device device) {
		super(device);
	}
	
	public void mute() {
		System.out.println("Muting the ddevice");
		device.setVolume(0);
	}

}
