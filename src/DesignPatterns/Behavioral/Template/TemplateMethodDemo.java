package DesignPatterns.Behavioral.Template;

public class TemplateMethodDemo {

    public static void main(String[] args) {
        DocumentGenerator pdfGenerator = new PdfGenerator();
        DocumentGenerator wordGenerator = new WordGenerator();

        System.out.println("Generating PDF Document:");
        pdfGenerator.generateDocument();

        System.out.println("\nGenerating Word Document:");
        wordGenerator.generateDocument();
    }
    
}
