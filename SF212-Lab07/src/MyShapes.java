import acm.program.*;
import java.awt.*;

public class MyShapes extends GraphicsProgram {
	public void run() {
		/* Objects from GPolygon */
		GStar star = new GStar(100);
		star.setFilled(true);
		star.setColor(Color.RED);
		add(star, getWidth() / 4, getHeight() / 4);

		GArchedDoor door = new GArchedDoor(50, 100);
		door.setFilled(true);
		door.setColor(Color.GREEN);
		add(door, getWidth() / 2, getHeight() / 4 + 50);

		GCross cross = new GCross(100);
		cross.setFilled(true);
		cross.setColor(Color.BLUE);
		add(cross, getWidth() * 3 / 4, getHeight() / 4);

		/* Objects from GCompound */
		GFace face = new GFace(80, 100);
		add(face, getWidth() / 4, getHeight() / 2);

		GPacMan pacman1 = new GPacMan(50);
		add(pacman1, getWidth() / 2, getHeight() / 2);

		GPacMan pacman2 = new GPacMan(50);
		pacman2.openMouth(45);
		add(pacman2, getWidth() * 3 / 4, getHeight() / 2);

		GSlotMachine slot1 = new GSlotMachine();
		slot1.setState("Bar", "Cherry", "Plum");
		add(slot1, getWidth() / 4, getHeight() * 3 / 4);

		GSlotMachine slot2 = new GSlotMachine();
		slot2.setState("Bell", "Bell", "Bell");
		add(slot2, getWidth() * 3 / 4, getHeight() * 3 / 4);

	}
}
