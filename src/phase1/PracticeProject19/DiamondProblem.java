//Write a program in Java to resolve the diamond problem using OOPs’ concepts
package phase1.PracticeProject19;

//Interface A
interface A {
default void display() {
   System.out.println("Interface A");
}
}

//Interface B extending A
interface B extends A {
default void display() {
   System.out.println("Interface B");
}

//Interface C extending A
interface C extends A {
default void display() {
   System.out.println("Interface C");
}
}

//Class implementing both B and C interfaces
class D implements B, C {
// Resolving the diamond problem by overriding the display() method
@Override
public void display() {
   B.super.display(); // Call display() method of interface B
   C.super.display(); // Call display() method of interface C
}
}

public class DiamondProblem {
public static void main(String[] args) {
   D d = new D();
   d.display(); // Output: Interface B Interface C
}
}
