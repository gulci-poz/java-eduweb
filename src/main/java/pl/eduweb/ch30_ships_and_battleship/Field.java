package pl.eduweb.ch30_ships_and_battleship;

public class Field {

    private final int x;
    private final int y;
    private State state;
    private Ship ship;

    public Field(int x, int y, State state) {
        this.x = x;
        this.y = y;
        this.state = state;

    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public char stateToChar() {
        char value;
        switch (state) {
            case EMPTY:
                value = ' ';
                break;

            case HIT:
                value = 'O';
                break;
            default:
                value = '?';

        }
        return value;

    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
