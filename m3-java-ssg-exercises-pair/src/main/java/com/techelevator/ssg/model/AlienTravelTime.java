package com.techelevator.ssg.model;

public class AlienTravelTime{

private double earthAge;
private String planetName;
private long modeOfTransport;
private String travelAge;

private final static double SPEED_BY_WALKING = 3;
private final static double SPEED_BY_CAR = 100;
private final static double SPEED_BY_BULLET_TRAIN = 200;
private final static double SPEED_BY_BOEING_747 = 570;
private final static double SPEED_BY_CONCORDE = 1350;


public AlienTravelTime(double earthAge, String planetName, long modeOfTransport){
	this.earthAge = earthAge;
	this.planetName = planetName;
	this.modeOfTransport = modeOfTransport;
}

public String modeOfTransportString(long modeOfTransport) {
	if (modeOfTransport == 3) {
		return "Walking";
	} else if (modeOfTransport == 100) {
		return "Car";
	} else if (modeOfTransport == 200) {
		return "Bullet Train";
	} else if (modeOfTransport == 570) {
		return "Boeing 747";
	} else {
		return "Concorde";
	}
}

public double calculateTravelTime(){
	long timeTraveled = 0;
if (planetName.equalsIgnoreCase("Mercury")){
	timeTraveled = (56974146/modeOfTransport)/8760;
}

else if (planetName.equalsIgnoreCase("Venus")){
	timeTraveled = (25724767/modeOfTransport)/8760;
	}

else if (planetName.equalsIgnoreCase("Earth")){
	timeTraveled = 0;
	}
else if (planetName.equalsIgnoreCase("Mars")){
	timeTraveled = (48678219/modeOfTransport)/8760 ;
}
else if (planetName.equalsIgnoreCase("Jupiter")){
	timeTraveled = (390674710/modeOfTransport)/8760 ;
}
else if (planetName.equalsIgnoreCase("Saturn")){
	timeTraveled = (792248270/modeOfTransport)/8760 ;
}
else if (planetName.equalsIgnoreCase("Neptune")){
	timeTraveled = (2703959960L/modeOfTransport)/8760 ;
}
else if (planetName.equalsIgnoreCase("Uranus")){
	timeTraveled = (1692662530/modeOfTransport)/8760 ;
}
	return timeTraveled;

}
}