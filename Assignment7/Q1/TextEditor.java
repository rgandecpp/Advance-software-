package Assignment7.Q1;// TextEditor.java

public class TextEditor {
    public static void main(String[] args) {
        // Create a new Document object
        Document document = new Document();

        // Add characters with different properties
        document.addCharacter('H', new CharacterProperties("Arial", "Red", 12));
        document.addCharacter('e', new CharacterProperties("Arial", "Blue", 14));
        document.addCharacter('l', new CharacterProperties("Calibri", "Black", 16));
        document.addCharacter('l', new CharacterProperties("Calibri", "Black", 16));
        document.addCharacter('o', new CharacterProperties("Verdana", "Red", 12));
        document.addCharacter('W', new CharacterProperties("Arial", "Red", 12));
        document.addCharacter('o', new CharacterProperties("Arial", "Blue", 14));
        document.addCharacter('r', new CharacterProperties("Calibri", "Black", 16));
        document.addCharacter('l', new CharacterProperties("Calibri", "Black", 16));
        document.addCharacter('d', new CharacterProperties("Verdana", "Red", 12));
        document.addCharacter('C', new CharacterProperties("Arial", "Red", 12));
        document.addCharacter('S', new CharacterProperties("Arial", "Blue", 14));
        document.addCharacter('5', new CharacterProperties("Calibri", "Black", 16));
        document.addCharacter('8', new CharacterProperties("Calibri", "Black", 16));
        document.addCharacter('0', new CharacterProperties("Verdana", "Red", 12));
        document.addCharacter('0', new CharacterProperties("Verdana", "Red", 12));


        // Save document to file
        document.saveToFile("document.txt");
        System.out.println("Sucessfully saved the document");

        Document.loadFromFile("document.txt");
    }
}
