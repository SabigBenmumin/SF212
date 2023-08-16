import stanford.karel.Karel;
// This tells Ecipse about Karel


// Define a program called StepUp
public class StepUp extends Karel {
	
	// The program starts executing from the "run" method.
	public void run() {
		move();
		move();
		pickBeeper();
		turnLeft();
		move();
		turnRight();
		move();
		putBeeper();
		move();
		// Commands in the run method are executed one at a time
	}
	
	private void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
}

