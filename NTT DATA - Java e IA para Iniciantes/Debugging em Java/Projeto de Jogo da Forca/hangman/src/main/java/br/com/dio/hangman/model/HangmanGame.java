package br.com.dio.hangman.model;

import java.util.ArrayList;
import java.util.List;

import static br.com.dio.hangman.model.HangmanGameStatus.PENDING;

public class HangmanGame {

    private final static int HANGMAN_INITIAL_LINE_LENGTH = 9;
    private final static int HANGMAN_INITIAL_LINE_LENGTH_WITH_LINE_SEPARATOR = 10;

    private final int lineSize;
    private final List<HangmanChar> hangmanPaths;
    private final List<HangmanChar> characters;

    private String hangman;
    private HangmanGameStatus hangmanGameStatus;

    public HangmanGame(final List<HangmanChar> characters) {
        var whiteSpace = " ".repeat(characters.size());
        var characterSpace = "-".repeat(characters.size());
        this.lineSize = HANGMAN_INITIAL_LINE_LENGTH_WITH_LINE_SEPARATOR + whiteSpace.length();
        this.hangmanGameStatus = PENDING;
        buildHangmanDesign(whiteSpace, characterSpace);
        this.characters = setCharacterSpacesPositionInGame(characters, whiteSpace.length());
    }

    @Override
    public String toString() {
        return this.hangman;
    }

    private List<HangmanChar> buildHangmanPathsPositions(){
        final var HEAD_LINE = 3;
        final var BODY_LINE = 4;
        final var LEGS_LINE = 5;
        return new ArrayList<>(
               List.of(
                       new HangmanChar('0', this.lineSize * HEAD_LINE + 6),
                       new HangmanChar('|', this.lineSize * BODY_LINE + 6),
                       new HangmanChar('/', this.lineSize * BODY_LINE + 5),
                       new HangmanChar('\\', this.lineSize * BODY_LINE + 7),
                       new HangmanChar('/', this.lineSize * LEGS_LINE + 5),
                       new HangmanChar('\\', this.lineSize * LEGS_LINE + 7)

               )
        );
    }

    private List<HangmanChar> setCharacterSpacesPositionInGame(final List<HangmanChar> characters, final int whiteSpacesAmount){
          final var LINE_LETTER = 6;
          for(int i = 0; i < characters.size(); i++){
              characters.get(i).setPosition(this.lineSize * LINE_LETTER + HANGMAN_INITIAL_LINE_LENGTH + i);
          }
          return characters;

    }

    private void buildHangmanDesign(final String whiteSpaces, final String characterSpaces){
         this.hangman = "  -----  " + whiteSpaces + System.lineSeparator() +
                        "  |   |  " + whiteSpaces + System.lineSeparator() +
                        "  |   |  " + whiteSpaces + System.lineSeparator() +
                        "  |      " + whiteSpaces + System.lineSeparator() +
                        "  |      " + whiteSpaces + System.lineSeparator() +
                        "  |      " + whiteSpaces + System.lineSeparator() +
                        "  |      " + whiteSpaces + System.lineSeparator() +
                        "=========" + characterSpaces + System.lineSeparator();

    }
}
