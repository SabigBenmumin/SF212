import acm.program.GraphicsProgram;

public class GStoplightDemo extends GraphicsProgram {
  public void run() {
    GStoplight stoplight = new GStoplight();
    add(stoplight, getWidth() / 2, getHeight() / 2);
    stoplight.setColor("RED");

  }

}
