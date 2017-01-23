
public class Player {

	private String name;
	private	Location position;
	private	int gold;
	private int health;
	
	public Player(String name){
		this.name = name;
		this.health = 10;
	}
	
	public void moveTo(Location location){
		this.position = location;
	}

	public void setLocation(Location location) {
		this.position = location;		
	}
	
	public Location getPosition() {
		return this.position;		
	}
}
