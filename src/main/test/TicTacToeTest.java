import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest {

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
		assertEquals(" x       ", position.toString());
		assertEquals('o',position.turn);
	}


}