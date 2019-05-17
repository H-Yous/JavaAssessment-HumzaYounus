package assessTask;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		Task task1 = new Task();
		 
		while(task1.getEnd() != 1) {
			System.out.print("\nEnter your Direction: ");
			Scanner s = new Scanner(System.in);
			String nextLine = s.nextLine();
			
			task1.move(nextLine.toLowerCase()); 
			
		}
	
		System.out.println("Finished");
		
	}
}
