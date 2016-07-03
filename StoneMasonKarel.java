/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
	public void run(){
		//check to see if K is facing north, check for beepers, drop beeper if none found, move and repeat to wall
		//check to see if 1x1
		//starts program facing east at (1,1)
		boolean notEnd = true;
		
		
		while(true){
			if(!frontIsClear()){
				notEnd = false;
			}
			turnLeft();//point north
			moveNorth();
			if(!notEnd)break;
			moveColumn();
		}
		
		
	}
	public void moveColumn(){
		turnLeft();
		move();move();move();move();
		return;
	}
	public void moveNorth(){
		while(true){
			if(noBeepersPresent()) putBeeper();
			if(frontIsClear()){
				move();
			}
			else{
				turnLeft();turnLeft();//turning around to head back to beginning
				while(frontIsClear()){//gets us back to beginning
					move();
				}
				return;
			}
		}
		
	}
}

