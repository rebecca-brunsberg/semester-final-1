import org.asl.karelx.Farmer;

/**
 * Represents a farmer capable of sowing or reaping beepers from a rectangular garden
 * Rebecca Brunsberg
 * 15th December 2014
 *
 */
public class BeepFarmer extends Farmer {
  
  public BeepFarmer(){
    super();
  }

  public BeepFarmer(int x, int y, int beep){
    super(x, y, beep);
    
  }

 
 /**
  * Access all locations in a rectangular garden and pick up any beepers found
  * 
  * Precondition: Farmer is starting in the southwest corner of the area to be harvested.
  * 
  * @param width   the width of the garden (number of columns)
  * @param height  the height of the garden (number of rows)
  * 
  * Ex. reap(7, 4) should gather all beepers from an area 7 rows wide and 4 rows tall
  */
 public void reap(int width, int height) {
   int startY= this.getY();
  
   for(int j=1; j<=width; j++){
     int startX = this.getX();
   for (int i=1; i<=height; i++){
     while (nextToABeeper()){
       pickBeeper();
     }
     if(i<height){
     move();
     }
     while (nextToABeeper()){
       pickBeeper();
     }
   }
   teleport(startX+1,startY);
   }
 }
 
 /**
  * Access all locations in a rectangular garden and plant one beeper at each location
  * 
  * Precondition: Farmer is starting in the southwest corner of the area to be sown.
  * 
  * @param width  the width of the garden (number of columns)
  * @param height the height of the garden (number of rows)
  */
 public void sow(int width, int height) {
  int startX = this.getX();
  int startY = this.getY();
  for (int i = 0; i< width; i++) {
   for (int j = 0; j<height; j++) {
    teleport(startX+i, startY+j);
    if (this.hasBeepers()) {
     putBeeper();
    }
   }
  }
 }
}
