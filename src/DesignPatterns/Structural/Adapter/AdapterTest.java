package DesignPatterns.Structural.Adapter;

import java.util.Arrays;

public class AdapterTest {

    /*
     * The Adapter design pattern is a structural design pattern that allows two
     *  incompatible interfaces to work together. It acts as a bridge between
     *  an existing class (with a specific interface) and another interface expected by the client.
     * 
     * 
     * Key Features of Adapter Pattern
        Converts Incompatible Interfaces: Allows classes with incompatible interfaces to interact.
        Reusability: Promotes code reuse by enabling existing functionality to adapt to new requirements without modifying the existing code.
        Single Responsibility Principle: Separates the interface conversion logic into its own class.

     */

    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("vlc", "movie.vlc");
        audioPlayer.play("avi", "unsupported.avi");

        Arrays.asList(1,2);
    }
    
}
