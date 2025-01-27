package DesignPatterns.Behavioral.Visitor;

public interface DocumentVisitor {
	void visit(Paragraph paragraph);
    void visit(Image image);
    void visit(Table table);

}
