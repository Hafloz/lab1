import java.util.Scanner;

public class Game {

	private Player player;
	private Location[] world = new Location[5];
	private Scanner sc = new Scanner(System.in);
	
	
	public Game(){
		this.initStartup();
		/*
		 * metod som skapar alla "locations" och lägger dom i arrayen world
		 */
		this.createLocations();
		this.player.setLocation(this.world[0]);
		this.run();
	}
	
	/*
	 * Här inne finns vår gameloop
	 */
	public void run(){
		while(true){
			/*
			 * Här anropas spelarens location, som vi sedan ber beskriva sig själv. 
			 */
			this.player.getPosition().describeYourself();
			/*
			 * Berätta vilka vägar spelaren kan ta
			 */
			this.player.getPosition().availableRoads();
			/*
			 * Tar användar inmatning
			 */
			String direction = getOkDirection();
			/*
			 * Försöker gå dit användaren vill
			 */
			this.movePlayer(direction);
		}
	}
	
	private void initStartup(){
		System.out.println("Welcome to the adventure game!");
		System.out.println("What is your name? ");
		/*
		 * Ska vi kanske skapa en test för att se om namnet är ok?
		 */
		String name = sc.nextLine();
		this.player = new Player(name);
		System.out.println("Hello " + name + ", welcome to this magical world of wonder! \nYou can move around "
				+ "by typing north/south/west/east. \nYou will have to learn more commands "
				+ "as you play the game! \n(Hint: there is a command \"help\").");
		
	}
	
	/*
	 * fattig metod som skapar våra locations och lägger dom i 
	 * arrayen world
	 */
	private void createLocations(){
		/*
		 * Parameter för outdoorsArea är: 
		 * boolean north, boolean south, boolean west, boolean east, String shortDescription, String longDescription
		 * Med det menas kan man gå norr härifrån, söder härifrån osv..
		 * shortDescription och longDescription är vad det låter som
		 */
		OutdoorsArea forest = new OutdoorsArea("forest", "long forest");
		OutdoorsArea plains = new OutdoorsArea("plains", "long plains");
		OutdoorsArea desert = new OutdoorsArea("desert", "long desert");
		Room entrance = new Room("entrance", "long entrance");
		Room kitchen = new Room("kitchen", "long kitchen");
		this.world[0] = forest;
		this.world[1] = plains;
		this.world[2] = desert;
		this.world[3] = entrance;
		this.world[4] = kitchen;	
		/*
		 * 0 = norr, 1 = söderut, 2 = västerut, 3 = österut
		 */
		this.world[0].setPath(1, plains);
		this.world[1].setPath(0, forest);
		this.world[1].setPath(3, desert);
		this.world[2].setPath(2, plains);
		this.world[2].setPath(3, entrance);
		this.world[3].setPath(2, desert);
		this.world[3].setPath(1, kitchen);
		this.world[4].setPath(0, entrance);
	}
	
	
	private String getOkDirection(){
		while(true){
			String direction = this.sc.nextLine().toLowerCase();
			if(direction.equals("north") || direction.equals("south") || direction.equals("west") || direction.equals("east")){
				return direction;
			}else{
				System.out.println("You need to type north, east, south or west.");
			}
		}
	}
	
	private void movePlayer(String direction){
		switch (direction){
		case "north":
			for(int i = 0; i < this.world.length; i++){
				if(this.world[i].equals(this.player.getPosition())){
					if(world[i].getPaths()[0] != null){
						player.moveTo(world[i].getPaths()[0]);
						break;
					}
				}	
			}
			break;
		case "south":
			System.out.println("Nu vill vi gå söderut");
			for(int i = 0; i < this.world.length; i++){
				if(this.world[i].equals(this.player.getPosition())){
					if(world[i].getPaths()[1] != null){
						this.player.moveTo(world[i].getPaths()[1]);
						break;
					}
				}	
			}
			break;
		case "west":
			for(int i = 0; i < this.world.length; i++){
				if(this.world[i].equals(this.player.getPosition())){
					if(world[i].getPaths()[2] != null){
						player.moveTo(world[i].getPaths()[2]);
						break;
					}
				}	
			}
			break;
		case "east":
			for(int i = 0; i < this.world.length; i++){
				if(this.world[i].equals(this.player.getPosition())){
					if(world[i].getPaths()[3] != null){
						player.moveTo(world[i].getPaths()[3]);
						break;
					}
				}	
			}
			break;

		}

	}
	
}
