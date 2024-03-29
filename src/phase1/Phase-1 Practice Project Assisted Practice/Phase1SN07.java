package com.learning.core.Phase1PracticeProject;
//Writing a program in Java to verify the implementation of inner classes

public class Phase1SN07 
{
	private int outerVar = 10;

	// Inner class
	class InnerClass {
		public void display() 
		{
			System.out.println("Inner class method: outerVar = " + outerVar);
	    }
	}

	// Method to access inner class
	public void accessInnerClass() {
		InnerClass inner = new InnerClass();
	    inner.display();
	}

	// Main method
	public static void main(String[] args) {
		Phase1SN07 outer = new Phase1SN07();
	    outer.accessInnerClass();
	}
}
