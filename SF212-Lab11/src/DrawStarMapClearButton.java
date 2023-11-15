/*
 * File: DrawStarMap_ClearButton.java
 * ----------------------------------
 * This program creates a five-pointed star every time the
 * user clicks the mouse on the canvas.  This version includes
 * a "Clear" button.
 */

import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawStarMapClearButton extends GraphicsProgram {

/* Initialize the graphical user interface */
    public void init() {
        add(new JButton("Clear"), SOUTH);
        addActionListeners();
        addMouseListeners();
    }

/* Called whenever the user clicks the mouse */
    public void mouseClicked(MouseEvent e) {
        GStar star = new GStar(STAR_SIZE);
        star.setFilled(true);
        add(star, e.getX(), e.getY());
    }

/* Called whenever an action event occurs */
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Clear")) removeAll();
    }

/* Private constants */
    private static final double STAR_SIZE = 20;

}
