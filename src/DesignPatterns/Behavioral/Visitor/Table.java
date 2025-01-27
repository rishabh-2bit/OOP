package DesignPatterns.Behavioral.Visitor;

public class Table implements DocumentElement {
	@Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }

}
