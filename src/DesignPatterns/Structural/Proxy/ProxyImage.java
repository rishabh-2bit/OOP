package DesignPatterns.Structural.Proxy;

public class ProxyImage implements Image {

	private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            // Lazy initialization: Load the real image only when needed
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}
