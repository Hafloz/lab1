
public class OutdoorsArea extends Location{

	private String weather;

	public OutdoorsArea(boolean n, boolean s, boolean w, boolean e, String shortDescription, String longDescription){
		super(n,s, w, e);
		this.setShortDescription(shortDescription);
		this.setLongDescription(longDescription);
	}
	


	@Override
	public void doCommand(String command) {
		// TODO Auto-generated method stub
		
	}

	
	/*
	 * I varje location så har den en array med vilka locations den kan gå till.
	 * Vi har skapat programmet så att om det finns en förbindelse norrut finns en location på plats 0,
	 * söderut plats 1, västerut plats 2 och österut plats 4 i arrayen.
	 * Bakomliggande anledningen är att man bara gå kan gå åt fyra håll.
	 * Däremot har vi valt att tillåta att en plats kan ha null för då vet vi att spelaren inte kan gå dit.
	 */
	@Override
	public void availableRoads() {
		for(int i = 0; i < 4; i ++){
			if(this.getPaths()[i] == null){
				//Do nothing if null
			}else{
				switch(i){
				case 0:
					System.out.println("You can walk to the north");
					break;
				case 1:
					System.out.println("You can walk to the south");
					break;
				case 2:
					System.out.println("You can walk to the west");
					break;
				case 3:
					System.out.println("You can walk to the east");
					break;
				default:
					break;
				}
			}
		}
	}
	
}
