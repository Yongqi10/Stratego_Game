public abstract class Board {
	
	protected final int Rows =10, Cols=10;
	protected Pieces[][] p = new Pieces[Rows][Cols];
	protected NameOfPieces[][] np = new NameOfPieces[10][10];
	public Board() {
		
	}
	public Board(Pieces pi, int r , int c) {
		p[r][c] = pi;
	}
	
	public abstract void SetPieces(Pieces p, int r ,int c);
	public abstract Pieces GetPieces(int r, int c);
	
	
}
