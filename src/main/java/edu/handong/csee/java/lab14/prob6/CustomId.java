package edu.handong.csee.java.lab14.prob6;

public class CustomId {
	String name, race;//declare instance variable string name and race
	String races[] = new String[]{"Vulcans", "Romulan", "Klingons"};//create array to put existing races to compare input race
	int age, step = 1;//declare instance variable age and step to put state of customizing id and set this to 1
	public void setName(String nameTry) throws Exception { //method to set name
		if(nameTry.length()< 5) {//if length of name is smaller than 5.
			step = 1;//set step to 1 to try this step
			throw new Exception("Your name is short! Try again!"); //throw exception with message to tell user to set name longer
		}
		else {//if not
			this.name = nameTry;//set the name with input name
			System.out.println(" -> Name is valid");//print-out to tell setting this name is Ok
			System.out.println("Name: " + this.name);//show the name
			step=2;//increase step number
		}
	}

	public void setAge(int ageTry) throws Exception {//method to set age
		if(ageTry< 18) {//if age is smaller than 18
			step =2;//set step to 2 to try this step
			throw new Exception("You are too young! Try again!");//throw exception with message to tell user to set age larger
		}
		else {
			this.age = ageTry;//set the age
			System.out.println(" -> Age is valid");//print-out to tell setting this age is Ok
			System.out.println("Age: " + this.age);//show the age
			step=3;//increase step number
		}
	}

	public void setRace(String race) throws Exception{//method to set race
		for(int i = 0; i < 3; i++) 	{//by using loop, compare the race
			if(races[i].equals(race)) {//if user's race is equal to races[i]
				this.race = races[i]; //set race to races[i]
				System.out.println(" -> Race is valid");//print-out to tell setting this race is Ok
				System.out.println("Race: " + races[i]);//show the race
				return;//return to the point which call this method
			}
		}
		throw new Exception("Human! Try again.");//if user's race is not equal to existing races throw this exception
	}

	public int tellStep() {//tell the current step
		return step;//return the step
	}

}
