package DesignPatterns.Template;

public class PdfGenerator extends DocumentGenerator{

    @Override
    protected void writeContent() {
        System.out.println("Writing PDF content...");
    }
    
}
