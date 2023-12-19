// Name (in English):
// ID: 

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import acm.graphics.GCompound;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Q1 extends GraphicsProgram {
	/* default length of a flag */
	private static final double INITIAL_FLAG_LENGTH = 200;

	/* max length of a flag */
	private static final double MAX_FLAG_LENGTH = 300;

	/* increment/decrement amount of length */
	private static final double ANIMATE_STEP = 2;

	/* pause duration */
	private static final double DURATION = 5;

	/* flag length */
	private double length = INITIAL_FLAG_LENGTH;

	/* reference of a flag object */
	private ThaiFlag flag;

	/* whether to animate */
	private boolean animate;

	public void init() {
		add(new JButton("Animat"), SOUTH);
		addMouseListeners();
		addAnimateButton();
	}

	public void run() {
		createFlag();

		while (true) {
			if (animate) {
				animateFlag();
				animate = false;
			}
			pause(DURATION);
		}
	}

	/* step (b) */
	private void createFlag() {
		ThaiFlag flag = new ThaiFlag();
	}

	/* begin step (c) */
	private boolean grab; // whether flag is grab
	private double prev_x, prev_y; // previous position of a flag

	public void mousePressed(MouseEvent e) {

	}

	public void mouseDragged(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}
	/* end step (c) */

	/* step (d) */
	private void addAnimateButton() {

	}

	/* step (f) */
	private void animateFlag() {

	}

	/* step (g) */
	public void actionPerformed(ActionEvent e) {
		
	}
}

class ThaiFlag extends GCompound {
	/* step (a) */
	public ThaiFlag(double length) {
		double bh = length/9;
		addrow(length/9, bh, 0, 0,Color.red);
		addrow(length/9, bh, 0, bh,Color.red);
		addrow(length/9, bh*2, 0, bh*2,Color.red);
		addrow(length/9, bh, 0, bh*4,Color.red);
		addrow(length/9, bh, 0, bh*5,Color.red);
	}
	public void addrow(double l, double h,double x, double y, Color c) {
		GRect row = new GRect(x, y, l, h);
		row.setFilled(true);
		row.setColor(c);
		add(row);
	}

	/* step (e) */
	public void resizeTo(double length) {
		
	}
}
