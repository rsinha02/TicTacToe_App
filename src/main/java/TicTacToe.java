
public class TicTacToe {

	private static final char MARK = 'x';

	private static final String BOARD = "         ";

	public char[] board;

	public char turn;

	public int dim=3;	


	@Override
	public String toString() 
	{
		return new String(board);
	}

	public TicTacToe()  
	{
		this.board=BOARD.toCharArray();
		this.turn= MARK;
	}

	public static void main(String[] args) 
	{


	}
}