package DesignPatterns.Structural.Facade;

public class HomeTheaterFacade {
	private TV tv;
    private SoundSystem soundSystem;
    private StreamingDevice streamingDevice;

   
    public HomeTheaterFacade(TV tv, SoundSystem soundSystem, StreamingDevice streamingDevice) {
		this.tv = tv;
		this.soundSystem = soundSystem;
		this.streamingDevice = streamingDevice;
	}

	public void watchMovie(String movie) {
        System.out.println("Preparing to watch movie...");
        tv.turnOn();
        tv.setInputChannel("HDMI 1");
        soundSystem.turnOn();
        soundSystem.setMode("Movie");
        streamingDevice.turnOn();
        streamingDevice.play(movie);
        System.out.println("Enjoy your movie!");
    }

    public void stopMovie() {
        System.out.println("Shutting down the home theater...");
        System.out.println("TV is turned OFF");
        System.out.println("Sound System is turned OFF");
        System.out.println("Streaming Device is turned OFF");
    }

}
