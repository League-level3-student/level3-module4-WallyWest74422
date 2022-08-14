package _03_Hangman;

import java.util.Stack;
import java.util.stream.IntStream;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Hangman {
	public static void main(String[] args) {
		String word;
		Stack<String> stack = new Stack<String>();
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

		word = stack.pop();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel(word);
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.setSize(500, 500);
int chars = word.length();
label.setText(word.replace("", "_"));
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
