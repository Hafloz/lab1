
public class Room extends Location {
	
	private int size;

	
	public Room(boolean n, boolean s, boolean w, boolean e, String shortDescription, String longDescription){
		super(n,s, w, e);
		this.setShortDescription(shortDescription);
		this.setLongDescription(longDescription);
	}
	
//	@Override
//	public void describeYourself() {
//		String description = (this.describedMyself) ? this.shortDescription : this.longDescription;
//		System.out.println(description);
//		this.describedMyself = true;
//	}

	@Override
	public void doCommand(String command) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void availableRoads() {
		for(int i = 0; i < 4; i ++){
			if(this.getPaths()[i] == null){
				//Do nothing if null
			}else{
				switch(i){
				case 0:
					System.out.println("You can enter the door to the north");
					break;
				case 1:
					System.out.println("You can enter the door to the south");
					break;
				case 2:
					System.out.println("You can enter the door to the west");
					break;
				case 3:
					System.out.println("You can enter the door to the east");
					break;
				default:
					break;
				}
			}
		}
	}
	
}
