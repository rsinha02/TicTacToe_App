import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
    
	@Test
    public void testWin() throws Exception   {
	 
      assertFalse(new TicTacToe().win('x'));
	  assertTrue(new TicTacToe("ooo         ").win('o'));
	  assertTrue(new TicTacToe("ooo         ").win('o'));
	  assertTrue(new TicTacToe("ooo         ").win('o'));
	  assertTrue(new TicTacToe("ooo         ").win('o'));
	  assertTrue(new TicTacToe("ooo         ").win('o'));
	  
	}
	      
	@Test
	public void testMinimax() throws Exception {
		
	 assertEquals(100, new TicTacToe("xxx         ").minimax());
	 assertEquals(-100,  new TicTacToe("ooo         ").minimax());
	 assertEquals(-100, new TicTacToe("ooo         ").minimax());
	 assertEquals(-100, new TicTacToe("ooo         ").minimax());
	 assertEquals(-100, new TicTacToe("ooo       'o'  ").minimax());
			
	 }
	  
	  @Test
	  public void testBestMove() throws Exception {
		 assertEquals( 0, new TicTacToe(" xx        ").bestMove());
		 assertEquals( 1 , new TicTacToe("o o        ",'o').bestMove());
		  
	  }
	  
}