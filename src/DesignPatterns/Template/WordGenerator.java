package DesignPatterns.Template;

public class WordGenerator extends DocumentGenerator{

    @Override
    protected void writeContent() {
        System.out.println("Writing Word document content...");
    }
    
}
