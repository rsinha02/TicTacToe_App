import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest {

	TicTacToe position= new TicTacToe();

	@Test
	public void testNewDisplayboard() throws Exception
	{
		assertEquals("         ", position.toString());
		assertEquals('x', position.turn);
	}	


}