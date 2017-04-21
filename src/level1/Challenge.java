package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
	//Straight
	driveDirect(500,500);
	sleep(2000);
	//turn
	driveDirect(20,500);
	sleep(700);	
	//straight
	driveDirect(600,600);
	sleep(6000);
	//turn
	driveDirect(50,750);
	sleep(600);
	//straight
	driveDirect(700,700);
	sleep(1000);
	}

	public void loop() {
	
	}
}
