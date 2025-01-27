package DesignPatterns.Structural.Composite;

//Files are leaf nodes.
public class File implements FileSystemComponent{
	
	private String name;
    private int size; // Size in KB

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name + ", Size: " + size + "KB");
    }

    @Override
    public int getSize() {
        return size;
    }

}
