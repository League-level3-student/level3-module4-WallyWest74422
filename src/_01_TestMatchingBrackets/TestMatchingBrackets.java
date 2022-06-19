package _01_TestMatchingBrackets;

import java.util.Stack;

public class TestMatchingBrackets {
    /*
     * Use a Stack to complete the method for checking if every opening bracket
     * has a matching closing bracket
     */
    public static boolean doBracketsMatch(String b) {
    	Stack<String> stack = new Stack<String>();
for(int i=0; i<b.length()+10; i++) {
	if(b.subSequence(0+i, i+1)=="{") {
		stack.push("{");
		System.out.println(stack);
		System.out.println(stack.size());
	}else if(b.subSequence(0+i, i+1)=="{") {
		stack.pop();
		System.out.println(stack);
	}
	
	if(i>b.length()) {
		if(stack.size()!=0) {
			return false;
		}
	}
}

        return true;
    }
}