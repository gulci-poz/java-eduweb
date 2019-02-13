package pl.eduweb.ch29_ships_add_logic;

public interface Ship {

    int getDecksCount();

    void hit();

    boolean isSunk();

    void setOnField(Field field, int deckNo);
}
