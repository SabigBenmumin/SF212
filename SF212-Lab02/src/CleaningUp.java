/*
 * File: CleaningUp.java
 * ---------------------
 * In this program, Karel will clean up all of the squares directly
 * in front of Karel so that there are no beepers present.
 */

import stanford.karel.*;

public class CleaningUp extends SuperKarel {
	public void run() {
		
		while(frontIsClear()){

			if(beepersPresent()) {
				pickBeeper();
			}
			move();

		}

		if(beepersPresent()) {
			pickBeeper();
		}
	
	}
}

