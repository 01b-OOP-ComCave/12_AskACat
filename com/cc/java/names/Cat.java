package com.cc.java.names;

public class Cat extends Pet{

	private String name;
	
	/**
	 * @param name
	 */
	public Cat(String name) {
		this.name = name;
	}

	// Pet pet möglich, da Cat/Dog SubTypen von Pet sind (Polymorphie)
	public String getName(Pet pet, String callerName) {
		if (Controller.isCallerACat(pet)) {
			if (callerName != name) {
				return "Hi " + callerName + ", my name is " + name + ".";
			} else {
				return "Yes, sometimes you don't know who you are, " + name +".";
			}	
		} else {
			return callerName + " - you are a dog, I'm afraid!";
		}
	}

	@Override
	public String petSounds() {
		return this + " says: Meeeeow!";
	}
	
	// irgendeine Katze nach dem Namen fragen
	public String askACat() {
		return Controller.getSomeRandomCat().getName(this, name);
	}

}
