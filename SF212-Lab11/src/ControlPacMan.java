/*
 * File: ControlPacMan.java
 * -------------------------
 */

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;

import acm.program.*;

public class ControlPacMan extends GraphicsProgram {

    /* Initializes the graphical user interface */
    public void init() {
    	add(new JButton("Start"), SOUTH);
    	add(new JButton("Stop"), SOUTH);
    	add(new JLabel("Slow"), SOUTH);
    	speedSlider = new JSlider(MIN_SIZE, MAX_SIZE, INITIAL_SIZE);
    	add(speedSlider,SOUTH);
    	add(new JLabel("Fast"), SOUTH);
    	addActionListeners();
    }

    public void run() {
        pacman = new GPacMan(RADIUS);
        add(pacman, -RADIUS, getHeight() / 4);
        stop = true;
        while (true) {
            if (!stop)
                movePacman();
            pause(PAUSE_TIME);
        }
    }

    /* Move pacman */
    private void movePacman() {
    	pacman.move(getCurrentSpeed(), 0);
    	pacman.openMouth();
    	if(pacman.getX() >= getWidth()/2 + pacman.getWidth()/2) {
    		pacman.setLocation(-RADIUS, getHeight()/4);
    	}
    }

    /* Returns the current size */
    private double getCurrentSpeed() {
        return speedSlider.getValue();
    }

    /* Called whenever an action event occurs */
    public void actionPerformed(ActionEvent e) {
    	String pressBut = e.getActionCommand();
    	if(pressBut.equals("Start")) {
    		stop = false;
    	}else {
    		stop = true;
    	}
    }

    /* Private constants */
    private static final int MIN_SIZE = 1;

    private static final int MAX_SIZE = 10;

    private static final int RADIUS = 20;

    private static final int PAUSE_TIME = 20;

    private static final int INITIAL_SIZE = 5;

    /* Private instance variables */
    private GPacMan pacman;

    private JSlider speedSlider;

    private boolean stop;
}
