/*
 * File: RoadRepair.java
 * --------------------------
 * The RoadRepair subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the road"
 * problem from Assignment 2.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class RoadRepair extends SuperKarel {
	public void run() {
		repair();
		while(frontIsClear()) {
			move();
			repair();
		}
	}
	public void repair() {
		if(rightIsClear()) {
			turnRight();
			move();
			putBeeper();
			turnAround();
			move();
			turnRight();

		}
	}
}