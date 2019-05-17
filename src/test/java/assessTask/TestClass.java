package assessTask;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass {

	Task task = new Task();
	@Test
	public void moveNorth() {
		assertEquals(1, task.move("north")); 
	} 
	
	@Test
	public void moveSouth() {
		assertEquals(3, task.move("south"));
	}
	
	@Test
	public void moveEast() {
		assertEquals(2, task.move("east"));
	}
	
	@Test 
	public void moveWest() {
		assertEquals(4, task.move("West"));
	} 
	
	@Test
	public void reachPark() {
		task.move("North");
		task.move("North"); 
		
	}
	
	@Test
	public void setTreasureTest() {
		
	}
}
