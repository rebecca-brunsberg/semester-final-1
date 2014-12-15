import edu.fcps.karel2.Robot;
import org.asl.karelx.Uberbot;
import edu.fcps.karel2.Display;


/**
 * Rebecca Brunsberg
 * Challenge 1
 * 15th December 2014
 */

public class TestChallenge1 {

 public static void main(String[] args) {
   Display.openWorld("maps/default.map");
   //Display.setSize(10, 10);
   
   Squarebot square = new Squarebot(9, 3);
   square.layCorners(5);
   
   Sentry guard = new Sentry(4, 3);
   guard.patrol();
  
 }

}
