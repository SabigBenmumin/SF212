/* 
 * Q1: Christmas Trees
 * 
 * Name (in English):Sabig Benmumin
 * 
 * Student ID:6510742197
 * 
 */

import stanford.karel.SuperKarel;

public class Q1 extends SuperKarel {
	
	public void moveAndPut(int n) {
		while(n > 0) {
			move();
			putBeeper();
			n--;
		}
	}
	
	public void comeBack(int k) {
		turnAround();
		for(int s = 0; s < k; s++) {
			move();
		}
	}
	
	// You fill in this part
	public void dropBeeper() {
		if(beepersPresent()) {
			turnLeft();
			move();
			putBeeper();
			for(int l = 2;l >= 0;l -=1) {
				move();
				putBeeper();
				turnLeft();
				moveAndPut(l);
				comeBack(l);
				moveAndPut(l);
				comeBack(l);
				turnRight();
			}
			turnAround();
			while(frontIsClear()) {
				move();
			}
			turnLeft();
		}
	}
	public void run() {
		while(frontIsClear()) {
			move();
			dropBeeper();

		}
	}

}
