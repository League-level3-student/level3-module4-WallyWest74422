package _00_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
    public static void main(String[] args) {
        // 1. Create a Stack of Doubles
        //    Don't forget to import the Stack class
Stack<Double> nums = new Stack<Double>();
        // 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
Random ran = new Random(100);
for(int i=0; i<100; i++) {
	nums.push(ran.nextDouble());
}
System.out.println(nums.size());
        // 3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
String bothNums = JOptionPane.showInputDialog("Please enter two numbers between 0 and 100 (in ascending order) with a space in between the two");
System.out.println(bothNums);
String[] separateNums = bothNums.split(" ");
int num1 = Integer.parseInt(separateNums[0]);
int num2 = Integer.parseInt(separateNums[1]);
System.out.println(num1);
System.out.println(num2);
        // 4. Pop all the elements off of the Stack. Every time a double is popped that is
        //    between the two numbers entered by the user, print it to the screen.
for (int j = 0; j < nums.size(); j++) {
Double poppedDouble =nums.pop();
System.out.println(poppedDouble);
if(poppedDouble>num1 && poppedDouble<num2) {
	System.out.println(poppedDouble);
}
}

        // EXAMPLE:
        // NUM 1: 65
        // NUM 2: 75

        // Popping elements off stack...
        // Elements between 65 and 75:
        // 66.66876846
        // 74.51651681
        // 70.05110654
        // 69.21350456
        // 71.54506465
        // 66.47984807
        // 74.12121224
    }
}
