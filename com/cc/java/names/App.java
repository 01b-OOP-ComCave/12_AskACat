package com.cc.java.names;

public class App {
  public static void main(String[] args) {
		
		// Namenslisten --> Arrays
		String [] catNames = {"Grizabella","Alonzo","RumTumTugger","Suzanne"};
		String [] dogNames = {"Fifi","Boo","Cassie","Bonzo"};

		// Init cats ...
		for (int i = 0; i < catNames.length; i++) {
			Controller.addNewCat(catNames[i]);
		} 
		
		// Init dogs ...
		for (int i = 0; i < dogNames.length; i++) {
			Controller.addNewDog(dogNames[i]);
		}

		// output ...
		
		output("--------- Hunde fragen Katzen :-( ----------");
		output(Controller.getSomeRandomDog().askACat());
		output(Controller.getSomeRandomDog().askACat());
		output(Controller.getSomeRandomDog().askACat());
		output(" ");
		
		output("--------- Katzen fragen Katzen :-) ----------");
		output(Controller.getSomeRandomCat().askACat());
		output(Controller.getSomeRandomCat().askACat());
		output(Controller.getSomeRandomCat().askACat());
		output(" ");
		
		output("--------- PetSounds ----------");
		output(Controller.getSomeRandomDog().petSounds());
		output(Controller.getSomeRandomCat().petSounds());

	}

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}
