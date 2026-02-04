package com.cc.java.names;

public class Dog extends Pet{

	private String name;
	
	/**
	 * @param name
	 */
	public Dog(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String petSounds() {
		return this + " says: Bark!";
	}

	// irgendeine Katze nach dem Namen fragen cat.getName()
	public String askACat() {
		return Controller.getSomeRandomCat().getName(this, name);
	}
	
}
