import java.awt.Color;

public class Pieces {

protected String name;
protected int value;
protected int team;

	public Pieces () {

	}	

	public String getName() {
			return name;
		}
	public void setName(String name) {
		this.name=name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value=value;
	}
	public int getTeam() {
		return team;
	}
	public void setTeam(int team) {
		this.team=team;
	}
}