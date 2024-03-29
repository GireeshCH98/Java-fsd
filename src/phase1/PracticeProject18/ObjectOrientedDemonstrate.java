//Write a program in Java to demonstrate the uses of classes, objects, and the object-oriented pillars in Java
package phase1.PracticeProject18;

//Class representing a Vehicle
class Vehicle {
// Properties
private String brand;
private String model;
private int year;

// Constructor
public Vehicle(String brand, String model, int year) {
   this.brand = brand;
   this.model = model;
   this.year = year;
}

// Encapsulation: Getters and setters
public String getBrand() {
   return brand;
}

public void setBrand(String brand) {
   this.brand = brand;
}

public String getModel() {
   return model;
}

public void setModel(String model) {
   this.model = model;
}

public int getYear() {
   return year;
}

public void setYear(int year) {
   this.year = year;
}

// Abstraction: Display vehicle information
public void displayInfo() {
   System.out.println("Brand: " + brand);
   System.out.println("Model: " + model);
   System.out.println("Year: " + year);
}
}

//Subclass representing a Car (Inheritance)
class Car extends Vehicle {
// Additional properties specific to Car
private int numberOfDoors;

// Constructor
public Car(String brand, String model, int year, int numberOfDoors) {
   super(brand, model, year);
   this.numberOfDoors = numberOfDoors;
}

// Polymorphism: Overriding displayInfo() method
@Override
public void displayInfo() {
   super.displayInfo();
   System.out.println("Number of doors: " + numberOfDoors);
}
}

public class ObjectOrientedDemonstrate {
public static void main(String[] args) {
   // Creating objects of Vehicle and Car classes
   Vehicle vehicle = new Vehicle("Toyota", "Camry", 2021);
   Car car = new Car("Honda", "Accord", 2020, 4);

   // Accessing properties using getters and setters
   vehicle.setYear(2022);
   System.out.println("Year of Vehicle: " + vehicle.getYear());

   // Abstraction: Displaying information
   System.out.println("\nVehicle Information:");
   vehicle.displayInfo();

   System.out.println("\nCar Information:");
   car.displayInfo();
}
}


