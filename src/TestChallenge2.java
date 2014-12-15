import edu.fcps.karel2.Display;

/**
 * Read and implement all of the TODO items in the main method, below.
 * Rebecca Brunsberg
 * 15th December 2014
 * 
 */
public class TestChallenge2 {

 public static void main(String[] args) {
   Display.openWorld("maps/pasture.map");
   Display.setSize(15, 15);
   
   Horse karel =  new Horse(6, 4);
   karel.wander(36,7);
   
   karel.explode();
  
 }

}
