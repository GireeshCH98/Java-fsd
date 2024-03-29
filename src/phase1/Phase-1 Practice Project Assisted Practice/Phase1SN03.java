package com.learning.core.Phase1PracticeProject;
//Writing a program in Java to verify implementations of methods and ways of calling a method

public class Phase1SN03 
{
	public void printHello() {
        System.out.println("Hello!");
    }

    // Method with parameters and return type
    public int add(int a, int b) {
        return a + b;
    }

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method");
    }

    // Main method
    public static void main(String[] args) 
    {
    	Phase1SN03 obj = new Phase1SN03();

        // 1. Calling instance method using object
        obj.printHello();

        // 2. Calling instance method directly from static method
        staticMethod(); // Note: Here staticMethod is called without an object reference

        // 3. Calling static method using class name
        Phase1SN03.staticMethod();

        // 4. Calling method with parameters and return type
        int result = obj.add(5, 3);
        System.out.println("Result of addition: " + result);

        // 5. Calling method with return type without storing the result
        obj.add(10, 20); // Result is not stored

        // 6. Calling a method and ignoring the return value
        obj.printHello(); // No need to store the return value if not used

        // 7. Calling a method inside a conditional statement
        if (obj.add(1, 2) > 5) {
            System.out.println("Sum is greater than 5");
        } else {
            System.out.println("Sum is less than or equal to 5");
        }
    }
}
