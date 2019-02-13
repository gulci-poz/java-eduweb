package pl.eduweb.ch33_ships_random_board;

public interface Ship {

    int getDecksCount();

    void hit();

    boolean isSunk();

    void setOnField(Field field, int deckNo);

    WarShip.Orientation getOrientation();
}
