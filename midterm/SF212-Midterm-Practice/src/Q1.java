/* 
 * Q1
 * 
 * Name:
 * 
 * Student ID:
 * 
 */

import stanford.karel.*;

public class Q1 extends SuperKarel {
	
	// You fill in this part
	public void checkAndMoveBeepers() {
		if(beepersPresent()) {
			while(beepersPresent()) {
				pickBeeper();
			}
			turnLeft();
			putBeeper();
			while(beepersInBag()) {
				move();
				putBeeper();
			}
			turnAround();
			while(frontIsClear()) {
				move();
			}
			turnLeft();
			
		}
	}
	public void run() {
		checkAndMoveBeepers();
		while(frontIsClear()) {
			move();
			checkAndMoveBeepers();
		}
	}
	
}
