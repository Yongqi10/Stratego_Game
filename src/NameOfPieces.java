import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class NameOfPieces extends StackPane{
	
	
	
	private double mouseX, mouseY;
    private double oldX, oldY;
    private Text text = new Text();
	public NameOfPieces(int x, int y,int t)
	{
		move(x,y);
		
		Rectangle r = new Rectangle(40,40);
		r.setFill(null);
		r.setStroke(Color.BLACK);
		
		if(t == 1) {
			
			setOnMousePressed(e -> {
	            mouseX = e.getSceneX();
	            mouseY = e.getSceneY();
	        });

	      setOnMouseDragged(e -> {//pick the pieces
	        if(text.getText().equals("Water"))
	        {
	        	
	        }
	        else  {//don't show the name for the AI
	        	
	        	relocate(e.getSceneX() - mouseX + oldX, e.getSceneY() - mouseY + oldY);
	        	}
	       
	        });
	       		getChildren().addAll(r,text);
	      
		}
		else {
	    	  
	    	  
	    	  getChildren().addAll(r);
	      }
	     
	      
	       
	       
	}
    public void move(int x, int y) {
        oldX = x * 70 + 10;// 70 is tile size
        oldY = y * 70 + 10;
        relocate(oldX, oldY);
    }
    
    public void SetName(String s) {
    	text.setText(s);
    }
    public void abortMove() {
    	relocate(oldX, oldY);
    }
    public double getOldX() {
    	return oldX;
    }
    public double getOldY() {
    	return oldY;
    }
    public String GetText() {
    	return text.getText();
    }
}
