package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	
	}
	void goStraight(int howLong){
	driveDirect(1000,1000);
	sleep(howLong);
	}
	void turnLeft(int Time){
	driveDirect(300,600);
	sleep(Time);
	}
	void turnRight(int duration){
	driveDirect(600,300);
	sleep(duration);
	}
	public void loop() {
	
	}
}
