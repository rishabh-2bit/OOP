package DesignPatterns.Behavioral.Visitor;

public class ImageCountVisitor implements DocumentVisitor {

	private int imageCount = 0;

    @Override
    public void visit(Paragraph paragraph) {
        // Do nothing
    }

    @Override
    public void visit(Image image) {
        imageCount++;
    }

    @Override
    public void visit(Table table) {
        // Do nothing
    }

    public int getImageCount() {
        return imageCount;
    }

}
