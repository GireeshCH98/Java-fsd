package com.learning.core.Phase1PracticeProject;
//Writing a program in Java to implement access modifiers

public class Phase1SN02 
{
	public int publicVariable = 10; // Public variable

	protected int protectedVariable = 20; // Protected variable

	int defaultVariable = 30; // Default variable
	
	private int privateVariable = 40; // Private variable

	// Public method
	public void publicMethod(){
		System.out.println("This is a Public method");
	}

	// Protected method
	protected void protectedMethod(){
		System.out.println("This is a Protected method");
	}

	// Default method
	void defaultMethod(){
		System.out.println("This is a Default method");
	}

	// Private method
	private void privateMethod() {
		System.out.println("This is a Private method");
	}

	// Main method to test access modifiers
	public static void main(String[] args) {
		Phase1SN02 obj = new Phase1SN02();

	    // Accessing variables and methods within the same class
	    System.out.println("Public variable: " + obj.publicVariable);
	    System.out.println("Protected variable: " + obj.protectedVariable);
	    System.out.println("Default variable: " + obj.defaultVariable);
	    System.out.println("Private variable: " + obj.privateVariable);

	    obj.publicMethod();
	    obj.protectedMethod();
	    obj.defaultMethod();
	    obj.privateMethod();
	}
}
