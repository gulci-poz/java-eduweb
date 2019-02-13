package pl.eduweb.ch28_ships_with_exceptions;

public interface Ship {

    int getDecksCount();

    void hit();

    boolean isSunk();

    void setOnField(Field field, int deckNo);
}
