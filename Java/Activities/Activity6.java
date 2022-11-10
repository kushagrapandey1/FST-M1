package activities;
import java.util.*;
class Plane{
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
	public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }
	public void onboard(String passenger) {
        this.passengers.add(passenger);
    }
	public Date takeOff() {
        //this.lastTimeTookOf = new Date();
		lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }
	public void land() {
		this.lastTimeLanded = new Date();
		passengers.clear();
	}
	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}
	public List<String> getPassesngers(){
		return passengers;
	}
}
public class Activity6 {

	public static void main(String[] args) throws InterruptedException{
		Plane plane = new Plane(10);
		plane.onboard("Aruna");
		plane.onboard("Anusha");
		plane.onboard("Bhavya");
		System.out.println("Plane Take-off time is " + plane.takeOff());
		System.out.println("List of passengers in the plane " + plane.getPassesngers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Time of landing " + plane.getLastTimeLanded());
		}

}
