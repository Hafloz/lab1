
public abstract class Location {

	private String name;
	private String description;
	private Location[] paths;
	
	public abstract void describeYourself();	
	
	public abstract void doCommand(String command);
	
}
