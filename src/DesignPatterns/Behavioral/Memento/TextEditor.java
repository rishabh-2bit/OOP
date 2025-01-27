package DesignPatterns.Behavioral.Memento;

public class TextEditor {
	private String text = "";

    public void addText(String newText) {
        text += newText;
    }

    public String getText() {
        return text;
    }

    // Create a memento to save the current state
    public Memento save() {
        return new Memento(text);
    }

    // Restore the state from a memento
    public void restore(Memento memento) {
        text = memento.getState();
    }

}
