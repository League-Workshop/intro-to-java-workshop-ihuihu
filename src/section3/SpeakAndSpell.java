package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		// 2. Catch the user's answer in a String
String name = JOptionPane.showInputDialog(null, "what is your name?");
String word = "diabolical";
String words = (name+"        spell         " + word +".");
speak(words);
		// 3. If the user spelled the word correctly, speak "correct"
String words1 = JOptionPane.showInputDialog(null, "enter your answer " + name );
		// 4. Otherwise say "wrong"
if (words1.equals("doofus")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
		// 5. repeat the process for other words
}else{
	JOptionPane.showMessageDialog(null, "YOU NOOB");
	JOptionPane.showMessageDialog(null, "IDIOT");
	JOptionPane.showMessageDialog(null, word+" is spelled "+word);
	
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

