package activities;

import java.util.HashSet;
import java.util.Scanner;

public class Activity10 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("o1");
		hs.add("o2");
		hs.add("o3");
		hs.add("o4");
		hs.add("o5");
		hs.add("o6");
		System.out.println("Size of the Hash set: " + hs.size());
		hs.remove("o6");
		if (hs.remove("O7"))
		{
			System.out.println("07 removed from the Set");
		}
		else
		{
			System.out.println("O7 not found in the Set");
		}
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any object name: ");  
		String str= sc.nextLine();
		System.out.println("Is " + str.toLowerCase() + " present in the Set: " + hs.contains(str.toLowerCase())); 
		System.out.println("Updated HasSet: " + hs);
	}

}
