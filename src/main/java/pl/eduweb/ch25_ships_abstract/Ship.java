package pl.eduweb.ch25_ships_abstract;

public interface Ship {

    int getDecksCount();

    void hit();

    boolean isSunk();

    void setOnField(Field field, int deckNo);
}
