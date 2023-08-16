// This tells Ecipse about Karel
import stanford.karel.*;

// This is a comment. They are for humans to read!

// Define a program called StepUp
public class StepUpSoln1 extends Karel {

	// The program starts executing from the "run" method.
	public void run() {
		move();
		move();
		pickBeeper();
		turnLeft();
		move();

		turnLeft();
		turnLeft();
		turnLeft();

		move();
		putBeeper();
		move();
	}

}
