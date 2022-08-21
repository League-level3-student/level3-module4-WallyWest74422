package _03_Hangman;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Array;
import java.util.Stack;
import java.util.stream.IntStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Hangman implements KeyListener {
	Integer testint = 5;
	String testString = testint.toString();
	String word;
	String output = "";
	JLabel label = new JLabel(word);
	JButton playAgain = new JButton("Yes");
	JButton noPlayAgain = new JButton("No");
	int numLives = 5;
	JLabel lives = new JLabel("Lives:" + numLives);
	StringBuilder builder = new StringBuilder();
	String UnderScore = "_";
	Stack<String> stack = new Stack<String>();
	String regEx = "";

	public static void main(String[] args) {
		Hangman hangman = new Hangman();
		hangman.setup();
	}

	void setup() {

		Utilities util = new Utilities();
		int maxWords = util.getTotalWordsInFile("dictionary.txt");
		String numWords1 = JOptionPane.showInputDialog(
				"Please select the number of words that you would like to guess. (Between 1 and " + maxWords + ").");
		int numWords = Integer.parseInt(numWords1);
		for (int i = 0; i < numWords; i++) {
			String randomLine = util.readRandomLineFromFile("dictionary.txt");
			if (stack.contains(randomLine)) {
				stack.push(util.readRandomLineFromFile("dictionary.txt"));
			} else {
				stack.push(randomLine);
			}
		}
		System.out.println("stack size " + stack.size());
		word = stack.pop();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(label);
		panel.add(lives);
		panel.add(playAgain);
		panel.add(noPlayAgain);
		frame.setVisible(true);
		frame.setSize(500, 500);
		if (numLives == 0) {
			playAgain.setVisible(true);
			noPlayAgain.setVisible(true);
		} else {
			playAgain.setVisible(false);
			noPlayAgain.setVisible(false);
		}

		regEx = "[a-z]";
		output = word.replaceAll(regEx, "_");
	//	System.out.println(word);
		builder.append(output);
		label.setText(output);


		frame.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {

		// TODO Auto-generated method stub

		if (builder.lastIndexOf(UnderScore) != -1) {

			char guess = e.getKeyChar();
			int index = word.indexOf(guess);
			System.out.println("Guess " + guess);
			System.out.println("Index of the guess " + index);
			System.out.println("Builder length " + builder.length());
			if (index > -1) {
				for (int k = 0; k < word.length(); k++) {
					if (guess == word.charAt(k)) {
						String substring = word.substring(k, k + 1);
						builder.replace(k, k + 1, substring);
						output = builder.toString();
						label.setText(builder.toString());
					}
					}
						System.out.println(builder.lastIndexOf(UnderScore));}
					else {
						System.out.println("Life lost.");
					numLives = numLives - 1;
					lives.setText("Lives:" + numLives);
				if(numLives==0){
					lives.setText("Game Over. :(");
					label.setText("The word was '" + word + "'.");
				}

				}
						if (output.equals(word)) {
							if (stack.isEmpty()) {
								label.setText("Congratulations! You Won! :)");
								
							}
							System.out.println("Word Guessed");
							System.out.println("Stack Size " + stack.size());
							word = stack.pop();
							regEx = "[a-z]";
							output = word.replaceAll(regEx, "_");
							builder = new StringBuilder();
							builder.append(output);
							label.setText(output);
	//						System.out.println(word);
						}
				
			
		}
		}

	

	
////		System.out.println("Life lost.");
////		numLives = numLives - 1;
//		lives.setText("Lives:" + numLives);
//	if(numLives==0){
//	{
//		lives.setText(" Game Over. Would you like to play again?");
//		label.setText("The word was " + word + ".");
//
//	}if(numLives==0)
//	{
//		playAgain.setVisible(true);
//		noPlayAgain.setVisible(true);
//	}else
//	{
//		playAgain.setVisible(false);
//		noPlayAgain.setVisible(false);
//	}
//
//	}}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}