package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot basmbee=new Robot();	
basmbee.setSpeed(400);
basmbee.setPenColor(0,0,255);
basmbee.penDown();
for (int i=0; i<73;i++) {
	basmbee.move(200);
	basmbee.turn(175);
	
}
	}
}
