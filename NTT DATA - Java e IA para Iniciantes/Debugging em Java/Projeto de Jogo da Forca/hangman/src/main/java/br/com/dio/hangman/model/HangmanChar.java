package br.com.dio.hangman.model;

public class HangmanChar {

    private final char character;
    private boolean isVisible;
    private int position;

    public HangmanChar(final char character) {
        this.character = character;
        this.isVisible = false;
    }

    public HangmanChar(final char character, final int position) {
        this.character = character;
        this.position = position;
        this.isVisible = true;
    }

    public char getCharacter() {
        return character;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public boolean isInVisible() {
        return !isVisible;
    }

    public void enableVisibility() {
        isVisible = true;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(final int position) {
        this.position = position;
    }


}
