
public abstract class Location {


	private String name;
	private String description;
	/*
	 * 0 = norr, 1 = söderut, 2 = västerut, 3 = österut
	 */
	private Location[] paths = new Location[4];
	private boolean describedMyself = false;
	private String shortDescription;
	private String longDescription;
	private boolean okNorth;
	private boolean okSouth;
	private boolean okWest;
	private boolean okEast;
	//Får max finnas 5 items per ställe
	private Item[] items = new Item[5];
	
	public Location(boolean north, boolean south, boolean west, boolean east){
		if(north) this.okNorth = true;
		if(south) this.okSouth = true;
		if(west) this.okWest = true;
		if(east) this.okEast = true;
	}
	
	public abstract void availableRoads();
	
	public void describeYourself(){
		String description = (this.describedMyself) ? this.shortDescription : this.longDescription;
		System.out.println(description);
		this.describedMyself = true;
		for(int i = 0; i < this.items.length; i++){
			if(this.items[i] != null){
				System.out.println("There is a/an " + this.items[i].getName() + " here.");
			}
		}
	}
	
	public void addItem(Item item){
		for(int i = 0; i < this.items.length; i++){
			if(this.items[i] == null){
				this.items[i] = item;
				return;
			}
		}
		System.out.println("Couldn't add item");
	}
	
	public abstract void doCommand(String command);
	
	public void setPath(int i, Location location){
		this.paths[i] = location;
	}
	
	public Location[] getPaths(){
		return this.paths;
	}
	
	public void setLongDescription(String descr){
		this.longDescription = descr;
	}
	
	public void setShortDescription(String descr){
		this.shortDescription = descr;
	}

	public boolean getOkNorth() {
		return okNorth;
	}

	public void setOkNorth(boolean okNorth) {
		this.okNorth = okNorth;
	}

	public boolean getOkSouth() {
		return okSouth;
	}

	public void setOkSouth(boolean okSouth) {
		this.okSouth = okSouth;
	}

	public boolean getOkWest() {
		return okWest;
	}

	public void setOkWest(boolean okWest) {
		this.okWest = okWest;
	}

	public boolean getOkEast() {
		return okEast;
	}

	public void setOkEast(boolean okEast) {
		this.okEast = okEast;
	}
	
}
