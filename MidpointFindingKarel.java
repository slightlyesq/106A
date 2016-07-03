/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	// You fill in this part
	
public void run(){
	int size = 1;
	while(true){
		if(frontIsClear()){
			move();
			size++;
		}
		else {
			break;
		}
	}
		int remainder = size%2;
		int midpoint = size/2;
		turnLeft();turnLeft();
		if(remainder == 1) move();
		for(int x =0;x<midpoint-1;x++) move();
		putBeeper();
}
	
}
