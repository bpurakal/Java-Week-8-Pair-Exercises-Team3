package com.techelevator.ssg.model;

public class AlienWeight {
	
	private double earthWeight;
	private String planetName;
	private double alienWeight;
	
	public AlienWeight(double earthWeight, String planetName) {
		this.earthWeight = earthWeight;
		this.planetName = planetName;
	}
	
	public double calculateAlienWeight() {
		if (planetName.equalsIgnoreCase("Mercury")){
			alienWeight = earthWeight * 0.3;
		}

		else if (planetName.equalsIgnoreCase("Venus")){
			alienWeight = earthWeight * 0.9;
		}

		else if (planetName.equalsIgnoreCase("Earth")){
			alienWeight = earthWeight * 1;
		}
		else if (planetName.equalsIgnoreCase("Mars")){
			alienWeight = earthWeight * 0.4;
		}
		else if (planetName.equalsIgnoreCase("Jupiter")){
			alienWeight = earthWeight * 2.3;
		}
		else if (planetName.equalsIgnoreCase("Saturn")){
			alienWeight = earthWeight * 0.9;
		}
		else if (planetName.equalsIgnoreCase("Neptune")){
			alienWeight = earthWeight * 1.1;
		}
		else if (planetName.equalsIgnoreCase("Uranus")){
			alienWeight = earthWeight * 0.8;
		}
			return alienWeight;
		
	}
	
	
	
}