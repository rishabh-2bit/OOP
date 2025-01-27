package DesignPatterns.Behavioral.Visitor;

public class Image implements DocumentElement {

	@Override
	public void accept(DocumentVisitor visitor) {
		 visitor.visit(this);
	}

}
