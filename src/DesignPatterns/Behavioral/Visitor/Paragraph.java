package DesignPatterns.Behavioral.Visitor;

public class Paragraph implements DocumentElement{

	@Override
	public void accept(DocumentVisitor visitor) {
		visitor.visit(this);
		
	}

}
