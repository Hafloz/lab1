
public abstract class Item {

	private double weight;
	private String name;
	private int price;	
	
	public Item(double weight, String name, int price){
		this.weight = weight;
		this.name = name;
		this.price = price;
	}
	
	public void printYourself(){
		
	}
	
	public abstract void doCommand(String command);
	
	public String getName(){
		return this.name;
	}
	
}
