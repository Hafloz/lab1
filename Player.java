
public class Player {

	private String name;
	private	Location position;
	private	int gold;
	private int health;
	private Item[] items = new Item[16];
	
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
	
	public void setItem(Item item){
		for(int i = 0; i < this.items.length; i++){
			if(this.items[i] == null){
				this.items[i] = item;
				return;
			}
		}
	}
	
	public void printItems(){
		for(int i = 0; i < this.items.length; i++){
			if(this.items[i] != null){
				System.out.println(this.items[i].getName());
			}
		}
	}
}
