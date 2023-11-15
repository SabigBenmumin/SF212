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

public class OurFirstInteractors extends ConsoleProgram {

	private JTextField textField = new JTextField(20);
	
	public void init() {
 		setFont("Courier-24");
		JLabel label = new JLabel("Name: ");
		JButton button = new JButton("Click me!");
		
		add(label, SOUTH);
		add(textField, SOUTH);
		add(button, SOUTH);
		
		// special line which says, I care about 
		// people hitting enter on the text field
		textField.addActionListener(this);
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		String key = textField.getText();
		println("hello, " + key);
	}
	
}
