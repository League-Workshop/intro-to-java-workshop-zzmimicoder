package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String Answer = JOptionPane.showInputDialog("Can You Write Code?");

		// 2. If they say "yes", tell them they will rule the world.
		if (Answer.equals("Yes") || Answer.equals("yes") || Answer.equals("Y") || Answer.equals("y") || Answer.equals("Yeah") || Answer.equals("yeah") ||
				Answer.equals("Yep") || Answer.equals("yep")) {
			JOptionPane.showMessageDialog(null, "You Will Rule The World.");
		}
		
		// 3. Otherwise, wish them good luck washing dishes.
		if (Answer.equals("No") || Answer.equals("no") || Answer.equals("Nope") || Answer.equals("nope")) {
			JOptionPane.showMessageDialog(null, "Good Luck Washing Dishes.");
		}
	}
}

