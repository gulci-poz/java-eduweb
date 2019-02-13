package pl.eduweb.ch26_ships_tests;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BoardTest {

    @Test
    public void shouldAddSubmarine() throws Exception {
        //arrange
        Board board = new Board();
        //act
        boolean result = board.addShip(0, 0, new Submarine());
        //assert
        assertTrue(result);

    }

    @Test
    public void shouldFailToAddOutsideX() throws Exception {
        //arrange
        Board board = new Board();
        //act
        boolean result = board.addShip(-1, 0, new Submarine());
        //assert
        assertFalse(result);

    }

    @Test
    public void shouldFailToAddOutsideY() throws Exception {
        //arrange
        Board board = new Board();
        //act
        boolean result = board.addShip(0, 11, new Submarine());
        //assert
        assertFalse(result);

    }
}
