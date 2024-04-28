package Assignment7.Q1;

import Assignment7.Q1.CharacterProperties;

public class Character {
    private char ch;
    private CharacterProperties properties;

    public Character(char ch, CharacterProperties properties) {
        this.ch = ch;
        this.properties = properties;
    }

    // Getters for character and properties
    public char getChar() {
        return ch;
    }

    public CharacterProperties getProperties() {
        return properties;
    }
}

