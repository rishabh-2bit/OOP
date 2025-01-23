package DesignPatterns.Template;

public abstract  class DocumentGenerator {

    public final void generateDocument() {
        openDocument();
        writeContent();
        saveDocument();
        closeDocument();
    }

    // Common methods with default implementation
    protected void openDocument() {
        System.out.println("Opening the document...");
    }

    protected void saveDocument() {
        System.out.println("Saving the document...");
    }

    protected void closeDocument() {
        System.out.println("Closing the document...");
    }

    // Abstract method to be implemented by subclasses
    protected abstract void writeContent();
    
}
