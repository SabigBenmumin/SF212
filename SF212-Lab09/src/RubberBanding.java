/*
 * This program allows users to create lines on the graphics canvas by clicking
 * and dragging with the mouse.  The line is redrawn from the original point to
 * the new endpoint, making it look as if it’s connected with a rubber band.
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class RubberBanding extends GraphicsProgram {
    /*
     * Called when the mouse button is pressed down.
     * Creates a new line on the screen.
     */
    public void mousePressed(MouseEvent e) {
    	line = new GLine(e.getX(), e.getY());
    	add(line);
    }

    /*
     * Called when mouse is pressed and moved.
     * Sets the new endpoint for the line.
     */
    public void mouseDragged(MouseEvent e) {
    	double x = e.getX();
    	double y = e.getY();
    	line.setEndPoint(x, y);
    }

    // field representing the current line in progress
    private GLine line;
}
