package com.techelevator.ssg.model;

public class AlienAge{

private double earthAge;
private String planetName;
private double alienAge;

public AlienAge(double earthAge, String planetName){
	this.earthAge = earthAge;
	this.planetName = planetName;
}

public double calculateAlienAge(){

if (planetName.equalsIgnoreCase("Mercury")){
	alienAge = earthAge * 4.15;
}

else if (planetName.equalsIgnoreCase("Venus")){
	alienAge = earthAge * 1.63;
}

else if (planetName.equalsIgnoreCase("Earth")){
	alienAge = earthAge * 1;
}
else if (planetName.equalsIgnoreCase("Mars")){
	alienAge = earthAge * 0.53;
}
else if (planetName.equalsIgnoreCase("Jupiter")){
	alienAge = earthAge * 0.08;
}
else if (planetName.equalsIgnoreCase("Saturn")){
	alienAge = earthAge * 0.03;
}
else if (planetName.equalsIgnoreCase("Neptune")){
	alienAge = earthAge * 0.012;
}
else if (planetName.equalsIgnoreCase("Uranus")){
	alienAge = earthAge * 0.006;
}
	return alienAge;

}
}