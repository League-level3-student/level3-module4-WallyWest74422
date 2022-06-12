package _00_IntroToStacks;

import java.util.Stack;

public class _00_StackDemo {
    public static void main(String[] args) {
        /*
         * A Stack is a data structure that maintains the order of the objects
         * added to it. The push() method is used to add objects to a Stack
         * and the pop() method is used to remove the *most recently added*
         * object from the Stack. For example, if 3 String objects are pushed,
         * i.e. added, to a Stack
         * Stack<String> myStack = new Stack<String>();
         * myStack.push("A");                   // oldest object added
         * myStack.push("B");
         * myStack.push("C");                   // newest object added
         * String topOfStack = myStack.pop()    // returns "C" 
         * the String "C" is removed when the pop() method is called. The pop()
         * method also returns a value that can be stored in a variable. Note
         * that every time the pop() method is called the size of the stack is
         * decreased by 1 even if the value isn't saved in a variable.
         * 
         * The most recent object added to a Stack is the 'top' or 'head' of
         * the Stack. Normally, adding and removing objects from the middle of
         * a Stack is not allowed. This maintains the order of the Stack where
         * the first object added is the last object out of the Stack. This
         * ordering is called First In Last Out, or FILO for short. 
         *      push on top-+    +-> next to be removed    
         *                   \  /
         *                    "C"
         *                    "B"
         *                    "A" -> first object pushed, last to be removed
         *                    
         * Note: calling the pop() method on an empty stack will cause
         * an error. The avoid this, the Stack isEmpty() or size() methods
         * can be called beforehand to make sure this stack isn't empty.
         */
        
        /*
         * Initializing a Stack of Strings
         */
        System.out.println("Here is a Stack of Strings: \n");

        Stack<String> flavors = new Stack<String>();
        flavors.push("Strawberry");
        flavors.push("Mint");
        flavors.push("Chocolate");
        flavors.push("Apple");
        flavors.push("Vanilla");
        flavors.push("Mango");

        /*
         * Since Mango was the last one pushed, it will be the first one popped.
         * The pop() method reduces the size of the Stack by 1
         */
        System.out.println("Stack size: " + flavors.size());
        System.out.println("Popping 2 elements off the top of the stack:");
        
        String topOfStack = flavors.pop();
        System.out.println(topOfStack);
        System.out.println(flavors.pop());

        /*
         * Getting the size of the Stack
         * Notice the size is smaller by 2 after two pop() methods are called
         * regardless of whether the return value of the pop() was saved into
         * a variable.
         */
        System.out.println("Stack size: " + flavors.size());
        
        /*
         * Looping through the Stack and clearing it
         */
        System.out.println("\nPopping all the Strings off the Stack:");
        while( ! flavors.isEmpty() ) {
            System.out.println(flavors.pop());
        }
        
        System.out.println("Stack size: " + flavors.size());
    }
}
