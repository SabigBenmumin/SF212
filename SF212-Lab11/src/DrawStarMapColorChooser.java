/*
 * File: DrawStarMap_ColorChooser.java
 * -----------------------------------
 * This program creates a five-pointed star every time the
 * user clicks the mouse on the canvas.  This version extends
 * the previous version by adding a chooser to select the
 * color of the star.
 */

import acm.program.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This program creates a five-pointed star every time the user clicks the mouse
 * on the canvas. This version includes a JButton to clear the screen, a JSlider
 * to choose the size, and a JComboBox to choose the color.
 */
public class DrawStarMapColorChooser extends GraphicsProgram {

    /* Initializes the graphical user interface */
    public void init() {
        add(new JButton("Clear"), SOUTH);
        sizeSlider = new JSlider(MIN_SIZE, MAX_SIZE, INITIAL_SIZE);
        add(new JLabel("  Small"), SOUTH);
        add(sizeSlider, SOUTH);
        add(new JLabel("Large  "), SOUTH);
        initColorChooser();
        add(colorChooser, SOUTH);
        addMouseListeners();
        addActionListeners();
    }

    /* Initializes the color chooser */
    private void initColorChooser() {
    	colorChooser = new JComboBox();
    	colorChooser.addItem("Black");
    	colorChooser.addItem("White");
    	colorChooser.addItem("Red");
    	colorChooser.addItem("Blue");
    	colorChooser.addItem("Green");
    	colorChooser.addItem("Yellow");
    	colorChooser.setEditable(false);
    }

    /* Returns the current color */
    private Color getCurrentColor() {
    	switch (colorChooser.getSelectedIndex()) {
    	case 0: return Color.black;
    	case 1: return Color.white;
    	case 2: return Color.red;
    	case 3: return Color.blue;
    	case 4: return Color.green;
    	case 5: return Color.yellow;
    	}
    	return Color.black;

    }

    /* Returns the current size */
    private double getCurrentSize() {
    	int val = sizeSlider.getValue();
    	return val;
    }

    /* Called whenever the user clicks the mouse */
    public void mouseClicked(MouseEvent e) {
        GStar star = new GStar(getCurrentSize());
        star.setFilled(true);
        star.setColor(getCurrentColor());
        add(star, e.getX(), e.getY());
    }

    /* Called whenever an action event occurs */
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Clear")) {
            removeAll();
        }
    }

    /* Private constants */
    private static final int MIN_SIZE = 1;

    private static final int MAX_SIZE = 50;

    private static final int INITIAL_SIZE = 16;

    /* Private instance variables */
    private JSlider sizeSlider;

    private JComboBox colorChooser;

}
