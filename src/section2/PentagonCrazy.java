package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		// 1. Create a new Robot
		Robot Ryan = new Robot("mini");
		// 3. Put the robot's pen down
		Ryan.penDown();
		// 8. Make the robot go at maximum speed (100)
		Ryan.setSpeed(10000000);
		// 9. Set the pen to a color that you like for the shape
		Ryan.setPenColor(0, 255, 255);
		// 4. Make a variable for the number of sides you want (can’t test this one)
		int Sides = 5;
		// 5. Make a second variable for the angle you want the robot to turn. Hint: you can divide in Java using "/". Can’t test until step 6
		int Angle = 72;
		// 7. Use a for loop to repeat steps #2 to #11, 200 times. When this is done you should see a pentagon
		for (int X = 0; X < 200; X++) {	
			// 2. Move the robot 200 pixels
			Ryan.move(X);
			// 10. Change the previous line of code to make the robot move "i" pixels instead of 200 
			// 6. Turn the robot the amount in your angle variable
			Ryan.turn(Angle);
			// 11. Turn the robot one more degree
			Ryan.turn(1);
		}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}
