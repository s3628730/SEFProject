public class Player {
	
	//player score
	private int score;
	
	//player direction
	private	int posX;
	private int posY;
	private String direction;
	
	// name and password
	private String name;
	private String pass;

	public Player(String name, String ip) {
		this.name = name;
		this.pass = ip;
		this.score = 0;
	}
	
	public int posX() {
		return posX;
	}
	
	public int posY() {
		return posY;
	}
	
	
	public String getDirection() {
		return direction;
	}
	
	public void setDirection(String direction) {
		this.direction = direction;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return name;
	}

	public String getPlayerPass() {
		return pass;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	//converts player info to a string
	public String toString() {
		String mess = name + "." + pass + "." + score;
		return mess;
	}
	
	//check if a player is the same
	public boolean equal(String name, String pass)
	{
		
		if(this.name.equals(name)== true && this.pass.equals(pass)== true)
		{
			return true;
		}
		
		return false;
			
	}
}