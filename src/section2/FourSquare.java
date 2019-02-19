package section2;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;public class FourSquare {
	Robot Bobby = new Robot();
	void go() {
		Bobby.setSpeed(100);
		Bobby.penDown();
		Bobby.setPenWidth(5);
		for (int X = 0; X < 4; X++) {
			Bobby.setRandomPenColor();
			drawSquare();
			Bobby.turn(90);
		}
	}
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		for (int X = 0; X < 4; X++) {
			Bobby.move(100);
			Bobby.turn(90);
		}
	}
	public static void main(String[] args) {
		new FourSquare().go();
	}
}



