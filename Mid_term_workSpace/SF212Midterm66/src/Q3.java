/* 
 * Q3: School Bus
 * 
 * Name (in English):Sabig Benmumin
 * 
 * Student ID:6510742197
 * 
 */

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Q3 extends GraphicsProgram {

	/** Window Size **/
	private static final int WINDOW_WIDTH = 800;
	private static final int WINDOW_HEIGHT = 600;
	
	public void init() {
		setWidth(WINDOW_WIDTH);
		setHeight(WINDOW_HEIGHT);
	}
	
	// You fill in this part
	public void drawCircle(double x_position, double y_position, double circleSize) {
		GOval circle = new GOval(x_position, y_position, circleSize, circleSize);
		circle.setFilled(true);
		circle.setColor(Color.black);
		add(circle);
	}
	
	public void drawWindow(double x_posi, double y_posi) {
		double winWidth, winHeight;
		winWidth = 40;
		winHeight = 60;
		GRect window = new GRect(x_posi, y_posi, winWidth, winHeight);
		window.setFilled(true);
		window.setColor(Color.white);
		add(window);
	}
	public void run() {
		double center_x, center_y, carWidth, carHeight;
		center_x = getWidth()/2;
		center_y = getHeight()/2;
		carHeight = getHeight()/3.5;
		carWidth = carHeight * 2.5;
		GRect bigRect = new GRect(center_x-(carWidth/2), center_y-(carHeight/2), carWidth, carHeight);
		bigRect.setFilled(true);
		bigRect.setColor(Color.ORANGE);
		add(bigRect);
		double frontCarSize = carHeight/2;
		GRect frontCar = new GRect(center_x+(carWidth/2), center_y, frontCarSize, frontCarSize);
		frontCar.setFilled(true);
		frontCar.setColor(Color.ORANGE);
		add(frontCar);
		double cirSize = frontCarSize - (frontCarSize*0.2);
		double y_posiForCircle = center_y + frontCarSize - (cirSize/2);
		drawCircle(center_x+(carWidth/2), y_posiForCircle, cirSize);
		drawCircle(center_x-(carWidth/3), y_posiForCircle, cirSize);
		double x_windowstart_left = center_x - (carWidth/2) + 12;
		double y_window = center_y-(carHeight/2) + 12;
		for(int i = 0; i < 8; i++) {
			drawWindow(x_windowstart_left, y_window);
			x_windowstart_left += 10 + 40;
		}
	}
	

}

