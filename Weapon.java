
public class Weapon extends Item {

	private int damage;
	
	public Weapon(double weight, String name, int price, int dmg){
		super(weight, name, price);
		this.damage = dmg;
	}

	@Override
	public void doCommand(String command) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
