package pl.eduweb.ch28_ships_with_exceptions;

public class IllegalMoveException extends Exception {

    public IllegalMoveException(String message) {
        super(message);
    }
}
