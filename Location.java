
public abstract class Location {


	private String name;
	private String description;
	/*
	 * 0 = norr, 1 = söderut, 2 = västerut, 3 = österut
	 */
	private Location[] paths = new Location[4];
	protected boolean describedMyself = false;
	protected String shortDescription;
	protected String longDescription;
	
	public abstract void availableRoads();
	
	public void describeYourself(){
		String description = (this.describedMyself) ? this.shortDescription : this.longDescription;
		System.out.println(description);
		this.describedMyself = true;
	}
	
	public abstract void doCommand(String command);
	
	public void setPath(int i, Location location){
		this.paths[i] = location;
	}
	
	public Location[] getPaths(){
		return this.paths;
	}
}
