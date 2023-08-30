/*
 * File: BanishWinter.java
 * -----------------------
 * The BanishWinter subclass gets Karel adorn a series
 * of trees with a cluster of beeper leaves.
 */

import stanford.karel.*;

public class BanishWinter extends SuperKarel {

	public void run() {
		for(int i = 0; i<4; i++) {
			findAndDrawAtree();
		}
	}
	
	public void findAndDrawAtree() {
		findAtree();
		climbing();
		draw();
		down();
		moveUntilBlock();
	}
	
	public void moveUntilBlock() {
		while(frontIsClear()) {
			move();
		}
	}
	
	public void findAtree() {
		while(frontIsClear()) {
			move();
		}
	}
	
	public void climbing() {
		turnLeft();
		while(rightIsBlocked()) {
			move();
		}
	}
	
	public void draw() {
		putBeeper();
		move();
		putBeeper();
		turnRight();
		move();
		turnRight();
		putBeeper();
		move();
		putBeeper();
		move();
		
	}
	
	public void down() {
		while(frontIsClear()) {
			move();
		}
		turnLeft();
	}
}
