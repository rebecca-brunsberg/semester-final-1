import edu.fcps.karel2.Display;
import org.asl.karelx.Farmer;

/**
 * Rebecca Brunsberg
 * Challenge 3 
 * 
 */
public class TestChallenge3 {


 public static void main(String[] args) {
   Display.openWorld("maps/farm.map");
   Display.setSize(12, 12);
   
   BeepFarmer jo = new BeepFarmer(5, 6, 0);
   jo.teleport(3, 5);
   jo.reap(3, 6);
 
   jo.teleport(1,1);
   while(jo.hasBeepers()){
     jo.putBeeper();
   }
   jo.sideStepRight();
 }

}
