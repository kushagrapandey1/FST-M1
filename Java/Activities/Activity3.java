package activities;

public class Activity3 {
	public static void main(String[] args) {
		double Seconds = 1000000000;
		double EarthSeconds = 31557600;
// Converting Mercury to seconds. Mercury = 0.24 EarthYears. So 0.24*earth seconds gives us actual Mercury value in seconds	
		double MercurySeconds = 0.2408467; 
		double VenusSeconds = 0.61519726;
		double MarsSeconds = 1.8808158;
		double JupiterSeconds = 11.862615;
		double SaturnSeconds = 29.447498;
		double UranusSeconds = 84.016846;
		double NeptuneSeconds = 164.79132;
		System.out.println("Age on Earth = " + Seconds / EarthSeconds);
		System.out.println("Age on Mercury = " + Seconds / (MercurySeconds*EarthSeconds));
		System.out.println("Age on Venus = " + Seconds / (VenusSeconds*EarthSeconds));
		System.out.println("Age on Mars = " + Seconds / (MarsSeconds*EarthSeconds));
		System.out.println("Age on Jupiter = " + Seconds / (JupiterSeconds*EarthSeconds));
		System.out.println("Age on Saturn = " + Seconds / (SaturnSeconds*EarthSeconds));
		System.out.println("Age on Uranus = " + Seconds / (UranusSeconds*EarthSeconds));
		System.out.println("Age on Neptune = " + Seconds / (NeptuneSeconds*EarthSeconds));
		  
		
	}
}
