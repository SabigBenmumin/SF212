/*
 * File: ManyRandoms.java
 * --------------------
 * A program that generates random numbers.
 */

import java.awt.*;

import acm.program.*;
import acm.util.*;	// for RandomGenerator

public class ManyRandoms extends ConsoleProgram {
	
	/* How many random numbers to generate */
	private static final int NUM_RANDOMS = 10;

	public void run() {	
		println("Let's make some random numbers!");
		
		// this variable can generate random values
		RandomGenerator rgen = RandomGenerator.getInstance();
		
		// use setSeed if you want to get the same random values
		// each time you run the program; useful for debugging
		//rgen.setSeed(2);
		
		for (int i = 0; i < NUM_RANDOMS; i++) {
			int diceRoll = rgen.nextInt(1, 6);
			println(diceRoll);
		}
		
	}
}

