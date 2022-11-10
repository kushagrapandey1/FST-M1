package activities;

interface BicycleParts{
	public int gears = 0;
	public int speed = 0;
}
interface BicycleOperations{
	public void applyBrake(int decrement);
	public void speedUp(int increment);
}
class Bicycle implements BicycleParts,BicycleOperations{
	int gears;
	int currentspeed;
	public Bicycle(int gears, int currentspeed) {
		this.gears = gears;
		this.currentspeed = currentspeed;
	}
	public void applyBrake(int speedreduction) {
		currentspeed = currentspeed - speedreduction;
		System.out.println("Current speed: " + currentspeed);
	}
	public void speedUp(int speedadd) {
		currentspeed = currentspeed + speedadd;
		System.out.println("Current speed: " + currentspeed);
	}
	public void bicycleDesc() {
		System.out.println("No: of gears " +gears);
		System.out.println("Current Speed is " + currentspeed);
	}
}
class MountainBike extends Bicycle{
	public int seatHeight;
	public MountainBike(int seatHeight, int gears, int currentspeed ) {
		super(gears,currentspeed);
		this.seatHeight = seatHeight;
	}
	public void setHeight(int height) {
	    seatHeight = height;
	}
	public void bicycleDesc() {
		super.bicycleDesc();
		System.out.println("Seat Height is " +seatHeight );
		}
}
public class Activity7 {
	public static void main(String[] args) {
		MountainBike bike = new MountainBike(25,3,0);
		bike.bicycleDesc();
		bike.speedUp(20);
		bike.applyBrake(5);

	}

}
