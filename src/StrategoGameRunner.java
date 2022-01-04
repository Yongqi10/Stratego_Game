
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class StrategoGameRunner extends Application implements Team{
	

	private StrategoBoard board = new StrategoBoard();
	private Group tileGroup = new Group();
	private Group pieceGroup = new Group();
	private Group AIGroup = new Group();
	private Blank b = new Blank();
	private Water w = new Water();
	private Player player = new Player();
	private ComputerPlayer ai = new ComputerPlayer();
	private int count  = -1;
	private Parent creatContent() {
		Pane bettlefield = new Pane();
		bettlefield.setPrefSize(730, 730);
		//use rectangle to print the grids
		bettlefield.getChildren().addAll(tileGroup, pieceGroup,AIGroup);
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
			 board.SetPieces(b, i, j);
			 board.SetPiecesOnBoard(null, i, j);
			}
		}
		
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				Tile tile= new Tile();
				tile.setTranslateX(j * 70);
				tile.setTranslateY(i * 70);
				tileGroup.getChildren().add(tile);
				/*
				 * add the pieces into the group for player and AI and set them on the grids
				 */
				NameOfPieces np = null;
				
				
				//Water
				if((i == 1 &&j == 5)||(i == 2 && j ==5)||(i == 1 && j ==4)||(i == 2 && j ==4)||(i == 7 && j ==5)||(i == 8 && j ==5)||(i == 7 && j ==4)||(i == 8 && j ==4)) {
					np = makePiece(i,j,playerTeam);
					np.SetName("Water");
					board.SetPieces(w, i, j);
					pieceGroup.getChildren().add(np);
					
					
				}
					
				else if (i == 1 && j ==9) {
					np = makePiece(i,j,playerTeam);
					np.SetName("Miner");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(player.getPieces("Miner"), i, j);
					pieceGroup.getChildren().add(np);
					
				}
				else if(i == 7 && j == 7) {
					np = makePiece(i,j,playerTeam);
					np.SetName("Major");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(player.getPieces("Major"), i, j);
					pieceGroup.getChildren().add(np);
					
				}
				else if(i == 4 && j == 9)
				{
					 np = makePiece(i,j,playerTeam);
					np.SetName("Flag");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(player.getPieces("Flag"), i, j);
					pieceGroup.getChildren().add(np);
					
				}
				else if(i == 0 && j == 7)
				{
					np =makePiece(i,j,playerTeam);
					np.SetName("Captain");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(player.getPieces("Captain"), i, j);
					pieceGroup.getChildren().add(np);
					
				}
				else if(i == 3 && j == 9 )
				{
					np = makePiece(i,j,playerTeam);
					np.SetName("Marshall");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(player.getPieces("Marshall"), i, j);
					pieceGroup.getChildren().add(np);
					
				}
				else if(i == 5 && j == 9)
				{
					 np = makePiece(i,j,playerTeam);
					np.SetName("Sergeant");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(player.getPieces("Sergeant"), i, j);
					pieceGroup.getChildren().add(np);
					
				}
				else if(i == 2 && j== 7)
				{
					 np = makePiece(i,j,playerTeam);
					np.SetName("Lieutenant");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(player.getPieces("Lieutenant"), i, j);
					pieceGroup.getChildren().add(np);
					
				}
				else if(i ==4 && j ==7) {
					np = makePiece(i,j,playerTeam);
					np.SetName("Colonel");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(player.getPieces("Colonel"), i, j);
					pieceGroup.getChildren().add(np);
					
					
				}
				else if(i ==9 && j ==7) {
					np = makePiece(i,j,playerTeam);
					np.SetName("General");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(player.getPieces("General"), i, j);
					pieceGroup.getChildren().add(np);
					
				}
				else if(i ==7 && j ==9) {
					np = makePiece(i,j,playerTeam);
					np.SetName("Scout");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(player.getPieces("Scout"), i, j);
					pieceGroup.getChildren().add(np);
					
					}
				////////////////////////////AI pieces///////////////////////////////////
				else if(i == 0 && j == 1) {
					np = makePiece(i,j,AITeam);
					np.SetName("General");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(ai.getPieces("General"), i, j);
					AIGroup.getChildren().add(np);
					count++;
				}
				else if (i ==1 && j == 1) {
					np = makePiece(i,j,AITeam);
					np.SetName("Captain");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(ai.getPieces("Captain"), i, j);
					AIGroup.getChildren().add(np);
					count++;
				}
				else if (i ==1 && j == 2) {
					np = makePiece(i,j,AITeam);
					np.SetName("Colonel");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(ai.getPieces("Colonel"), i, j);
					AIGroup.getChildren().add(np);
					count++;
				}
				else if (i ==2 && j == 2) {
					np = makePiece(i,j,AITeam);
					np.SetName("Flag");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(ai.getPieces("Flag"), i, j);
					AIGroup.getChildren().add(np);
					count++;
				}
				else if (i ==3 && j == 2) {
					np = makePiece(i,j,AITeam);
					np.SetName("Lieutenant");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(ai.getPieces("Lieutenant"), i, j);
					AIGroup.getChildren().add(np);
					count++;
				}
				else if (i ==3 && j == 3) {
					np = makePiece(i,j,AITeam);
					np.SetName("Major");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(ai.getPieces("Major"), i, j);
					AIGroup.getChildren().add(np);
					count++;
				}
				else if (i ==4 && j == 3) {
					np = makePiece(i,j,AITeam);
					np.SetName("Marshall");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(ai.getPieces("Marshall"), i, j);
					AIGroup.getChildren().add(np);
					count++;
				}
				else if (i ==5 && j == 3) {
					np = makePiece(i,j,AITeam);
					np.SetName("Miner");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(ai.getPieces("Miner"), i, j);
					AIGroup.getChildren().add(np);
					count++;
				}
				else if (i ==6 && j == 3) {
					np = makePiece(i,j,AITeam);
					np.SetName("Scout");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(ai.getPieces("Scout"), i, j);
					AIGroup.getChildren().add(np);
					count++;
				}
				else if (i ==6 && j == 2) {
					np = makePiece(i,j,AITeam);
					np.SetName("Sergeant");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(ai.getPieces("Sergeant"), i, j);
					AIGroup.getChildren().add(np);
					count++;
				}
				else if (i ==5 && j == 2) {
					np = makePiece(i,j,AITeam);
					np.SetName("Sergeant");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(ai.getPieces("Sergeant"), i, j);
					AIGroup.getChildren().add(np);
					count++;
				}
				else if (i ==7 && j == 2) {
					np = makePiece(i,j,AITeam);
					np.SetName("Sergeant");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(ai.getPieces("Sergeant"), i, j);
					AIGroup.getChildren().add(np);
					count++;
				}
				else if (i ==9 && j == 2) {
					np = makePiece(i,j,AITeam);
					np.SetName("Sergeant");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(ai.getPieces("Sergeant"), i, j);
					AIGroup.getChildren().add(np);
					count++;
				}
				else if (i ==8 && j == 2) {
					np = makePiece(i,j,AITeam);
					np.SetName("Sergeant");
					board.SetPiecesOnBoard(np, i, j);
					board.SetPieces(ai.getPieces("Sergeant"), i, j);
					AIGroup.getChildren().add(np);
					count++;
				}
				
			}
			
		}
		
		
		
		
		return bettlefield;
		
	}
	// change double to int 
	private int toBoard(double x) {
		return (int)(x + 70 /2)/70;
	}
	
	/*
	 * make pieces and player released the pieces it check the move and attack 
	 */
	
	private NameOfPieces makePiece(int x , int y,int team) {


		NameOfPieces p = new NameOfPieces(x,y,team);
		
	

		
		p.setOnMouseReleased(event->{
			//new position
			int newX = toBoard(p.getLayoutX());
			int newY = toBoard(p.getLayoutY());
			
			//old position
			int oldX = toBoard(p.getOldX());
			int oldY = toBoard(p.getOldY());
			
			Pieces check = new Pieces();
			check = board.GetPieces(newX,newY);
			
			if(check.equals(w))// check for water
			{
				p.abortMove();
			}else if(board.GetPieces(newX, newY).getTeam() ==playerTeam) //check for same team
			{
				p.abortMove();
			}
			else if((oldX+2) == newX||(oldX-2) == newX||(oldY+2) == newY|| (oldY-2) == newY) {
				
				p.abortMove();
				
			}else if(board.GetPieces(newX, newY).getTeam() == AITeam) {//attack when win
				//check if 
				if(board.GetPieces(newX, newY).getValue() > board.GetPieces(oldX, oldY).getValue()) {
					board.SetPieces(b, oldX, oldY);
					NameOfPieces targetPiece = board.getPiecesOnBoard(newX, newY);
					board.SetPieces(player.getPieces(p.GetText()), newX, newY);
					for(int i = 0; i < count; i++) {
						
						if(targetPiece == ((NameOfPieces) AIGroup.getChildren().get(i))) {
							board.SetPieces(b, oldX, oldY);
							board.SetPieces(player.getPieces(p.GetText()), newX, newY);
							AIGroup.getChildren().remove(0);
							p.move(newX, newY);
							}	
						}
							
					}//end check value
				else if(board.GetPieces(newX, newY).getValue() < board.GetPieces(oldX, oldY).getValue()) {
					board.SetPieces(b, oldX, oldY);
					pieceGroup.getChildren().remove(p);
					
				}
				
			}//end attack
				else //move
				{
					board.SetPieces(b, oldX, oldY);
					board.SetPieces(player.getPieces(p.GetText()), newX, newY);
					p.move(newX, newY);
				}
			
			//Ai move random
			
		//	boolean t = true;
		//	while(t)
		//	{
		//		int ranx = (int)(Math.random()*3);
		//		int rany = (int)(Math.random()*9);
				
		//		if(board.GetPieces(ranx, rany)!=null) {
					
					
			//		if(check.equals(w))// check for water
			//		{
			//			p.abortMove();
			//		}else if(board.GetPieces(ranx, mran).getTeam() ==AITeam) //check for same team
			//		{
			//			board.SetPieces(board.GetPieces(ranx, rany), ranx+1, rany+1);
			//		}
					
				//}
			//	}

		});
	
			
			
		return p;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Stratego Game");
		//Menu at top
		MenuBar menuBar = new MenuBar();
		
		Menu FileMenu = new Menu("File");
		MenuItem exit = new MenuItem("exit");
		//exit action
		exit.setOnAction(event->{
			primaryStage.close();
		});
		MenuItem Save = new MenuItem("Save");
		//save action
		Save.setOnAction(event->{});
		//add to the File Menu
		FileMenu.getItems().add(Save);
		FileMenu.getItems().add(exit);
		//add to the MenuBar
		menuBar.getMenus().add(FileMenu);
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(menuBar);
		
		//bettlefield
		borderPane.setCenter(creatContent());
		
		
		
		Scene scene = new Scene(borderPane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

		
	
	
}

