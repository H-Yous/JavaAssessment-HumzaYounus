package assessTask;

public class Task extends Place {

	private int x, y;
	
	//private String spot = "None";
	
	private int end = 0;

	public Task() {
		this.x = 0;
		this.y = 0;
		System.out.println("Grey foggy clouds float oppressively close to you, \n" + 
				"reflected in the murky grey water which reaches up your shins.\n" + 
				"Some black plants barely poke out of the shallow water.\n" + 
				"Try typing \"north\",\"south\",\"east\", \"west\" OR \"checktreasure\"\n" + 
				"You notice a small watch-like device in your left hand.\n" + 
				"It has hands like a watch, but the hands don't seem to tell time.\n"
				+ "Use this to find the treasure!");
		setTreasure();
		System.out.println("Treasure at: " + getTreasureX() + "|" + getTreasureY());
	} 
	
	public void moveNorth() {
		this.y+=1;
		
		if(checkPos(this.x, this.y)) {
			end = getPos(this.x, this.y);
		} else {
			System.out.println(getNorth(this.x, this.y)); 
		}
	}
	public void moveEast() {
		this.x+=1;
		
		if(checkPos(this.x, this.y)) {
			end = getPos(this.x, this.y);
		} else {
			System.out.println(getEast(this.x, this.y));
		}
		
		
	}
	public void moveSouth() {
		this.y-=1;
		if(checkPos(this.x, this.y)) {
			end = getPos(this.x, this.y);
		} else {
			System.out.println(getSouth(this.x, this.y));
		}
		
	}
	public void moveWest() {
		this.x-=1;
		if(checkPos(this.x, this.y)) {
			end = getPos(this.x, this.y);
		}
		else {
			System.out.println(getWest(this.x, this.y));
		}
		
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	public void setEnd(int finish) {
		this.end = finish;
	}
	public int getEnd() {
		return this.end;
	}
	
	public int move(String direction) {
		direction = direction.toLowerCase();
		int rtn = 0;
		switch(direction) {
		case "north": 
			moveNorth();
			rtn = 1;
			break;
			
		case "east":
			moveEast();
			rtn = 2;
			break;
		case "south":
			moveSouth();
			rtn = 3;
			break;
		case "west":
			moveWest();
			rtn = 4;
			break;
		case "checktreasure":
			System.out.println(checkTreasure(this.x, this.y));
			rtn = 5;
			break;
		}
		return rtn;
	}

	
//	public String whereAmI() {
//		
//		return "The dial reads: ";
//	}
//	
	
	
}
