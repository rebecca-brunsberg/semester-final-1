import org.asl.karelx.Wanderer;

/**
 * Represents a horse wandering around aimlessly in a pasture
 *
 */
public class Horse extends Wanderer {
  
  public Horse(){
    super(1, 1);
  }
  public Horse(int x, int y){
    super(x, y);
  }

 //  TODO Add one or more constructors, as needed
 
 /**
  * Wander around in random directions until a specified number of steps have been taken.
  * At regular intervals specified by timer, drop a beeper.
  * 
  * @param count  the total number of steps to take
  * @param timer  the interval at which to drop a beeper
  * 
  * Ex. horse.wander(13, 4) should drop a beeper every four steps until thirteen steps are taken
  */
 public void wander(int count, int timer) {
   int i=0;
   while(i<count){
  wander();
  i++;
  if(i%timer==0){
    putBeeper();
  }
  
// TODO You implement this
   }
 }
}
