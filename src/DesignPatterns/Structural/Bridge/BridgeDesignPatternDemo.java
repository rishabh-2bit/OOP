package DesignPatterns.Structural.Bridge;

public class BridgeDesignPatternDemo {

	public static void main(String[] args) {
		
		Device tv = new TV();
        RemoteControl tvRemote = new RemoteControl(tv);

        System.out.println("Using the TV Remote:");
        tvRemote.togglePower();
        tvRemote.setVolume(15);
        tvRemote.togglePower();

        System.out.println();

        // Create a Radio device and an AdvancedRemoteControl for it
        Device radio = new Radio();
        AdvanceRemoteControl radioRemote = new AdvanceRemoteControl(radio);

        System.out.println("Using the Radio Advanced Remote:");
        radioRemote.togglePower();
        radioRemote.setVolume(8);
        radioRemote.mute();

	}

}
