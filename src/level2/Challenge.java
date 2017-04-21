package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
	goStraight(1500);
	turnLeft(1000);
	goStraight(2000);
	turnRight(1000);
	goStraight(2000);
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

