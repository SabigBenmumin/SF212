/*
 * File: WhileLoop.java
 * ---------------------
 * In this program, Karel will fill all of the squares directly
 * in front of Karel with beepers.
 * 
 * This is an example of a "general" solution - it works for
 * many different types of worlds!
 */

import stanford.karel.*;

public class WhileLoop extends SuperKarel {
	public void run() {
		
		while(frontIsClear()){

			putBeeper();
			move();

		}
		
		putBeeper();
	
	}
}

