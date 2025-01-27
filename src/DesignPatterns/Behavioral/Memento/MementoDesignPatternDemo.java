package DesignPatterns.Behavioral.Memento;

public class MementoDesignPatternDemo {

	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // Typing some text
        editor.addText("Hello, ");
        caretaker.save(editor.save()); // Save state
        System.out.println("Text after typing: " + editor.getText());

        editor.addText("World!");
        caretaker.save(editor.save()); // Save state
        System.out.println("Text after typing: " + editor.getText());

        // Undo last change
        Memento previousState = caretaker.undo();
        if (previousState != null) {
            editor.restore(previousState);
            System.out.println("Text after undo: " + editor.getText());
        }

        // Undo another change
        previousState = caretaker.undo();
        if (previousState != null) {
            editor.restore(previousState);
            System.out.println("Text after undo: " + editor.getText());
        }

	}

}
