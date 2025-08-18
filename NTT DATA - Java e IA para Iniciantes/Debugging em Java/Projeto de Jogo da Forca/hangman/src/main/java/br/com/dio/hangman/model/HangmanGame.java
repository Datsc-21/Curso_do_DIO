package br.com.dio.hangman.model;

import java.util.List;

import static br.com.dio.hangman.model.HangmanGameStatus.PENDING;

public class HangmanGame {

    private String hangman;
    private HangmanGameStatus hangmanGameStatus;

    public HangmanGame(final List<HangmanChar> characters) {
        var whiteSpace = " ".repeat(characters.size());
        var characterSpace = "-".repeat(characters.size());
        this.hangmanGameStatus = PENDING;
        buildHangmanDesign(whiteSpace, characterSpace);
    }

    @Override
    public String toString() {
        return this.hangman;
    }

    private void buildHangmanDesign(final String whiteSpaces, final String characterSpaces){
         this.hangman = "  -----  " + whiteSpaces + System.lineSeparator() +
                   "  |   |  " + whiteSpaces + System.lineSeparator() +
                   "  |   |  " + whiteSpaces + System.lineSeparator() +
                   "  |      " + whiteSpaces + System.lineSeparator() +
                   "  |      " + whiteSpaces + System.lineSeparator() +
                   "  |      " + whiteSpaces + System.lineSeparator() +
                   "  |      " + whiteSpaces + System.lineSeparator() +
                   "=========" + whiteSpaces + System.lineSeparator();
         
    }
}
