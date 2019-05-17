package assessTask;

import java.util.Random;

public class Place {
	final static int aparkX = 0, aparkY = 2, 
			beachX = 10, beachY = 0, 
			houseX = 0, houseY = -5, 
			hotelX = -7, hotelY = 0;
	
	static int treasureX, treasureY;
	
	public void amusementPark() {
		System.out.println("You're at the Amusement Park");
		System.out.println("You have fun on the rides however after 3 hours and decide to move on");
	}
	public void beach() {
		System.out.println("You're at the Beach");
	}
	public void house() {
		System.out.println("You're at the House");
	}
	public void hotel() {
		System.out.println("You're at the hotel");
	}
	
	public void setTreasure() {
		Random ran = new Random();
		treasureX = ran.nextInt(16)-6;
		treasureY = ran.nextInt(6)-4;
	}
	public int getTreasureX() {
		return Place.treasureX;
	}
	public int getTreasureY() {
		return Place.treasureY;
	}
	public String checkTreasure(int x, int y) {
		String rtn = "hi";
		if(x < treasureX && y > treasureY) {
			rtn = "South-East";
		} else if(x < treasureX && y < treasureY) {
			rtn =  "North-East";
		}else if(x > treasureX && y > treasureY) {
			rtn = "South-West";
		}else if(x > treasureX && y < treasureY) {
			rtn = "North-West";
		} else if(x == treasureX && y < treasureY) {
			rtn = "North";
		} else if(x == treasureX && y > treasureY) {
			rtn = "South";
		} else if(y == treasureY && x < treasureX) {
			rtn = "East";
		} else if(y == treasureY && x > treasureX) {
			rtn = "West";
		}
		return rtn;
	}
	public void foundTreasure() {
		System.out.println("You've found the treasure!");
	}
	
	public String getNorth(int x, int y){
		if(x == treasureX && y < treasureY) {
			int distance = treasureY-y;
			return "Dial reads '" + distance + "' away";
		} else {
			if(x == 0 && y < 2) {
				int distance = aparkY-y;
				return "Dial reads '" + distance + "' away";
			} else {
				return "There is nothing ahead.";
			}
		}
			
	}
	public String getEast(int x, int y){
		if(y == treasureY && x < treasureX) {
			int distance = treasureX-x;
			return "Dial reads '" + distance + "' away";
		} else {
			if(y == 0 && x < 10) {
				int distance = beachX-x;
				return "Dial reads '" + distance + "' away";
			} else {
				return "There is nothing ahead.";
			}
		}
	}
	public String getSouth(int x, int y){
		if(x == treasureX && y > treasureY) {
			int distance = treasureY-y;
			distance*=-1;
			return "Dial reads '" + distance + "' away";
		}else {
			if(x == 0 && y > -5) {
				int distance = houseY-y;
				distance*=-1;
				return "Dial reads '" + distance + "' away";
			} else {
				return "There is nothing up ahead, turn back";
			}
		}
	}
	public String getWest(int x, int y){
		if(y == treasureY && x > treasureX) { 
			int distance = treasureX-x;
			distance*=-1;
			return "Dial reads '" + distance + "' away";
		}
		else {
			if(y == 0 && x >-7) {
				int distance = hotelX-x;
				distance*=-1;
				return "Dial reads '" + distance + "' away";
			} else {
				return "There is nothing up ahead, turn back";
			}
		}
		
	}
	
	public boolean checkPos(int x, int y) {
		boolean rtn = false;
		if(x == 0) {
			if(y == 2) {
				rtn = true;
			}
			else if(y == -5) { rtn = true; }
			else {
				rtn = false;
			}
		}
		if(y==0){
			if(x == 10) { 
				rtn = true; 
				}
			else if(x == -7) {
				rtn = true;
			} else {
				rtn = false;
			}
		}
		if(x == treasureX && y == treasureY) {
			rtn = true;
		}
		
		return rtn;
	}
	public int getPos(int x, int y) {
		int rtn = 0;
		if(x == 0 && y == 2) { amusementPark(); }
		if(x == 0 && y == -5) { house(); }
		if(y == 0 && x == 10) { beach(); }
		if(y == 0 && x == -7) { hotel(); }
		if(x == treasureX && y == treasureY) {foundTreasure(); rtn = 1;}
		return rtn;
		}
	}
