package pl.eduweb.ch30_ships_and_battleship;

public interface Ship {

    int getDecksCount();

    void hit();

    boolean isSunk();

    void setOnField(Field field, int deckNo);

    WarShip.Orientation getOrientation();
}
