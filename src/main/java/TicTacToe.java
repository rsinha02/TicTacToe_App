import java.util.LinkedList;
import java.util.List;

public class TicTacToe {

	private static final char CHAR = ' ';

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

	public TicTacToe(String string) {
		this.board = string.toCharArray();
		this.turn='o';
	}

	public TicTacToe move(int idx)
	{
		char[] newBoard = board.clone();
		newBoard[idx] = turn;
		return new TicTacToe(newBoard, turn == 'x' ? 'o' : 'x');
	}


	public Integer[] possibleMoves() 
	{
		List<Integer> list=new LinkedList<Integer>();
		for(int i=0; i<board.length;i++) {
			if(board[i]== CHAR) 
			{
			 list.add(i);
			}
		}
		Integer[] array= new Integer[list.size()];
		list.toArray(array);
		return array;
	}

	public static void main(String[] args) 
	{
	}

	public boolean win(char turn)
	{
		for(int i=0;i<dim;i++)
		{
			if(win_line(turn,i*dim, 1) || win_line(turn,i,dim)) {
				return true;
			}
		}
		if(win_line(turn,dim-1,dim-1) || win_line(turn,0,dim+1)) {
			return  true;
		}
		return false;
	}

	
	public boolean win_line(char turn, int start, int step) {
	     	
		  for(int i=0;i<dim;i++)
		   {
			if(board[start + step*i] != turn)
			{
				return false;
			}
		}
		return true;
	}
}