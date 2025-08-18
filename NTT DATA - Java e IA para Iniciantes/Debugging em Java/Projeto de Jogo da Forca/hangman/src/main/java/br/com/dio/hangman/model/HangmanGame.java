package br.com.dio.hangman.model;

import java.util.List;

public class HangmanGame {

    private String hangman;

    public HangmanGame(final List<HangmanChar> characters) {
        var whiteSpace = " ".repeat(characters.size());
        var characterSpace = "-".repeat(characters.size());
    }

    @Override
    public String toString() {
        return "HangmanGame{}";
    }

    private void buildHangmanDesign(final String whiteSpaces, final String characterSpaces){
         hangman = "  -----  " + whiteSpaces + System.lineSeparator() +
                   "  |   |  " + whiteSpaces + System.lineSeparator() +
                   "  |   |  " + whiteSpaces + System.lineSeparator() +
                   "  |      " + whiteSpaces + System.lineSeparator() +
                   "  |      " + whiteSpaces + System.lineSeparator() +
                   "  |      " + whiteSpaces + System.lineSeparator() +
                   "  |      " + whiteSpaces + System.lineSeparator() +
                   "=========" + whiteSpaces + System.lineSeparator();




    }
}
