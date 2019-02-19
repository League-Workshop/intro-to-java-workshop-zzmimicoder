package section2;
import java.awt.Color;
import java.util.Random;
import org.jointheleague.graphical.robot.Robot;
public class MyFirstJavaProgram {	
	public static void main(String[] args) {
		Robot Zander = new Robot();
		Random RandInt = new Random();
		Zander.penDown();
		Zander.setSpeed(1080);
		for (int X = 0; X < 4; X++) {
			Zander.setPenColor(RandInt.nextInt(256), RandInt.nextInt(256), RandInt.nextInt(256));
			Zander.sparkle();
			Zander.move(100);
			Zander.turn(90);
		}
	}
}
