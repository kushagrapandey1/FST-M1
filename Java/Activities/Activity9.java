package activities;

import java.util.ArrayList;
import java.util.Scanner;


public class Activity9 {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("aruna");
		myList.add("anusha");
		myList.add("ahavya");
		myList.add("supriya");
		myList.add("jahnavi");
		System.out.println("List of names:");
		for(int i=0 ; i<myList.size(); i++)
		{
			System.out.println(myList.get(i));
		}
		System.out.println("Third name in the list: " + myList.get(2));
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Name: ");  
		String str= sc.nextLine();
		System.out.println("Is " + str.toLowerCase() + " in the list: " + myList.contains(str.toLowerCase()));
		System.out.println("No: of names in the list : " + myList.size());
		myList.remove("jahnavi");
		System.out.println("No: of names in the list : " + myList.size());
	}
	
}
