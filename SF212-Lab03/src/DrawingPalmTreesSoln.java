/*
 * File: DrawingPalmTreesSoln.java
 * ---------------------
 * In this program, whenever Karel encounters a beeper on the ground,
 * Karel will draw a palm tree.
 */

import stanford.karel.*;

public class DrawingPalmTreesSoln extends SuperKarel {
	public void run() {
		
		while(frontIsClear()) {
			move();
			if(beepersPresent()) {
				drawATree();
			}
		}
	
	}
	
	/*
	 * Karel will draw a palm tree.
	 * Pre: Karel is facing East.
	 * Post: Karel has drawn a tree and is facing East.
	 */
	private void drawATree() {
		turnLeft();
		drawTrunk();
		drawLeaves();
		descendTree();
		turnLeft();
	}
	
	/*
	 * Karel will draw a trunk that is six beepers tall.
	 * Pre: Karel is facing North and standing on a beeper.
	 * Post: Karel is 6 spaces high and facing North.
	 */
	private void drawTrunk(){
		for(int i = 0; i < 5; i++) {
			move();
			putBeeper();
		}
	}
	
	/*
	 * Karel will draw four leaves that are one beeper long.
	 * Pre: Karel is facing North.
	 * Post: Karel is facing North.
	 */
	private void drawLeaves(){
		for(int i = 0; i < 4; i++) {
			turnRight();
			drawLeaf();
			returnToTrunk();
		}
	}
	
	/*
	 * Karel will draw one leaf that is one beeper long.
	 * Pre: Karel is on the trunk of the tree.
	 * Post: Karel is at the end of the leaf.
	 */
	private void drawLeaf(){
		move();
		putBeeper();
	}
	
	/*
	 * Karel will return to the trunk.
	 * Pre: Karel is one space away from the trunk and facing away.
	 * Post: Karel is standing on the trunk.
	 */
	private void returnToTrunk() {
		turnAround();
		move();
	}
	
	/*
	 * Karel will descend the trunk.
	 * Pre: Karel is facing North and 6 spaces up.
	 * Post: Karel is facing West and on the ground.
	 */
	private void descendTree() {
		turnAround();
		for(int i = 0; i < 5; i++) {
			move();
		}
	}
	
	
}

