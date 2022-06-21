package _01_TestMatchingBrackets;

import java.util.Stack;

public class TestMatchingBrackets {
	/*
	 * Use a Stack to complete the method for checking if every opening bracket has
	 * a matching closing bracket
	 */
	public static boolean doBracketsMatch(String b) {
		int stackSize = 0;
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < b.length(); i++) {
			if (b.substring(i, i + 1).equals("{")) {
				stack.push("{");
				System.out.println(stack);
				System.out.println(stack.size());
			} else if (b.substring(i, i + 1).equals("}")) {
				if(stack.size()>0) {
					stack.pop();
					System.out.println(stack);
				}
				System.out.println(stack);
			}
			stackSize = stack.size();
		}
		if (stack.size() == 0) {
			return true;
		}
		return false;
	}
}