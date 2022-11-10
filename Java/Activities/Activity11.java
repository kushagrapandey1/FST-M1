package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		HashMap<Integer, String> colours = new HashMap<>();
		colours.put(1,"blue");
		colours.put(2,"green");
		colours.put(3,"yellow");
		colours.put(4,"violet");
		colours.put(5,"red");
		System.out.println("Map:" + colours);
		colours.remove(2);
		System.out.println("Map after removing green colour: " + colours);
		System.out.println("Is green colour present in the Map:" + colours.containsValue("green"));
		System.out.println("Size of the Map:" + colours.size());

	}

}
