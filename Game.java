import java.util.Scanner;

public class Game {

	private Player player;
	private Location[] world = new Location[4];
	private Scanner sc = new Scanner(System.in);
	
	
	public Game(){
		this.initStartup();
		/*
		 * metod som skapar alla "locations" och lägger dom i arrayen world
		 */
		this.createLocations();
	}
	
	/*
	 * Här inne finns vår gameloop
	 */
	public void run(){
		while(true){
			/*
			 * Sysout var spelare är
			 * Berättar vilka vägar spelaren kan ta
			 * Spelare får välja en väg
			 * 
			 */
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
		OutdoorsArea forest = new OutdoorsArea();
		OutdoorsArea plains = new OutdoorsArea();
		OutdoorsArea desert = new OutdoorsArea();
		Room entrance = new Room();
		Room kitchen = new Room();
		this.world[0] = forest;
		this.world[1] = plains;
		this.world[2] = desert;
		this.world[3] = entrance;
		this.world[4] = kitchen;		
	}
	
}
