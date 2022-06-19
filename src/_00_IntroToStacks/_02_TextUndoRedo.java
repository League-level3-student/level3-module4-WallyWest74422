package _00_IntroToStacks;

import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	public static void main(String[] args) {
		_02_TextUndoRedo text = new _02_TextUndoRedo();
	text.setup();
	text.text();
	}
	JLabel label = new JLabel();
	Stack<Character> stack = new Stack<Character>();
    /* 
     * Create a JFrame with a JPanel and a JLabel.
     * 
     * Every time a key is pressed, add that character to the JLabel. It should
     * look like a basic text editor.
     * 
     * Make it so that every time the BACKSPACE key is pressed, the last
     * character is erased from the JLabel.
     * 
     * Save that deleted character onto a Stack of Characters.
     * 
     * Choose a key to be the Undo key. Make it so that when that key is
     * pressed, the top Character is popped  off the Stack and added back to
     * the JLabel.
     */

 void setup() {
JFrame frame = new JFrame();
frame.setSize(500, 500);
	frame.setVisible(true);
JPanel panel = new JPanel();

panel.add(label);
frame.add(panel);
	
frame.addKeyListener(this);

}

 void text(){

 }
 
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		String text = e.getKeyChar() + "";
		String existingText = label.getText();
		
 label.setText(existingText + text );
 if(e.getKeyChar()==KeyEvent.VK_BACK_SPACE) {
	 label.setText(existingText.substring(0, existingText.length() -1));
	 stack.push(existingText.charAt(existingText.length()-1));
	 System.out.println(stack);
	 }
 
 if(e.getKeyChar()==KeyEvent.VK_0) {
	 Character Undo1 = stack.pop();
	 String Undo = Undo1.toString();
	 System.out.println(Undo);
	 label.setText(existingText+ Undo);
 }
 }


		

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
 
	
	}
