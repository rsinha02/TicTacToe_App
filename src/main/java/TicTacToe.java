
public class TicTacToe {

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
		this.board="         ".toCharArray();
		this.turn= 'x';
	}

	public static void main(String[] args) 
	{


	}
}