/**
 * Defines a GObject subclass that displays a slot machine.  The
 * state of the slot machine are defined by three picture names:
 * Bar, Bell, Cherry, Lemon, Orange, and Plum.
 */

import acm.graphics.*;
import java.awt.*;

public class GSlotMachine extends GCompound {

	/** Creates a new GSlotMachine object, which initially contains 2 BAR's */
	public GSlotMachine() {
		double refStart = -FRAME_WIDTH / 2;
		GRect frame = new GRect(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setFilled(true);
		frame.setFillColor(Color.gray);
		add(frame, refStart, -FRAME_HEIGHT / 2);
		slot1 = new GImage("Cherry.jpg");
		slot2 = new GImage("Cherry.jpg");
		slot3 = new GImage("Cherry.jpg");
		add(slot1,refStart + FRAME_INSET, (-FRAME_HEIGHT/2)+FRAME_INSET);
		add(slot2,refStart + FRAME_INSET*2 + SLOT_SIZE, (-FRAME_HEIGHT/2)+FRAME_INSET);
		add(slot3,refStart + FRAME_INSET*3 + SLOT_SIZE*2, (-FRAME_HEIGHT/2)+FRAME_INSET);
	}

	/** Sets the state of the slot machine */
	public void setState(String name1, String name2, String name3) {
		slot1.setImage(name1+".jpg");
		slot1.setSize(SLOT_SIZE,SLOT_SIZE);
		slot2.setImage(name2+".jpg");
		slot2.setSize(SLOT_SIZE,SLOT_SIZE);
		slot3.setImage(name3+".jpg");
		slot3.setSize(SLOT_SIZE,SLOT_SIZE);
	}

	/* Private constants */
	private static final double FRAME_WIDTH = 190;

	private static final double FRAME_HEIGHT = 70;

	private static final double SLOT_SIZE = 50;

	private static final double FRAME_INSET = 10;

	/* Private instance variables */

	private GImage slot1, slot2, slot3;

}
