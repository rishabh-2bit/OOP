package DesignPatterns.Behavioral.Visitor;

public class HtmlExportVisitor implements DocumentVisitor {

	@Override
	public void visit(Paragraph paragraph) {
		System.out.println("Exporting paragraph to HTML");

	}

	@Override
	public void visit(Image image) {
		System.out.println("Exporting image to HTML");

	}

	@Override
	public void visit(Table table) {
		System.out.println("Exporting table to HTML");

	}

}
