package section3;

import javax.swing.JOptionPane;

public class WorldDomination {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			// 1. Ask the user if they know how to write code.
			String worldDomination = JOptionPane.showInputDialog(null, "Do you know how to write code?");
			// 2. If they say "yes", tell them they will rule the world.
			if (worldDomination.equals("yEs")) {
				JOptionPane.showMessageDialog(null, "YOU WILL RULE THE WORLD!");

				// 3. Otherwise, wish them good luck washing dishes.

			} else {
				JOptionPane.showMessageDialog(null, "GUD LUK WUSHING DISHUS!!!!!!");
			}
		}
	}
}
