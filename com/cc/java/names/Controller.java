package com.cc.java.names;

import java.util.ArrayList;
import java.util.Random;

public class Controller {

	// Deklaration + Init
	private static ArrayList<Cat> catsList = new ArrayList<>();
	private static ArrayList<Dog> dogsList = new ArrayList<>();
	private static Random random = new Random();
	
	
	public static void addNewDog(String name) {
		dogsList.add(new Dog(name));
	}
	
	public static void addNewCat(String name) {
		catsList.add(new Cat(name));
	}
	
	// ein Art Getter ...
	public static Dog getSomeRandomDog() {
		return dogsList.get(random.nextInt(dogsList.size()));
	}
	
	public static Cat getSomeRandomCat() {
		return catsList.get(random.nextInt(catsList.size()));
	}

	// Service ... ist pet eine Katze?? ja/nein
	public static boolean isCallerACat(Pet pet) {
		return catsList.contains(pet);
	}
	
}



