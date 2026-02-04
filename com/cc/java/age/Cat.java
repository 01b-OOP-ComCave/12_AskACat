package com.cc.java.age;

public class Cat extends SuperCat{
	
	private int level;

	/**
	 * @param name
	 * 
	 */
	public Cat(String name, String ageStr) {
		super(name, ageStr);
	}
	
	public String tellYourAge(SuperCat felidae) {
		if (felidae instanceof Cat) {
			if (felidae.name != this.name) {
				return this.name + " says: Because you're also a cat, " + felidae.name + " - I'm " + this.ageStr +".";
			} else {
				return "Yes, sometimes you don't know how old you are, " + this.name + ", you are " + this.ageStr +".";
			}
		} else {
			return this.name + " says to " + felidae.name + ": " + this.checkEscalation();
		}
	 }
	
	private String checkEscalation(){
		
		this.level++;
		
		switch (this.level) {
		case 1:
			return "This is an inappropriate question!";
		case 2:
			return "I've already told you!";
		default:
			return "Talk to the hand!";
		}
	}
	

}
