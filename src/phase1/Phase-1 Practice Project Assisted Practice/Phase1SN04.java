package com.learning.core.Phase1PracticeProject;
//Writing a program in Java to verify the implementations of constructor types

public class Phase1SN04 
{
	private int num;
    private String name;

    // Default constructor
    public Phase1SN04() {
        System.out.println("Default Constructor called");
        this.num = 0;
        this.name = "Default";
    }

    // Parameterized constructor
    public Phase1SN04(int num, String name) {
        System.out.println("Parameterized Constructor called");
        this.num = num;
        this.name = name;
    }

    // Copy constructor
    public Phase1SN04(Phase1SN04 obj) {
        System.out.println("Copy Constructor called");
        this.num = obj.num;
        this.name = obj.name;
    }

    // Method to display object details
    public void display() {
        System.out.println("Number: " + num);
        System.out.println("Name: " + name);
    }

    // Main method
    public static void main(String[] args) {
        // Create objects using different constructors
    	Phase1SN04 obj1 = new Phase1SN04();
    	Phase1SN04 obj2 = new Phase1SN04(10, "Parameterized");
    	Phase1SN04 obj3 = new Phase1SN04(obj2);

        // Display object details
        System.out.println("Object 1:");
        obj1.display();
        System.out.println();

        System.out.println("Object 2:");
        obj2.display();
        System.out.println();

        System.out.println("Object 3 (Copy of Object 2):");
        obj3.display();
    }
}
