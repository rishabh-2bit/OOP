package DesignPatterns.Structural.Proxy;

public class RealImage implements Image {

	private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(); // Expensive operation
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }

}
