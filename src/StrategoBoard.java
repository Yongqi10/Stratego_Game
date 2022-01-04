
public class StrategoBoard extends Board{

	
	public StrategoBoard() {
		super();
	}
	
	public StrategoBoard(Pieces pi, int r , int c) {
		super(pi,r,c);
		
	}
	
	public void SetPieces(Pieces pi, int r , int c)
	{
		p[r][c] = pi;
		
	}
	
	public Pieces GetPieces(int r , int c) {
		
		return p[r][c];
	}
	public void SetPiecesOnBoard(NameOfPieces npi, int i , int j) {
		
		np[i][j] = npi; 
	}
	public NameOfPieces getPiecesOnBoard(int i , int j) {
		
		return np[i][j];
	}
	
}
