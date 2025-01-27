package DesignPatterns.Structural.Adapter;

//Adaptee class
public class VlcPlayer implements AdvanceMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
    
}
