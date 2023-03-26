
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

	public TicTacToe(String string, char turn) 
	{
		this.board=string.toCharArray();
		this.turn='o';	
	}

	public TicTacToe()  
	{
		this.board=BOARD.toCharArray();
		this.turn= MARK;
	}

	public TicTacToe(char[] board, char turn) 
	{
		this.board = board;
		this.turn = turn;
	}

	public TicTacToe move(int idx)
	{
		char[] newBoard = board.clone();
		newBoard[idx] = turn;
		return new TicTacToe(newBoard, turn == 'x' ? 'o' : 'x');
	}

	public static void main(String[] args) 
	{
	}
}