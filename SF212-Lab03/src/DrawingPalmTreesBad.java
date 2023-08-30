/*
 * File: DrawingPalmTreesBad.java
 * ---------------------
 * An example of a program with bad decomposition.
 */

import stanford.karel.*;

public class DrawingPalmTreesBad extends SuperKarel {
	public void run() {
		
		while(frontIsClear()) {
			move();
			if(beepersPresent()) {
				turnLeft();
				for(int i = 0; i < 5; i++) {
					move();
					putBeeper();
				}
				for(int i = 0; i < 4; i++) {
					turnRight();
					move();
					putBeeper();
					turnAround();
					move();
				}
				turnAround();
				for(int i = 0; i < 5; i++) {
					move();
				}
				turnLeft();
			}
		}
	
	}
}

