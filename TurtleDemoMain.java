package Turtle;
import ch.aplu.turtle.*;

public class TurtleDemoMain {
  public static void main(String[] args) {
    Turtle t1 = new Turtle();
    for(int i=0; i<4; i++) {
      t1.forward(50);
      t1.right(90);
      }
  }
}