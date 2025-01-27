package DesignPatterns.Behavioral.Visitor;

public interface DocumentElement {
	void accept(DocumentVisitor visitor);

}
