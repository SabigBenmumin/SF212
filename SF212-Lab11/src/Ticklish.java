/*
 * OurFirstInteractors.java
 * Brahm Capoor, May 2018
 *
 *
 * This program is a first attempt at adding Interactors to a window!
 * Eventually, these interactors will actually show up and we'll be
 * able to do cool things with them :) 
 */

import java.awt.event.ActionEvent;

import javax.swing.*;
import acm.program.*;

public class Ticklish extends ConsoleProgram {

	
	public void init() {
 		setFont("Courier-24");
 		
 		// 1. make a button
		JButton button = new JButton("Press me");
		
		// 2. add it to the screen
		add(button, SOUTH);
		
		// 3. add action listeners
		addActionListeners();
	}
	
	// 4. handle action
	public void actionPerformed(ActionEvent e) {
		println("Tehehe");
	}
	
}
