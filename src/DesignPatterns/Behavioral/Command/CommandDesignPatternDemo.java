package DesignPatterns.Behavioral.Command;

public class CommandDesignPatternDemo {
	
	public static void main(String[] args) {
		Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();  // Light is on
        remote.pressUndo();    // Light is off

        remote.setCommand(lightOff);
        remote.pressButton();  // Light is off
        remote.pressUndo();    // Light is on
		
	}

}
