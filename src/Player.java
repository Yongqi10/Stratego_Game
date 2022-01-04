
public class Player {
	public static final int num = 10;
	private Pieces []p= new Pieces[num];
	
	public Player() {
		
		Flag flag = new Flag();
		Marshall mar = new Marshall();
		General gen = new General();
		Colonel co = new Colonel();
		Major ma = new Major();
		Captain ca = new Captain();
		Lieutenant lie = new Lieutenant();
		Sergeant ser = new Sergeant();
		Miner min = new Miner();
		Scout sc = new Scout();
	
		p[0] = flag;
		p[1] = mar;
		p[2] = gen;
		p[3] = co;
		p[4] = ma;
		p[5] = ca;
		p[6] = lie;
		p[7] = ser;
		p[8] = min;
		p[9] = sc;
		for(int i = 0; i < p.length; i++)
		{
			p[i].setTeam(1);
			
		}
		
	}
		
	
	public Pieces getPieces(String pname) {
		Pieces pi = new Pieces();
		for(int i = 0; i<p.length;i++)
		{
			if(p[i].getName().equals(pname))
			{
				pi = p[i];
			}
		}
		
		
		return pi;
	}

}
