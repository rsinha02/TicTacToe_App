import java.util.LinkedList;
import java.util.List;

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


	public Integer[] possibleMoves() 
	{
		List<Integer> list=new LinkedList<Integer>();
		for(int i=0; i<board.length;i++) {
			if(board[i]== ' ') {
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

}