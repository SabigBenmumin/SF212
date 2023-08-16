/*
 * File: PotholeFillingKarel.java
 * ------------------------------
 * The PotholeFillingKarel class puts a beeper into a pothole
 * on 2nd Avenue.
 */

import stanford.karel.*;

public class PotholeFillingKarel extends Karel {

	public void run() {
		move();
		down();
		putBeeper();
		upStep();
		turnRight();
		move();
		
		
	}

	public void upStep() {
		turnLeft();
		move();
	}

	public void uTurn() {
		turnLeft();
		turnLeft();
	}

	public void tripleStep() {
		move();
		move();
		move();
	}

	public void down() {
		turnRight();
		move();
		turnLeft();
	}

	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}

}