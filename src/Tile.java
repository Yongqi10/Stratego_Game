import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends StackPane{
		
		
		private NameOfPieces piece;
		
		
		public Tile() {
			Rectangle board = new Rectangle(70,70);
			board.setFill(null);
			board.setStroke(Color.BLACK);
			
			getChildren().addAll(board);
	

			
		}
		public boolean hasPiece() {
			return piece != null;
		}
		public NameOfPieces getPieces() {
			return piece;
		}
		public void setPiece(NameOfPieces p)
		{
			piece = p;
		}
		
	
	}
