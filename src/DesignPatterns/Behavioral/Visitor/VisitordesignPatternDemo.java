package DesignPatterns.Behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitordesignPatternDemo {

	public static void main(String[] args) {
		List<DocumentElement> document = new ArrayList<>();
        document.add(new Paragraph());
        document.add(new Image());
        document.add(new Table());
        document.add(new Image());

        HtmlExportVisitor htmlExportVisitor = new HtmlExportVisitor();
        ImageCountVisitor imageCountVisitor = new ImageCountVisitor();

        for (DocumentElement element : document) {
            element.accept(htmlExportVisitor);
            element.accept(imageCountVisitor);
        }

        System.out.println("Number of images: " + imageCountVisitor.getImageCount());

	}

}
