package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
String answer1 =	JOptionPane.showInputDialog(null, "what is the fastest particle in the universe that we know of?")	;
		// 3.  Use an if statement to check if their answer is correct
		if (answer1.equals("neutrino")) {
		// 4.  if the user's answer is correct
		JOptionPane.showMessageDialog(null, "CORRECT");
			score = score+1;
		}else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
			score=score-1;
		}
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answer2 =	JOptionPane.showInputDialog(null, "what is the most powerful explosion in the universe that we know of?")	;
		if (answer2.equals("gamma ray explosion")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			score = score+1;
		}else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
			score=score-1;
		}
		String answer3 =	JOptionPane.showInputDialog(null, "how many limbs do dragons have(wings included)?")	;
		if (answer3.equals("six")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			score = score+1;
		}else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
			score=score-1;
		}
		String answer4 =	JOptionPane.showInputDialog(null, "what does laser stand for?")	;
		if (answer4.equals("Light Amplification by Stimulated Emission of Radiation")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			score = score+1;
		}else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
			score=score-1;
		}
		String answer5 =	JOptionPane.showInputDialog(null, "if you find four points on"+
		" the outside of the sphere and connect them, what is the probability"+
				" that the center of the sphere is in the shape that they make?")	;
		if (answer5.equals("1/8")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			score = score+12;
		}else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
			score=score-4;
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "your score is "+score);
	}
}
