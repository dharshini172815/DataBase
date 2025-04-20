package Inheritance;

class Vehicle {
	String brand = "Honda";

	void startEngine() {
		System.out.println("Engine started.");
	}
}

class Car extends Vehicle {
	int wheels = 4;

	void drive() {
		System.out.println("Car is driving.");
	}
}

public class Main {
	public static void main(String[] args) {
		Car myCar = new Car();

		System.out.println("Brand: " + myCar.brand); 
		myCar.startEngine();                          

		System.out.println("Wheels: " + myCar.wheels);
		myCar.drive();                                
	}
}

