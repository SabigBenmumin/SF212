/*
 * File: HelloProgram.java
 * -----------------------
 * This program displays "hello, world" on the screen.
 * It is inspired by the first program in Brian
 * Kernighan and Dennis Ritchie's classic book,
 * The C Programming Language.
 */

import java.awt.Color;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class HelloWorld extends GraphicsProgram {
	public void run() {
		GLabel label = new GLabel("Hello, World", 100, 75);
		label.setFont("SansSerif-36");
		label.setColor(Color.RED);
		double x = (getWidth() - label.getWidth()) / 2;
		double y = (getHeight() + label.getAscent()) / 2;
		add(label, x, y);
	}
}
