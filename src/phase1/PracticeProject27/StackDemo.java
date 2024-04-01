//Write a program in Java to insert and remove elements in a stack
package phase1.PracticeProject27;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Inserting elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Displaying the stack after insertion
        System.out.println("Stack after insertion: " + stack);

        // Removing an element from the stack
        int removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);

        // Displaying the stack after removal
        System.out.println("Stack after removal: " + stack);

        // Peeking at the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top element of the stack: " + topElement);
    }
}
