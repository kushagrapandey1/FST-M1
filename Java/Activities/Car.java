package activities;

public class Car {
	String Color, transmission;
	int make, tyres, doors;
	Car(){
		tyres = 4;
		doors = 4;
		}
	void displayCharacteristics() {
		System.out.println("Car Color is " + Color + "\nCar transmission is " + transmission + "\nCar is made on " + make + "\nCar has " + tyres + " tyres" + "\nCar has " + doors + " doors");
	}
	void accelarate() {
		System.out.println("Car is moving forward");
	}
	void brake() {
		System.out.println("Car has stopped");
	}
}
