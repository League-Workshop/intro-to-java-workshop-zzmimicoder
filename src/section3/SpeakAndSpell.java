package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {
	public static void main(String[] args) {
		speak("Pneumonoultramicroscopicsilicovolcanoconiosis");
		String ans = JOptionPane.showInputDialog("What Do You Think This Word Is?\n(Do Not Capitalize The First Letter)");
		if (ans == "pneumonoultramicroscopicsilicovolcanoconiosis") {
			speak("Correct");
		} else {
			speak("Wrong");
		}
		speak("Antidisestablishmentarianism");
		ans = JOptionPane.showInputDialog("What Do You Think This Word Is?\n(Do Not Capitalize The First Letter)");
		if (ans == "Antidisestablishmentarianism") {
			speak("Correct");
		} else {
			speak("Wrong");
		}
		speak("Methionylthreonylthreonyglutaminylarginylisoleucine");
		ans = JOptionPane.showInputDialog("What Do You Think This Word Is?\n(Do Not Capitalize The First Letter)");
		if (ans == "methionylthreonylthreonyglutaminylarginylisoleucine") {
			speak("Correct");
		} else {
			speak("Wrong");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


