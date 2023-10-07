/* 
 * Q1
 * 
 * Name:Sabig Benmumin
 * 
 * Student ID:6510742197
 * 
 */

import stanford.karel.*;

public class Q1 extends SuperKarel {
	
	// You fill in this part
	public void dropBeeper() {
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
	public void checkAndPick() {
		if(beepersPresent()) {
			while(beepersPresent()) {
				pickBeeper();
			}
		}
	}
	public void run() {
		checkAndPick();
		if(beepersInBag()) {
			dropBeeper();
		}
		while(frontIsClear()) {
			move();
			checkAndPick();
			if(beepersInBag()) {
				dropBeeper();
			}
		}
	}
}
