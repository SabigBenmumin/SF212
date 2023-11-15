/*
 * OurFirstInteractors.java
 *
 * This program is a first attempt at adding Interactors to a window!
 * Eventually, these interactors will actually show up and we'll be
 * able to do cool things with them :) 
 */

import java.awt.event.ActionEvent;

import javax.swing.*;
import acm.program.*;

public class TwoButtons extends ConsoleProgram {

	
	public void init() {
 		setFont("Courier-24");
		JButton yayButton = new JButton("Yay");
		JButton nayButton = new JButton("Nay");
		add(yayButton, SOUTH);
		add(nayButton, SOUTH);
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		println(cmd);
	}
	
}
