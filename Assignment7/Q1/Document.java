package Assignment7.Q1;

// Document.java

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<Character> characters;

    public Document() {
        this.characters = new ArrayList<>();
    }

    // Add character to the document
    public void addCharacter(char ch, CharacterProperties properties) {
        characters.add(new Character(ch, properties));
    }

    // Save document to file
    public void saveToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Character character : characters) {
                writer.write(character.getChar() + " " + character.getProperties().getFont() + " " + character.getProperties().getColor() + " " + character.getProperties().getSize() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader("document.txt"))) {
            String line;
            System.out.println("Character   Font       Color  Size");
            System.out.println("---------------------------------");
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                System.out.printf("%-11s%-11s%-7s%d\n", parts[0], parts[1], parts[2], Integer.parseInt(parts[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

