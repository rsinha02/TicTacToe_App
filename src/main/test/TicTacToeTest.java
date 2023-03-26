import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest {

	private static final String X = " x       ";
	private static final char O = 'o';
	private static final char MARK = 'x';
	private static final String STRING = "         ";
	TicTacToe position= new TicTacToe();

	@Test
	public void testNewDisplayboard() throws Exception
	{
		assertEquals(STRING, position.toString());
		assertEquals(MARK, position.turn);
	}	


	@Test
	public void testMove() throws Exception 
	{
		TicTacToe position = new TicTacToe().move(1); 
		assertEquals(X, position.toString());
		assertEquals(O,position.turn);
	}

	  @Test
	  public void  testPossibleMoves() throws Exception {
		 TicTacToe position= new TicTacToe().move(0).move(1).move(2);
		 assertArrayEquals(new Integer[] {3,4,5,6,7,8}, position.possibleMoves());
	  }	 
	  
}