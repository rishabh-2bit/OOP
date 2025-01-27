package DesignPatterns.Structural.Composite;


//Define the component
public interface FileSystemComponent {
    void showDetails(); // Common operation for both files and folders
    int getSize();      // Get the size of the component
}