package edu.handong.csee.java.lab14.prob6;

public class CustomId {
	String name, race;
	String races[] = new String[]{"Vulcans", "Romulan", "Klingons"};
	int age, step = 1;
	public void setName(String nameTry) throws Exception {
		if(nameTry.length()< 5) {
			step = 1;
			throw new Exception("Your name is short! Try again!");
		}
		else {
			this.name = nameTry;
			System.out.println(" -> Name is valid");
			System.out.println("Name: " + this.name);
			step=2;
		}
	}

	public void setAge(int ageTry) throws Exception {
		if(ageTry< 18) {
			step =2;
			throw new Exception("You are too young! Try again!");
		}
		else {
			this.age = ageTry;
			System.out.println(" -> Age is valid");
			System.out.println("Age: " + this.age);
			step=3;
		}
	}

	public void setRace(String race) throws Exception{
		for(int i = 0; i < 3; i++)
		{
			if(races[i].equals(race)) {
				this.race = races[i];
				System.out.println(" -> Race is valid");
				System.out.println("Race: " + races[i]);
				return;
			}
		}
		throw new Exception("Human! Try again.");
	}

	public int tellStep() {
		return step;
	}

}
