/*
 * File: SpiralKarel.java
 * --------------------------
 * The SpiralKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "Spiral"
 * problem from Assignment 2.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class SpiralKarel extends SuperKarel {
	public void run() {
		while(beepersPresent()) {
			pickBeeper();
		}
		while(frontIsClear() || leftIsClear()) {
			if(frontIsClear()) {
				move();
			}else {
				putBeeper();
				turnLeft();
				move();
			}
		}
		putBeeper();
		turnLeft();
	}
}