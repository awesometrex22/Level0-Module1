package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle1 = JOptionPane.showInputDialog("What has to be broken before you use it?");
		String riddle2 = JOptionPane.showInputDialog("What tastes better than it smells?");
		String riddle3 = JOptionPane.showInputDialog("What has a bottom at the top?");
		String riddle4 = JOptionPane.showInputDialog("During which month do people sleep the least?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (riddle1.equals("an egg")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score+=1;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "incorrect the answer was an egg");
		}

		// 6. Add some more riddles
		if (riddle2.equals("a tongue")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "incorrect the answer was a tongue");
		}
		if (riddle3.equals("legs")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "incorrect the answer was legs");
		}
		if (riddle4.equals("february")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "incorrect the answer was february");
		}
		
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "your score was "+score);
		
	}
}

