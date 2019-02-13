package pl.eduweb.ch28_ships_with_exceptions;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void shouldAddSubmarine() throws Exception {
        //arrange
        Board board = new Board();
        //act
        board.addShip(0, 0, new Submarine());
        //assert
        assertEquals(1, board.getShipsCount());
    }

    //assert
    @Test(expected = IllegalMoveException.class)
    public void shouldFailToAddOutsideX() throws Exception {
        //arrange
        Board board = new Board();
        //act
        board.addShip(-1, 0, new Submarine());

    }

    @Test(expected = IllegalMoveException.class)
    public void shouldFailToAddOutsideY() throws Exception {
        //arrange
        Board board = new Board();
        //act
        board.addShip(0, 11, new Submarine());
    }
}
